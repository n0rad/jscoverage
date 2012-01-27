package net.awired.jscoverage.sample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.awired.jscoverage.instrumentation.JsInstrumentor;

public class JsFileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        OutputStream out = null;
        InputStream in = JsInstrumentor.class.getResourceAsStream("JSCOV.js");
        if (in == null) {
            throw new IOException("input is null");
        }
        try {
            res.setContentType("text/javascript");
            out = res.getOutputStream();
            int c;
            while ((c = in.read()) != -1) { // bad
                out.write(c);
            }
        } catch (IOException err) {
            //ignore
        } finally {
            if (out != null) {
                out.flush();
            }
            if (out != null) {
                out.close();
            }
            in.close();
        }
    }
}
