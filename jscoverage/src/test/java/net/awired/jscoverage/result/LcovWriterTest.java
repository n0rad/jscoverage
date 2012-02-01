package net.awired.jscoverage.result;

import static org.junit.Assert.assertEquals;
import java.io.StringWriter;
import java.util.Arrays;
import org.junit.Test;
import com.google.common.collect.ImmutableMap;

public class LcovWriterTest {

    @Test
    public void should_write_lcov() throws Exception {
        JsRunResult test1 = new JsRunResult();
        JsFileResult fileResult = new JsFileResult();
        fileResult.setFilename("tot42.js");
        fileResult.setLineCovered(ImmutableMap.of(1, 0, 2, 0, 3, 1));
        JsFileResult fileResult2 = new JsFileResult();
        fileResult2.setFilename("genre/style.js");
        fileResult2.setLineCovered(ImmutableMap.of(1, 1, 2, 1, 3, 2));
        test1.setFileResult(Arrays.asList(fileResult, fileResult2));
        StringWriter writer = new StringWriter();

        new LcovWriter().write(writer, test1);

        assertEquals("SF:tot42.js\n" + "DA:1,0\n" + "DA:2,0\n" + "DA:3,1\n" + "end_of_record\n"
                + "SF:genre/style.js\n" + "DA:1,1\n" + "DA:2,1\n" + "DA:3,2\n" + "end_of_record\n", writer.toString());
    }

}
