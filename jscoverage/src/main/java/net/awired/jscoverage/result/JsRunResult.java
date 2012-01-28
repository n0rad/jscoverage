package net.awired.jscoverage.result;

import java.util.ArrayList;
import java.util.List;

public class JsRunResult {

    private String name;
    private List<JsFileResult> fileResults = new ArrayList<JsFileResult>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JsFileResult> getFileResults() {
        return fileResults;
    }

    public void setFileResult(List<JsFileResult> fileResults) {
        this.fileResults = fileResults;
    }

}
