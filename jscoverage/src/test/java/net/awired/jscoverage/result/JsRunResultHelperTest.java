package net.awired.jscoverage.result;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import com.google.common.collect.ImmutableMap;

public class JsRunResultHelperTest {

    @Test
    public void should_aggregate_runs() {
        JsRunResult test1 = new JsRunResult();
        {
            JsFileResult fileResult = new JsFileResult();
            fileResult.setFilename("tot42.js");
            fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 1));
            JsFileResult fileResult2 = new JsFileResult();
            fileResult2.setFilename("genre/style.js");
            fileResult2.setLineCovered(ImmutableMap.of(1, 1, 2, 1, 3, 2));
            test1.setFileResult(Arrays.asList(fileResult, fileResult2));
        }

        JsRunResult test2 = new JsRunResult();
        {
            JsFileResult fileResult = new JsFileResult();
            fileResult.setFilename("tot42.js");
            fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 2));
            JsFileResult fileResult2 = new JsFileResult();
            fileResult2.setFilename("genre/style.js");
            fileResult2.setLineCovered(ImmutableMap.of(1, 5, 2, 1, 3, 1, 6, 1));
            test2.setFileResult(Arrays.asList(fileResult, fileResult2));
        }

        JsRunResult test3 = new JsRunResult();
        {
            JsFileResult fileResult = new JsFileResult();
            fileResult.setFilename("tot43.js");
            fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 2));
            JsFileResult fileResult2 = new JsFileResult();
            fileResult2.setFilename("genre/style.js");
            fileResult2.setLineCovered(ImmutableMap.of(1, 1, 3, 1, 6, 1));
            test3.setFileResult(Arrays.asList(fileResult, fileResult2));
        }

        JsRunResult aggregateRuns = JsRunResultHelper.aggregateRuns("yopla", test1, test2, test3);
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
