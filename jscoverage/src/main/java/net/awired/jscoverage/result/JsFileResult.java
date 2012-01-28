package net.awired.jscoverage.result;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsFileResult {

    private static final Logger LOG = LoggerFactory.getLogger(JsFileResult.class);

    private String filename;
    private Map<Integer, Integer> lineCovered;

    public JsFileResult() {
    }

    public JsFileResult(JsFileResult toCopy) {
        filename = toCopy.filename;
        lineCovered = new HashMap<Integer, Integer>(toCopy.lineCovered);
    }

    public void aggregateFrom(JsFileResult from) {
        if (!filename.equals(from.filename)) {
            LOG.warn("trying to aggregate fileResult with different name : {} and {}", filename, from.filename);
        }

        for (Integer line : from.lineCovered.keySet()) {
            Integer currentValue = lineCovered.get(line);
            lineCovered.put(line, (currentValue == null ? 0 : currentValue) + from.lineCovered.get(line));
        }
    }

    ///////////////////////////////////////

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setLineCovered(Map<Integer, Integer> lineCovered) {
        this.lineCovered = lineCovered;
    }

    public Map<Integer, Integer> getLineCovered() {
        return lineCovered;
    }

}
