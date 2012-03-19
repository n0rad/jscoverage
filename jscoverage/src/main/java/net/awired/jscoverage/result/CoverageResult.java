package net.awired.jscoverage.result;

import java.util.ArrayList;
import java.util.List;

public class CoverageResult {

    private String name;
    private List<FileCoverage> fileResults = new ArrayList<FileCoverage>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileCoverage> getFileResults() {
        return fileResults;
    }

    public void setFileResult(List<FileCoverage> fileResults) {
        this.fileResults = fileResults;
    }

    public double findCoveragePercent() {
        int lines = 0;
        int linesCovered = 0;
        for (FileCoverage fileCoverage : fileResults) {
            lines += fileCoverage.getNumberOfLines();
            linesCovered += fileCoverage.findNumberOfLineCovered();
        }
        if (lines == 0) {
            return 0;
        }
        return (linesCovered * 100) / (double) lines;
    }

}
