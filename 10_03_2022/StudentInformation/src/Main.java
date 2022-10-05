import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Main mainobject = new Main();
        mainobject.initiate();
    }
    void initiate() throws SQLException {
        Scanner sc = new Scanner(System.in);
        StudentController studentobject = new StudentController();
        int user_menu_input;
        System.out.println("Welcome!!!");
        System.out.println("*********Student Attendance Management*********");
        System.out.println("Please enter your username: ");
        String username = sc.next();
        System.out.println("Please enter password: ");
        String password = sc.next();
        while(!studentobject.validateUser(username,password))
        {
            System.out.println("User name and password invalid! Please enter valid username and password to continue;");
            System.out.println("Please enter your username: ");
            username = sc.next();
            System.out.println("Please enter password: ");
            password = sc.next();
        }

        do {
            mainMenu();
            user_menu_input = sc.nextInt();
            switch (user_menu_input)
            {
                case 1: studentobject.addStudent();
                        break;
                case 2: studentobject.deleteStudent();
                        break;
                case 3: updateMenu();
                    int userUpdateMenuInput = sc.nextInt();
                    switch(userUpdateMenuInput)
                    {
                        case 1: studentobject.updateStudentName();
                            break;
                        case 2: studentobject.updateStudentAge();
                            break;
                        case 3: studentobject.updateStudentAddress();
                                break;
                        case 4: studentobject.updateStudentAadhar();
                            break;
                        case 5: studentobject.updateStudentStatus();
                            break;
                        case 6: break;
                        default: System.out.println("Enter a valid value: ");
                    }
                    break;
                case 4: displayMenu();
                        int user_display_menu_input = sc.nextInt();
                        switch (user_display_menu_input)
                        {
                            case 1: studentobject.displayAllStudents();
                                    break;
                            case 2: studentobject.displayActiveStudents();
                                    break;
                            case 3:studentobject.displayInactiveStudents();
                                    break;
                            case 4:break;
                            default: System.out.println("Enter a valid value");
                        }
                    break;
                case 5: studentobject.takeAttendance();
                    break;
                case 6: printReportMenu();
                            int  userReportMenuOption  = sc.nextInt();
                            switch (userReportMenuOption)
                            {
                                case 1: System.out.println("Enter date in format(dd/MM/yyyy): ");
                                        String dateToPrint = sc.next();
                                        studentobject.printDailyReport(dateToPrint);
                                        studentobject.printDailyAttendanceReport(dateToPrint);
                                        break;
                                case 2: studentobject.printMonthlyReport();
                                        break;
                                case 3: break;
                                default: System.out.println("Please enter a valid value!");
                            }
                case 7: break;
                default: System.out.println("Enter a valid value");
            }
        }while(user_menu_input != 7);
    }
    void mainMenu()
    {
        System.out.println("1. Add students");
        System.out.println("2. Delete Students");
        System.out.println("3. Update Students");
        System.out.println("4. Display Students");
        System.out.println("5. Daily Attendance");
        System.out.println("6. Attendance Report");
        System.out.println("7. Exit");
        System.out.println("Please select any option!");
    }
    void displayMenu()
    {
        System.out.println("1. Display All students");
        System.out.println("2. Display Active students");
        System.out.println("3. Display Inactive students");
        System.out.println("4. Back");
        System.out.println("Please select any option!");
    }
    void updateMenu() {
        System.out.println("1. Update Student Name");
        System.out.println("2. Update Student Age");
        System.out.println("3. Update Student Address");
        System.out.println("4. Update Student Aadhar Number");
        System.out.println("5. Update Student Status");
        System.out.println("6. Exit");
        System.out.println("Please select any option!");
    }
    void printReportMenu()
    {
        System.out.println("1. Daily Report");
        System.out.println("2. Monthly Report");
        System.out.println("3. Exit");
    }
}