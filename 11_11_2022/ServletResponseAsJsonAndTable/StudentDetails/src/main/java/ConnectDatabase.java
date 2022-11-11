import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.json.JSONObject;

public class ConnectDatabase {
	Connection connection;
	
	public void database() 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Yogeswari","root","pillayar8*");
			System.out.println("success");
		} catch (SQLException e) {
			System.out.println("failure");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<StudentInformation> getStudentDetails(String StudentID) throws ClassNotFoundException
	{
		 database();
		ArrayList<StudentInformation> studentlist = new ArrayList<StudentInformation>();
		
		PreparedStatement stmt;
		try {
			if(StudentID != "")
			{
				stmt = connection.prepareStatement("select *from StudentInformation where ID = " + StudentID);
			}
			else
			{
				stmt = connection.prepareStatement("select *from StudentInformation");
			}
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				studentlist.add(new StudentInformation(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentlist;	
	}
	public JSONObject getJSONObject(String StudentID) throws ClassNotFoundException
	{
		JSONObject jsonobject = new JSONObject();
		
		PreparedStatement stmt;
		try {
			if(StudentID != "")
			{
				stmt = connection.prepareStatement("select *from StudentInformation where ID = " + StudentID);
			}
			else
			{
				stmt = connection.prepareStatement("select *from StudentInformation");
			}
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				jsonobject.put("ID",rs.getInt(1));
				jsonobject.put("Name",rs.getString(2) + ". " + rs.getString(3));
				jsonobject.put("Age",rs.getString(4));
				jsonobject.put("Address",rs.getString(5));
				jsonobject.put("BloodGroup",rs.getString(6));
				jsonobject.put("Rank",rs.getString(7));				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jsonobject;	
	}
}
