
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/doPage")
public class ServletPage extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out=response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset='UTF-8'>");
        out.print("<title>動態網頁Servlet</title>");
        out.print("</head>");
        out.print("<body text='#ff00ff'>");
        
        String line="";       
        //由小而大
        for(int x=1; x<=6; x++) {
      	  line="<span style=font-size:" + String.valueOf(x) + "cm>" + "Welcome</span>"; 
          out.print(line + "<br>");
        }
        
        out.print("</body>");
        out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
