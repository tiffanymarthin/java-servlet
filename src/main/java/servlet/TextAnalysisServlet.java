package servlet;

import java.net.URL;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(name = "TextAnalysisServlet", urlPatterns = "/textbody/*")
public class TextAnalysisServlet extends HttpServlet {
    private static final Logger logger = LogManager.getLogger(TextAnalysisServlet.class.getName());
    private static final String URL_PARAM = "textbody";

    @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

  }

  private boolean isUrlValid(String[] urlPath) {
        int n = urlPath.length;
        return n == 3 && urlPath[1].equals(URL_PARAM);
  }
}
