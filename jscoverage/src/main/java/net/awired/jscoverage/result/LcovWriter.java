package net.awired.jscoverage.result;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

public class LcovWriter {

    public void write(File file, CoverageResult coverageResult) throws IOException {
        FileWriter out = new FileWriter(file);
        try {
            write(out, coverageResult);
        } finally {
            out.close();
        }
    }

    public void write(Writer out, CoverageResult coverageResult) throws IOException {
        for (FileCoverage fileResult : coverageResult.getFileResults()) {
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
