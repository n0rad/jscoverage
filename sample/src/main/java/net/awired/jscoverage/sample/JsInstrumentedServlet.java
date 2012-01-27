package net.awired.jscoverage.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.awired.jscoverage.instrumentation.JsInstrumentationException;
import net.awired.jscoverage.instrumentation.JsInstrumentedSource;
import net.awired.jscoverage.instrumentation.JsInstrumentor;
import com.google.common.io.CharStreams;
import com.google.common.io.Closeables;

public class JsInstrumentedServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private JsInstrumentor instrumentor;

    @Override
    public void init() throws ServletException {
        instrumentor = new JsInstrumentor();
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String path = req.getRequestURI().substring(req.getContextPath().length());
        String jsfile = path.split("/", 3)[2];
        PrintWriter out = null;
        try {
            out = res.getWriter();
            InputStream resourceAsStream = getServletContext().getResourceAsStream("/js/" + jsfile);
            if (resourceAsStream == null) {
                res.setStatus(404);
                out.print("404 not found");
                return;
            }
            JsInstrumentedSource instrument = instrumentor.instrument(jsfile,
                    CharStreams.toString(new InputStreamReader(resourceAsStream)));
            out.print(instrument.getIntrumentedSource());
        } catch (JsInstrumentationException e) {
            res.setStatus(500);
            out.print("500 internal server error");
        } finally {
            Closeables.closeQuietly(out);
        }
    }
}
