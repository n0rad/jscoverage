package net.awired.jscoverage.result;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileCoverage {

    private static final Logger LOG = LoggerFactory.getLogger(FileCoverage.class);

    private String filename;
    private Map<Integer, Integer> lineCovered = new HashMap<Integer, Integer>();
    private int numberOfLines;

    public FileCoverage() {
    }

    public FileCoverage(FileCoverage toCopy) {
        filename = toCopy.filename;
        lineCovered = new HashMap<Integer, Integer>(toCopy.lineCovered);
        numberOfLines = toCopy.numberOfLines;
    }

    public void aggregateFrom(FileCoverage from) {
        if (filename != null && !filename.equals(from.filename)) {
            LOG.warn("aggregating fileResult with different names : {} and {}", filename, from.filename);
        }

        for (Integer line : from.lineCovered.keySet()) {
            Integer currentValue = lineCovered.get(line);

            lineCovered.put(line, (currentValue == null ? 0 : currentValue) + from.lineCovered.get(line));
        }
    }

    public int findNumberOfLineCovered() {
        int aggregatedlineCovered = 0;
        for (Integer numCalled : lineCovered.values()) {
            if (numCalled > 0) {
                aggregatedlineCovered++;
            }
        }
        return aggregatedlineCovered;
    }

    public double findCoveragePercent() {
        int aggregatedlineCovered = findNumberOfLineCovered();
        return (aggregatedlineCovered * 100) / (double) numberOfLines;
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

    public int getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

}
