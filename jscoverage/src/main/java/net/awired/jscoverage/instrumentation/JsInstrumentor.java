package net.awired.jscoverage.instrumentation;

import java.io.CharArrayReader;
import java.util.List;
import net.awired.jscoverage.instrumentation.es3.ES3InstrumentLexer;
import net.awired.jscoverage.instrumentation.es3.ES3InstrumentParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsInstrumentor {

    public final Logger log = LoggerFactory.getLogger(this.getClass());
    public static final String JSCOV_FILE = "/JSCOV.js";

    private static final char[] TEMPLATE = ("group TestRewrite;\n" //
            + "init_instrument(stmt, hash, name, lines) ::= \"JSCOV_<hash>=" //
            + "JSCOV.initNoop('<name>',<lines>);<stmt>\"" //
            + "instrument(stmt, hash, ln) ::= \"JSCOV_<hash>[<ln>]++; <stmt>\""//
            + "pass(stmt) ::= \"<stmt>\"").toCharArray();

    public JsInstrumentedSource instrument(String fileFullPath, String source) throws JsInstrumentationException {
        JsInstrumentedSource instrumentedSource = new JsInstrumentedSource();
        instrumentedSource.setFileFullPath(fileFullPath);
        instrumentedSource.setSource(source);

        long start = System.currentTimeMillis();
        instrumentCode(instrumentedSource);
        long duration = System.currentTimeMillis() - start;

        instrumentedSource.setDuration(duration);

        log.debug("instrumented source code {} in {}s", fileFullPath, duration / 1000.0);
        return instrumentedSource;
    }

    private void instrumentCode(JsInstrumentedSource instrumentedSource) throws JsInstrumentationException {
        StringTemplateGroup templates = new StringTemplateGroup(new CharArrayReader(TEMPLATE));
        ANTLRStringStream stream = new ANTLRStringStream(instrumentedSource.getSource());
        stream.name = instrumentedSource.getFileFullPath();
        ES3InstrumentLexer lexer = new ES3InstrumentLexer(stream);
        TokenRewriteStream tokens = new TokenRewriteStream(lexer);
        ES3InstrumentParser parser = new ES3InstrumentParser(tokens);
        parser.setTemplateLib(templates);
        try {
            parser.program();
        } catch (Exception e) {
            throw new JsInstrumentationException("cannot instrument source code from file :"
                    + instrumentedSource.getFileFullPath(), e);
        }
        List<Integer> executableLines = parser.linesMap.get(instrumentedSource.getFileFullPath());
        if (executableLines != null) {
            instrumentedSource.setExecutableLines(executableLines);
        }
        instrumentedSource.setIntrumentedSource(tokens.toString());
    }
}
