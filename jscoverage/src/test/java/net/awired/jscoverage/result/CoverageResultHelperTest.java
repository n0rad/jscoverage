package net.awired.jscoverage.result;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import com.google.common.collect.ImmutableMap;

public class CoverageResultHelperTest {

    @Test
    public void should_aggregate_runs() {
        CoverageResult test1 = new CoverageResult();
        {
            FileCoverage fileResult = new FileCoverage();
            fileResult.setFilename("tot42.js");
            fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 1));
            FileCoverage fileResult2 = new FileCoverage();
            fileResult2.setFilename("genre/style.js");
            fileResult2.setLineCovered(ImmutableMap.of(1, 1, 2, 1, 3, 2));
            test1.setFileResult(Arrays.asList(fileResult, fileResult2));
        }

        CoverageResult test2 = new CoverageResult();
        {
            FileCoverage fileResult = new FileCoverage();
            fileResult.setFilename("tot42.js");
            fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 2));
            FileCoverage fileResult2 = new FileCoverage();
            fileResult2.setFilename("genre/style.js");
            fileResult2.setLineCovered(ImmutableMap.of(1, 5, 2, 1, 3, 1, 6, 1));
            test2.setFileResult(Arrays.asList(fileResult, fileResult2));
        }

        CoverageResult test3 = new CoverageResult();
        {
            FileCoverage fileResult = new FileCoverage();
            fileResult.setFilename("tot43.js");
            fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 2));
            FileCoverage fileResult2 = new FileCoverage();
            fileResult2.setFilename("genre/style.js");
            fileResult2.setLineCovered(ImmutableMap.of(1, 1, 3, 1, 6, 1));
            test3.setFileResult(Arrays.asList(fileResult, fileResult2));
        }

        CoverageResult aggregateRuns = CoverageResultHelper.aggregateRuns("yopla", test1, test2, test3);
        assertEquals("yopla", aggregateRuns.getName());
        assertEquals(3, aggregateRuns.getFileResults().size());
        assertEquals("tot42.js", aggregateRuns.getFileResults().get(0).getFilename());
        assertEquals(ImmutableMap.of(1, 0, 2, 0, 3, 3), aggregateRuns.getFileResults().get(0).getLineCovered());
        assertEquals("genre/style.js", aggregateRuns.getFileResults().get(1).getFilename());
        assertEquals(ImmutableMap.of(1, 7, 2, 2, 3, 4, 6, 2), aggregateRuns.getFileResults().get(1).getLineCovered());
        assertEquals("tot43.js", aggregateRuns.getFileResults().get(2).getFilename());
        assertEquals(ImmutableMap.of(1, 0, 2, 0, 3, 2), aggregateRuns.getFileResults().get(2).getLineCovered());
    }
}
