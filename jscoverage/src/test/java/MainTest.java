import java.util.Collections;
import java.util.Set;
import junit.framework.TestCase;
import org.joda.time.Instant;
import com.google.jstestdriver.FileInfo;
import com.google.jstestdriver.Time;
import com.google.jstestdriver.coverage.CodeInstrumentor;
import com.google.jstestdriver.coverage.CoverageAccumulator;
import com.google.jstestdriver.coverage.CoverageInstrumentingProcessor;
import com.google.jstestdriver.coverage.CoverageNameMapper;
import com.google.jstestdriver.coverage.Instrumentor;

/**
 * @author corysmith
 * 
 */
public class MainTest extends TestCase {

    public void test() throws Exception {
        FileInfo fileInfo = new FileInfo("foo.js", 0, -1, true, false, "var a = 1;\n" + "var b = 42;", "foo.js");

        CoverageNameMapper mapper = new CoverageNameMapper();
        Instrumentor decorator = new CodeInstrumentor(mapper);
        Set<String> excludes = Collections.<String> emptySet();
        CoverageAccumulator accumulator = new CoverageAccumulator();
        ;
        final Instant instant = new Instant(System.currentTimeMillis());
        Time time = new Time() {
            public Instant now() {
                return instant;
            }
        };
        CoverageInstrumentingProcessor coverageInstrumentingProcessor = new CoverageInstrumentingProcessor(decorator,
                excludes, accumulator, time);

        FileInfo process = coverageInstrumentingProcessor.process(fileInfo);
        System.out.println(process.getData());
    }
}
