package net.awired.jscoverage.instrumentation;

import java.util.ArrayList;
import java.util.List;

public class JsInstrumentedSource {

    private long duration;
    private String fileFullPath;
    private List<Integer> executableLines = new ArrayList<Integer>();
    private String intrumentedSource;
    private String source;

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getFileFullPath() {
        return fileFullPath;
    }

    public void setFileFullPath(String fileFullPath) {
        this.fileFullPath = fileFullPath;
    }

    public void setExecutableLines(List<Integer> executableLines) {
        this.executableLines = executableLines;
    }

    public List<Integer> getExecutableLines() {
        return executableLines;
    }

    public void setIntrumentedSource(String intrumentedSource) {
        this.intrumentedSource = intrumentedSource;
    }

    public String getIntrumentedSource() {
        return intrumentedSource;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
