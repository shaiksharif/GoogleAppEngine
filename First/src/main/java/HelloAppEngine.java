import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");
    System.out.println("request URL"+request.getRequestURL());
    System.out.println("request URI "+request.getRequestURI());
    System.out.println("schema"+request.getScheme());
    System.out.println("server"+request.getServerName());
    System.out.println("Port"+request.getServerPort());
    

    response.getWriter().print("Hello App Engine!\r\n");

  }
}