package net.awired.jscoverage.result;

import java.util.List;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public class CoverageResultHelper {

    public static CoverageResult aggregateRuns(String name, CoverageResult... results) {
        CoverageResult res = new CoverageResult();
        res.setName(name);
        for (CoverageResult currentResult : results) {
            if (currentResult != null && currentResult.getFileResults() != null) {
                for (FileCoverage currentFileResult : currentResult.getFileResults()) {
                    int alreadyInIndex = findIndexOfFileResultForName(res.getFileResults(),
                            currentFileResult.getFilename());
                    if (alreadyInIndex == -1) {
                        res.getFileResults().add(new FileCoverage(currentFileResult));
                    } else {
                        res.getFileResults().get(alreadyInIndex).aggregateFrom(currentFileResult);
                    }
                }

            }
        }
        return res;
    }

    private static int findIndexOfFileResultForName(List<FileCoverage> jsFileResults, String name) {
        Preconditions.checkNotNull(name, "name is mandatory");
        final String currentName = name.intern();
        return Iterables.indexOf(jsFileResults, new Predicate<FileCoverage>() {
            @Override
            public boolean apply(FileCoverage fileResult) {
                Preconditions.checkNotNull(fileResult.getFilename(), "name is mandatory");
                return fileResult.getFilename().intern() == currentName;
            }
        });
    }
}
