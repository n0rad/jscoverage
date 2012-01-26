package net.awired.jscoverage;

import static org.junit.Assert.assertEquals;
import net.awired.jscoverage.instrumentation.JsInstrumentedSource;
import net.awired.jscoverage.instrumentation.JsInstrumentor;
import org.junit.Test;

public class JsInstrumentorTest {

    @Test
    public void should_instrument_simple_code() throws Exception {
        String source = "var a = 1;\n" + "var b = 42;";
        JsInstrumentor jsInstrumentor = new JsInstrumentor();

        JsInstrumentedSource instrument = jsInstrumentor.instrument("genre/style/ouda.js", source);

        assertEquals("LCOV_laf5iu=LCOV.initNoop('genre/style/ouda.js',0,[1, 2]);LCOV_laf5iu[1]++; var a = 1;\n"
                + "LCOV_laf5iu[2]++; var b = 42;", instrument.getIntrumentedSource());
    }
}
