import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentController {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentAttendance","root","pillayar8*");
    PreparedStatement stmt,stmtnew;
    Scanner sc = new Scanner(System.in);

    StudentController() throws SQLException {    }

    void displayAllStudents() throws SQLException {
    stmt = con.prepareStatement("select *from StudentInformation");
    ResultSet rs = stmt.executeQuery();
    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Roll Number","StudentName","Age","Address","AadharNumber","StudentStatus");
    while(rs.next())
    {
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",rs.getString(1),rs.getString(2)+" "+rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
    }
}
    void displayActiveStudents() throws SQLException {
        stmt = con.prepareStatement("select *from StudentInformation where StudentStatus = \"Active\"");
        ResultSet rs = stmt.executeQuery();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Roll Number","StudentName","Age","Address","AadharNumber","StudentStatus");
        while(rs.next())
        {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",rs.getString(1),rs.getString(2) +" "+rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
        }
    }
    void displayInactiveStudents() throws SQLException {
        stmt = con.prepareStatement("select *from StudentInformation where StudentStatus = \"Inactive\"");
        ResultSet rs = stmt.executeQuery();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Roll Number","StudentName","Age","Address","AadharNumber","StudentStatus");
        while(rs.next())
        {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n",rs.getString(1),rs.getString(2)+" "+rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
        }
    }
void addStudent() throws SQLException {
    String tempStudentFirstName,tempStudentLastName,tempAddress,tempAadharNumber,tempStudentStatus;
    int tempStudentAge;
    System.out.println("Enter Student First Name: ");
    tempStudentFirstName = sc.next();
    System.out.println("Enter Student Last Name: ");
    tempStudentLastName = sc.next();
    System.out.println("Enter Student Address: ");
    tempAddress = sc.next();
    System.out.println("Enter Student Age: ");
    tempStudentAge = sc.nextInt();
    sc.nextLine(); //To avoid Scanner nextLine() problem
    System.out.println("Enter Student Aadhar Number: ");
    tempAadharNumber = sc.nextLine();

    stmt = con.prepareStatement("insert into StudentInformation(FirstName,LastName,Age,Address,AadharNumber,StudentStatus) values('"+tempStudentFirstName+"','" + tempStudentLastName +"'," + tempStudentAge+",'" + tempAddress+"','" + tempAadharNumber + "','Active')");
    stmt.executeUpdate();
    System.out.println("Added successfully");
    }
    void deleteStudent() throws SQLException
    {
        int rollNumberToDelete;
        System.out.println("Enter Student Roll Number: ");
        rollNumberToDelete = sc.nextInt();
        stmt = con.prepareStatement("delete from StudentInformation where RollNumber = " + rollNumberToDelete);
        stmt.executeUpdate();
        System.out.println("Deleted successfully");
    }
    void updateStudentName() throws SQLException
    {
        System.out.println("Enter Student Roll Number: ");
        int rollNumberToUpdate = sc.nextInt();
        System.out.println("Enter Student First Name to update: ");
        String studentFirstNameToUpdate = sc.next();
        System.out.println("Enter Student Last Name to update: ");
        String studentLastNameToUpdate = sc.next();
        stmt = con.prepareStatement("update StudentInformation set FirstName = '"+studentFirstNameToUpdate+"',LastName = '"+ studentLastNameToUpdate+ "' where RollNumber = " + rollNumberToUpdate);
        stmt.executeUpdate();
        System.out.println("Student Name updated successfully");
    }
    void updateStudentAge() throws SQLException
    {
        System.out.println("Enter Student Roll Number: ");
        int rollNumberToUpdate = sc.nextInt();
        System.out.println("Enter Student age to update: ");
        int studentAgeToUpdate = sc.nextInt();
        stmt = con.prepareStatement("update StudentInformation set Age = "+studentAgeToUpdate + " where RollNumber = " + rollNumberToUpdate);
        stmt.executeUpdate();
        System.out.println("Student Age updated successfully");
    }
    void updateStudentAddress() throws SQLException
    {
        System.out.println("Enter Student Roll Number: ");
        int rollNumberToUpdate = sc.nextInt();
        System.out.println("Enter Student address to update: ");
        String studentAddressToUpdate = sc.next();
        stmt = con.prepareStatement("update StudentInformation set Address = '"+ studentAddressToUpdate + "' where RollNumber = " + rollNumberToUpdate);
        stmt.executeUpdate();
        System.out.println("Student Address updated successfully");
    }
    void updateStudentAadhar() throws SQLException
    {
        System.out.println("Enter Student Roll Number: ");
        int rollNumberToUpdate = sc.nextInt();
        sc.nextLine(); /* To avoid scanner skipping nextLine problem */
        System.out.println("Enter Student aadhar number to update: ");
        String studentAadharToUpdate = sc.nextLine();
        stmt = con.prepareStatement("update StudentInformation set AadharNumber = '"+ studentAadharToUpdate + "' where RollNumber = " + rollNumberToUpdate);
        stmt.executeUpdate();
        System.out.println("Student Aadhar Number updated successfully");
    }
    void updateStudentStatus() throws SQLException
    {
        System.out.println("Enter Student Roll Number: ");
        int rollNumberToUpdate = sc.nextInt();
        System.out.println("Enter Student status to update: ");
        String studentStatusToUpdate = sc.next();
        stmt = con.prepareStatement("update StudentInformation set StudentStatus = "+ studentStatusToUpdate + " where RollNumber = " + rollNumberToUpdate);
        stmt.executeUpdate();
        System.out.println("Student Status updated successfully");
    }
    void takeAttendance() throws SQLException
    {
        System.out.println("Enter today date:");
        String attdate = sc.next();
        stmt = con.prepareStatement("select RollNumber,concat(FirstName,\" \",LastName) as Name from StudentInformation where StudentStatus = \"Active\"");
        ResultSet rs = stmt.executeQuery();
        System.out.println("Present(1) or Absent(0): Press 1 or 0");
        while(rs.next())
        {
            System.out.println("Roll Number - Name : "  + rs.getString(1) + " - " + rs.getString(2));
            int temppresent = sc.nextInt();
            while(!isValid(temppresent))
            {
                System.out.println("Invalid! Please enter 1 or 0:");
                temppresent = sc.nextInt();
            }
            stmtnew = con.prepareStatement("insert into StudentAttendance values('"+ attdate +"',"+ rs.getString(1) +","+ temppresent+")");
            stmtnew.executeUpdate();
        }
        System.out.println("Today Attendance taken successfully");
        printDailyAttendanceReport(attdate);
    }
    void printDailyAttendanceReport(String attendanceDate) throws SQLException
    {
        stmt = con.prepareStatement("select count(1) from StudentInformation where StudentStatus = 'Active'");
        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
            System.out.println("Total Number of active students: " + rs.getString(1));
        }
       stmt = con.prepareStatement("select count(*) from StudentAttendance where AttDate = '" + attendanceDate + "' and PresentOrAbsent  = 1");
       rs = stmt.executeQuery();
       while(rs.next()) {
           System.out.println("Number of present: " + rs.getString(1));
       }
       stmt = con.prepareStatement("select count(*) from StudentAttendance where AttDate = '" + attendanceDate + "' and PresentOrAbsent  = 0");
       rs = stmt.executeQuery();
       while(rs.next()) {
           System.out.println("Number of absent: " + rs.getString(1));
       }
    }
    void printDailyReport(String dateToPrint) throws SQLException
    {
        stmt = con.prepareStatement("select info.RollNumber, concat(info.FirstName,\" \",info.LastName) as StudentName,PresentOrAbsent from StudentInformation info inner join StudentAttendance att\n" +
                "on info.RollNumber = att.RollNumber and info.StudentStatus = 'Active' and att.AttDate = '"+dateToPrint + "'");
        ResultSet rs = stmt.executeQuery();
        System.out.printf("%-20s%-20s%-20s\n","Roll Number","Student Name","Present(/)/Absent(X)");
        while(rs.next())
        {
            System.out.printf("%-20s%-20s%-20s\n",rs.getString(1),rs.getString(2),rs.getString(3).equals("1") ? "/" : "X");
        }
    }
    void printMonthlyReport() throws SQLException {
        LinkedHashMap<String,String> lowattendance = new LinkedHashMap<>();
        stmt = con.prepareStatement("select sa.RollNumber,concat(si.FirstName,\" \",si.LastName) as StuName,sum(1) as TotalDays,sum(PresentOrAbsent) as NumberOfDaysPresent,ceil((sum(PresentOrAbsent)/sum(1))*100) as '%' from studentattendance sa left outer join StudentInformation si on sa.RollNumber = si.RollNumber and si.StudentStatus = 'Active' group by RollNumber");
        ResultSet rs = stmt.executeQuery();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","RollNumber","Student Name","TotalDays","NumberOfDaysPresent","Percentage of Presence");
        while (rs.next()) {
            if(rs.getString(5).compareTo("50") <= 0)
                        lowattendance.put(rs.getString(1), rs.getString(2));
                System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)+"%");
        }
        System.out.println("Students having low attendance (less than or equal to 50%)");
        System.out.printf("%-20s%-20s\n","RollNumber","Student Name");
        for(Map.Entry<String,String> map : lowattendance.entrySet())
        {
            System.out.printf("%-20s%-20s\n",map.getKey(),map.getValue());
        }
    }
    boolean isValid(int input)
    {
    boolean result = false;
    if(input == 0 || input == 1)
    {
        result = true;
    }
    return result;
    }
    boolean validateUser(String username,String password)
    {
        if(username.compareTo("teacher") == 0 && password.compareTo("teacher") == 0)
            return true;
        else
            return false;
    }
}