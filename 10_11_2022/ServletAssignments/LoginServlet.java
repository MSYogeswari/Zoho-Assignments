import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("username");
		String pwd = request.getParameter("password");
		if(name.compareTo("user") == 0 && pwd.compareTo("user123") == 0)
		{
			Date currentdate = new Date();
			pw.println("Welcome " + request.getParameter("username")+"!" );
			pw.println("Current Date and Time: " + currentdate.toString());
		}
		else
		{
		pw.println("Invalid credentials!!");
		}
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
