package net.awired.jscoverage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.awired.jscoverage.result.CoverageResult;
import net.awired.jscoverage.result.CoverageResultHelper;
import net.awired.jscoverage.result.LcovWriter;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class JsResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        TypeReference<List<CoverageResult>> typeRef = new TypeReference<List<CoverageResult>>() {
        };
        List<CoverageResult> runResults = mapper.readValue(req.getInputStream(), typeRef);

        CoverageResult aggregated = CoverageResultHelper.aggregateRuns("aggregated",
                runResults.toArray(new CoverageResult[runResults.size()]));

        PrintWriter writer = resp.getWriter();
        new LcovWriter().write(writer, aggregated);
        writer.close();
    }
}
