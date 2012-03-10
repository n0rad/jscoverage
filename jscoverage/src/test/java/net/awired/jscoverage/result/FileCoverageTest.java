package net.awired.jscoverage.result;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;
import com.google.common.collect.ImmutableMap;

public class FileCoverageTest {

    @Test
    public void should_aggregate_for_no_equivalent_target() {
        FileCoverage fileResult = new FileCoverage();
        fileResult.setFilename("tot42.js");
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 1));
        FileCoverage res = new FileCoverage();

        res.aggregateFrom(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 2, 0, 3, 1), res.getLineCovered());
    }

    @Test
    public void should_aggregate_for_equivalent() {
        FileCoverage fileResult = new FileCoverage();
        fileResult.setFilename("tot42.js");
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 1));
        FileCoverage res = new FileCoverage();
        res.setLineCovered(new HashMap(ImmutableMap.of(1, 0, 2, 0, 3, 1)));

        res.aggregateFrom(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 2, 0, 3, 2), res.getLineCovered());
    }

    @Test
    public void should_aggregate_for_equivalent_and_not_exist() {
        FileCoverage fileResult = new FileCoverage();
        fileResult.setFilename("tot42.js");
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 3, 1));
        FileCoverage res = new FileCoverage();
        res.setLineCovered(new HashMap(ImmutableMap.of(1, 0, 3, 1, 4, 2)));

        res.aggregateFrom(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 3, 2, 4, 2), res.getLineCovered());
    }

    @Test
    public void should_create_from_other() {
        FileCoverage fileResult = new FileCoverage();
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 3, 2, 4, 2));
        fileResult.setFilename("genre.js");

        FileCoverage res = new FileCoverage(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 3, 2, 4, 2), res.getLineCovered());
        assertEquals("genre.js", res.getFilename());
    }

    @Test
    public void should_find_coverage() {
        FileCoverage fileResult = new FileCoverage();
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 3, 2, 4, 2));
        fileResult.setNumberOfLines(10);
        fileResult.setFilename("genre.js");

        FileCoverage res = new FileCoverage(fileResult);

        assertEquals(20, res.findCoveragePercent(), 1);
        assertEquals(ImmutableMap.of(1, 0, 3, 2, 4, 2), res.getLineCovered());
        assertEquals("genre.js", res.getFilename());
    }

    @Test
    public void should_find_lines_covered() {
        FileCoverage fileResult = new FileCoverage();
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 3, 2, 4, 2));
        fileResult.setNumberOfLines(10);
        fileResult.setFilename("genre.js");

        int findNumberOfLineCovered = fileResult.findNumberOfLineCovered();

        assertEquals(2, findNumberOfLineCovered);
    }
}
