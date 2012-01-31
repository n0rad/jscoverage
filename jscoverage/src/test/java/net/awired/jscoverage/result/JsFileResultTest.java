package net.awired.jscoverage.result;

import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import org.junit.Test;
import com.google.common.collect.ImmutableMap;

public class JsFileResultTest {

    @Test
    public void should_aggregate_for_no_equivalent_target() {
        JsFileResult fileResult = new JsFileResult();
        fileResult.setFilename("tot42.js");
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 1));
        JsFileResult res = new JsFileResult();

        res.aggregateFrom(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 2, 0, 3, 1), res.getLineCovered());
    }

    @Test
    public void should_aggregate_for_equivalent() {
        JsFileResult fileResult = new JsFileResult();
        fileResult.setFilename("tot42.js");
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 1));
        JsFileResult res = new JsFileResult();
        res.setLineCovered(new HashMap(ImmutableMap.of(1, 0, 2, 0, 3, 1)));

        res.aggregateFrom(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 2, 0, 3, 2), res.getLineCovered());
    }

    @Test
    public void should_aggregate_for_equivalent_and_not_exist() {
        JsFileResult fileResult = new JsFileResult();
        fileResult.setFilename("tot42.js");
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 3, 1));
        JsFileResult res = new JsFileResult();
        res.setLineCovered(new HashMap(ImmutableMap.of(1, 0, 3, 1, 4, 2)));

        res.aggregateFrom(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 3, 2, 4, 2), res.getLineCovered());
    }

    @Test
    public void should_create_from_other() {
        JsFileResult fileResult = new JsFileResult();
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 3, 2, 4, 2));
        fileResult.setFilename("genre.js");

        JsFileResult res = new JsFileResult(fileResult);

        assertEquals(ImmutableMap.of(1, 0, 3, 2, 4, 2), res.getLineCovered());
        assertEquals("genre.js", res.getFilename());
    }
}
