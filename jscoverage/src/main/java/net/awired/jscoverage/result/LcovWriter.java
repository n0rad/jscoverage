package net.awired.jscoverage.result;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class LcovWriter {

    public void write(File file, JsRunResult jsRunResult) throws IOException {
        FileWriter out = new FileWriter(file);
        try {
            write(out, jsRunResult);
        } finally {
            out.close();
        }
    }

    public void write(Writer out, JsRunResult jsRunResult) throws IOException {
        for (JsFileResult fileResult : jsRunResult.getFileResults()) {
            out.append("SF:").append(fileResult.getFilename()).append("\n");
            Map<Integer, Integer> lineCovered = fileResult.getLineCovered();
            for (Integer line : lineCovered.keySet()) {
                out.append("DA:").append(String.valueOf(line)).append(",")
                        .append(String.valueOf(lineCovered.get(line))).append("\n");
            }
            out.append("end_of_record\n");
        }
    }

}
