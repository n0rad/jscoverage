package net.awired.jscoverage.result;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

public class CoverageResultTest {

    @Test
    public void should_find_coverage() {
        FileCoverage file1 = new FileCoverage();
        file1.setNumberOfLines(5);
        file1.setLineCovered(ImmutableMap.of(4, 0, 6, 4, 8, 3));
        FileCoverage file2 = new FileCoverage();
        file2.setNumberOfLines(10);
        file2.setLineCovered(ImmutableMap.of(4, 1, 6, 4, 8, 3, 15, 0));

        CoverageResult result = new CoverageResult();
        result.setFileResult(Lists.newArrayList(file1, file2));

        double findCoveragePercent = result.findCoveragePercent();
        assertEquals(33.3, findCoveragePercent, 0.1);
    }

}
