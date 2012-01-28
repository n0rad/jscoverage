package net.awired.jscoverage.result;

import java.util.List;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class JsRunResultHelper {

    public static JsRunResult aggregateRuns(String name, JsRunResult... results) {
        JsRunResult res = new JsRunResult();
        res.setName(name);
        for (JsRunResult currentResult : results) {
            if (currentResult != null && currentResult.getFileResults() != null) {
                for (JsFileResult currentFileResult : currentResult.getFileResults()) {
                    int alreadyInIndex = findIndefOfFileResultForName(res.getFileResults(),
                            currentFileResult.getFilename());
                    if (alreadyInIndex == -1) {
                        res.getFileResults().add(new JsFileResult(currentFileResult));
                    } else {
                        res.getFileResults().get(alreadyInIndex).aggregateFrom(currentFileResult);
                    }
                }

            }
        }
        return res;
    }

    private static int findIndefOfFileResultForName(List<JsFileResult> jsFileResults, String name) {
        final String currentName = name.intern();
        return Iterables.indexOf(jsFileResults, new Predicate<JsFileResult>() {
            @Override
            public boolean apply(JsFileResult fileResult) {
                return fileResult.getFilename().intern() == currentName;
            }
        });
    }
}
