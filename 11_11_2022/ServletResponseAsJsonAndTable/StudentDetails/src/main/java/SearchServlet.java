
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchServlet() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		ConnectDatabase databaseobject = new ConnectDatabase();
		ArrayList<StudentInformation> result = null;

		result = databaseobject.getStudentDetails(request.getParameter("studentid"));
		PrintWriter pw = response.getWriter();
		
		pw.append("<h2> Student Details as JSON </h3>\n");
		pw.append(databaseobject.getJSONObject(request.getParameter("studentid")).toString());
		
		pw.append("<h2> Student Details as TABLE </h3>\n");
		pw.append("<table border=\"1\"><tr><td>ID</td> <td>Name</td><td>Age</td><td>Address</td><td>BloodGroup</td><td>Rank</td></tr>");
		for(StudentInformation student : result)
		{
			pw.append("<tr><td>" + student.getID() + "</td><td>" +student.getLastName() +". " + student.getFirstName() + "</td><td>" + student.getAge() + "</td><td>" +student.getAddress() + "</td><td>" + student.getBloodGroup() + "</td><td>" +student.getExamRank() + "</tr>");		
		}
		pw.append(" </table\");");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
