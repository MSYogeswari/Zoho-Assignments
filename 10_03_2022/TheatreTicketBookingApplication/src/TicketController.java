import java.util.ArrayList;
import java.util.Scanner;

class TicketController {
    ArrayList<TicketInformation> show1 = new ArrayList<>(100);
    ArrayList<TicketInformation> show2 = new ArrayList<>(100);
    ArrayList<TicketInformation> show3 = new ArrayList<>(100);
    ArrayList<TicketInformation> show4 = new ArrayList<>(100);
    Scanner scobj = new Scanner(System.in);
    static int show1Total = 100, show2Total = 100, show3Total = 100, show4Total = 100;

    TicketController() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1)
                    show1.add(new TicketInformation("show1", "A" + j, true));
                else if (i == 2)
                    show1.add(new TicketInformation("show1", "B" + j, true));
                else if (i == 3)
                    show1.add(new TicketInformation("show1", "C" + j, true));
                else if (i == 4)
                    show1.add(new TicketInformation("show1", "D" + j, true));
                else if (i == 5)
                    show1.add(new TicketInformation("show1", "E" + j, true));
                else if (i == 6)
                    show1.add(new TicketInformation("show1", "F" + j, true));
                else if (i == 7)
                    show1.add(new TicketInformation("show1", "G" + j, true));
                else if (i == 8)
                    show1.add(new TicketInformation("show1", "H" + j, true));
                else if (i == 9)
                    show1.add(new TicketInformation("show1", "I" + j, true));
                else if (i == 10)
                    show1.add(new TicketInformation("show1", "J" + j, true));
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1)
                    show2.add(new TicketInformation("show2", "A" + j, true));
                else if (i == 2)
                    show2.add(new TicketInformation("show2", "B" + j, true));
                else if (i == 3)
                    show2.add(new TicketInformation("show2", "C" + j, true));
                else if (i == 4)
                    show2.add(new TicketInformation("show2", "D" + j, true));
                else if (i == 5)
                    show2.add(new TicketInformation("show2", "E" + j, true));
                else if (i == 6)
                    show2.add(new TicketInformation("show2", "F" + j, true));
                else if (i == 7)
                    show2.add(new TicketInformation("show2", "G" + j, true));
                else if (i == 8)
                    show2.add(new TicketInformation("show2", "H" + j, true));
                else if (i == 9)
                    show2.add(new TicketInformation("show2", "I" + j, true));
                else if (i == 10)
                    show2.add(new TicketInformation("show2", "J" + j, true));
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1)
                    show3.add(new TicketInformation("show3", "A" + j, true));
                else if (i == 2)
                    show3.add(new TicketInformation("show3", "B" + j, true));
                else if (i == 3)
                    show3.add(new TicketInformation("show3", "C" + j, true));
                else if (i == 4)
                    show3.add(new TicketInformation("show3", "D" + j, true));
                else if (i == 5)
                    show3.add(new TicketInformation("show3", "E" + j, true));
                else if (i == 6)
                    show3.add(new TicketInformation("show3", "F" + j, true));
                else if (i == 7)
                    show3.add(new TicketInformation("show3", "G" + j, true));
                else if (i == 8)
                    show3.add(new TicketInformation("show3", "H" + j, true));
                else if (i == 9)
                    show3.add(new TicketInformation("show3", "I" + j, true));
                else if (i == 10)
                    show3.add(new TicketInformation("show3", "J" + j, true));
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1)
                    show4.add(new TicketInformation("show4", "A" + j, true));
                else if (i == 2)
                    show4.add(new TicketInformation("show4", "B" + j, true));
                else if (i == 3)
                    show4.add(new TicketInformation("show4", "C" + j, true));
                else if (i == 4)
                    show4.add(new TicketInformation("show4", "D" + j, true));
                else if (i == 5)
                    show4.add(new TicketInformation("show4", "E" + j, true));
                else if (i == 6)
                    show4.add(new TicketInformation("show4", "F" + j, true));
                else if (i == 7)
                    show4.add(new TicketInformation("show4", "G" + j, true));
                else if (i == 8)
                    show4.add(new TicketInformation("show4", "H" + j, true));
                else if (i == 9)
                    show4.add(new TicketInformation("show4", "I" + j, true));
                else if (i == 10)
                    show4.add(new TicketInformation("show4", "J" + j, true));
            }
        }
    }

    void displayMenu() {
        System.out.println("Displaying Shows. Please select any show: ");
        System.out.println("1. 08.30 AM \n2. 12.30 PM \n3. 04.30 PM \n4. 08.30 PM\n5. Exit");
    }

    void displayShowMenu() {
        System.out.println("1. Show seats");
        System.out.println("2. Book tickets");
        System.out.println("3. Cancel tickets");
        System.out.println("4. Exit");
    }

    void showAvailableSeats(String showNumber) {
        if (showNumber.compareTo("show1") == 0) {
            System.out.print("Number of available seats: " + show1Total );
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0)
                    System.out.println();
                if(show1.get(i).isBooked() == true)
                    System.out.print(show1.get(i).getSeatNumber() + "  ");
                else
                    System.out.print( "*   ");
            }
            System.out.println();
        } else if (showNumber.compareTo("show2") == 0) {
            System.out.print("Number of available seats: " + show2Total );
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0)
                    System.out.println();
                if(show2.get(i).isBooked() == true)
                    System.out.print(show2.get(i).getSeatNumber() + "  ");
                else
                    System.out.print( "*   ");
            }
            System.out.println();
        } else if (showNumber.compareTo("show3") == 0) {
            System.out.print("Number of available seats: " + show3Total );
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0)
                    System.out.println();
                if(show3.get(i).isBooked() == true)
                    System.out.print(show3.get(i).getSeatNumber() + "  ");
                else
                    System.out.print( "*   ");
            }
            System.out.println();
        } else if (showNumber.compareTo("show4") == 0) {
            System.out.print("Number of available seats: " + show4Total );
            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0)
                    System.out.println();
                if(show4.get(i).isBooked() == true)
                    System.out.print(show4.get(i).getSeatNumber() + "  ");
                else
                    System.out.print( "*   ");
            }
            System.out.println();
        }
    }
    void bookTickets(String showname) {
        System.out.println("Enter number of tickets to book");
        int noOfTickets = scobj.nextInt();
        if (showname == "show1") {
            String SeatNameToPrint = "";
            for (int k = 1; k <= noOfTickets; k++) {
                System.out.println("Enter seat number");
                String seatname = scobj.next();
                while(!isSeatBooked("show1",seatname))
                {
                    System.out.println("Ticket already booked! Please enter any other available seat number: ");
                    seatname = scobj.next();
                }
                SeatNameToPrint = SeatNameToPrint.equals("")? seatname : SeatNameToPrint +","+ seatname ;
                for (int l = 0; l < 100; l++) {
                    if (show1.get(l).getSeatNumber().equals(seatname)) {
                        show1.get(l).setBooked(false);
                    }
                }
            }
            show1Total = show1Total - noOfTickets;
            printTicket(noOfTickets,SeatNameToPrint,showname);
        }
        if (showname == "show2") {
            String SeatNameToPrint = "";
            for (int k = 1; k <= noOfTickets; k++) {
                System.out.println("Enter seat number");
                String seatname = scobj.next();
                while(!isSeatBooked("show2",seatname))
                {
                    System.out.println("Ticket already booked! Please enter any other available seat number: ");
                    seatname = scobj.next();
                }
                SeatNameToPrint = SeatNameToPrint.equals("")? seatname : SeatNameToPrint +","+ seatname ;
                for (int l = 0; l < 100; l++) {
                    if (show2.get(l).getSeatNumber().equals(seatname)) {
                        show2.get(l).setBooked(false);
                    }
                }
            }
            show2Total = show2Total - noOfTickets;
            printTicket(noOfTickets,SeatNameToPrint,showname);
        }
        if (showname == "show3") {
            String SeatNameToPrint = "";
            for (int k = 1; k <= noOfTickets; k++) {
                System.out.println("Enter seat number");
                String seatname = scobj.next();
                while(!isSeatBooked("show3",seatname))
                {
                    System.out.println("Ticket already booked! Please enter any other available seat number: ");
                    seatname = scobj.next();
                }
                SeatNameToPrint = SeatNameToPrint.equals("")? seatname : SeatNameToPrint +","+ seatname ;
                for (int l = 0; l < 100; l++) {
                    if (show3.get(l).getSeatNumber().equals(seatname)) {
                        show3.get(l).setBooked(false);
                    }
                }
            }
            show3Total = show3Total - noOfTickets;
            printTicket(noOfTickets,SeatNameToPrint,showname);
        }
        if (showname == "show4") {
            String SeatNameToPrint = "";
            for (int k = 1; k <= noOfTickets; k++) {
                System.out.println("Enter seat number");
                String seatname = scobj.next();
                while(!isSeatBooked("show4",seatname))
                {
                    System.out.println("Ticket already booked! Please enter any other available seat number: ");
                    seatname = scobj.next();
                }
                SeatNameToPrint = SeatNameToPrint.equals("")? seatname : SeatNameToPrint +","+ seatname ;
                for (int l = 0; l < 100; l++) {
                    if (show4.get(l).getSeatNumber().equals(seatname)) {
                        show4.get(l).setBooked(false);
                    }
                }
            }
            show4Total = show4Total - noOfTickets;
            printTicket(noOfTickets,SeatNameToPrint,showname);
        }
    }
    boolean isSeatBooked(String showname, String seatname) {
        boolean bookresult = false;
        if (showname == "show1") {
            for (int i = 0; i < 100; i++) {
                if (show1.get(i).getSeatNumber().compareTo(seatname) == 0 && show1.get(i).isBooked() == true) {
                    bookresult = true;
                }
            }
        }
        if (showname == "show2") {
            for (int i = 0; i < 100; i++) {
                if (show2.get(i).getSeatNumber().compareTo(seatname) == 0 && show2.get(i).isBooked() == true) {
                    bookresult = true;
                }
            }
        }
        if (showname == "show3") {
            for (int i = 0; i < 100; i++) {
                if (show3.get(i).getSeatNumber().compareTo(seatname) == 0  && show3.get(i).isBooked() == true) {
                    bookresult = true;
                }
            }
        }
        if (showname == "show4") {
            for (int i = 0; i < 100; i++) {
                if (show4.get(i).getSeatNumber().compareTo(seatname) == 0  && show4.get(i).isBooked() == true) {
                    bookresult = true;
                }
            }
        }
        return bookresult;
    }
    void printTicket(int noOfTickets, String seatNameToPrint,String showName) {
        System.out.println("Enter your mobile number: ");
        String mobileNumber = scobj.next();
        System.out.println("-----------------------------Theatre Ticket-----------------------------");
        System.out.println("------------------------Ponniyin Selvan-Part 1--------------------------");
        System.out.print("------------------------------------------------------------------------\n");
        System.out.printf("%-20s%-20s\n","SCREEN","1");
        System.out.printf("%-20s%-20s\n","SHOW",showName);
        System.out.printf("%-20s%-20s\n","NO OF SEATS",noOfTickets);
        System.out.printf("%-20s%-20s\n","SEAT NAMES",seatNameToPrint);
        System.out.printf("%-20s%-20s\n","PRICE PER TICKET","Rs.120");
        System.out.print("------------------------------------------------------------------------\n");
        System.out.printf("%-20s%-20s%-20s%-20s\n","MOBILE NUMBER",mobileNumber,"TOTAL PRICE","Rs." +(noOfTickets*120));
        System.out.print("------------------------------------------------------------------------\n");
        System.out.println("Please pay Rs." + (noOfTickets*120)+" to continue....");
        System.out.println("***********************THANK YOU! COME AGAIN!*************************");
    }

    void cancelTickets(String showName)
    {
        if(showName == "show1")
        {
            System.out.println("Enter the number of tickets to be cancelled: ");
            int noOfTicketsCancel = scobj.nextInt();
            for(int i=1;i<=noOfTicketsCancel;i++)
            {
                System.out.println("Enter seat number to cancel:");
                String seatNameToCancel = scobj.next();
                while(isSeatBooked(showName,seatNameToCancel))
                {
                    System.out.println("Invalid! Please enter another seat number: ");
                    seatNameToCancel = scobj.next();
                }
                for(int k=0;k<100;k++)
                {
                    if(show1.get(k).getSeatNumber().compareTo(seatNameToCancel) == 0 && show1.get(k).isBooked() == false)
                    {
                        show1.get(k).setBooked(true);
                        System.out.println(seatNameToCancel + " Cancelled!");
                        show1Total++;
                    }
                }
            }
        }
        if(showName == "show2")
        {
            System.out.println("Enter the number of tickets to be cancelled: ");
            int noOfTicketsCancel = scobj.nextInt();
            for(int i=1;i<=noOfTicketsCancel;i++)
            {
                System.out.println("Enter seat number to cancel:");
                String seatNameToCancel = scobj.next();
                while(isSeatBooked(showName,seatNameToCancel))
                {
                    System.out.println("Invalid! Please enter another seat number: ");
                    seatNameToCancel = scobj.next();
                }
                for(int k=0;k<100;k++)
                {
                    if(show2.get(k).getSeatNumber().compareTo(seatNameToCancel) == 0 && show2.get(k).isBooked() == false)
                    {
                        show2.get(k).setBooked(true);
                        System.out.println(seatNameToCancel + " Cancelled!");
                        show2Total++;
                    }
                }
            }
        }
        if(showName == "show3")
        {
            System.out.println("Enter the number of tickets to be cancelled: ");
            int noOfTicketsCancel = scobj.nextInt();
            for(int i=1;i<=noOfTicketsCancel;i++)
            {
                System.out.println("Enter seat number to cancel:");
                String seatNameToCancel = scobj.next();
                while(isSeatBooked(showName,seatNameToCancel))
                {
                    System.out.println("Invalid! Please enter another seat number: ");
                    seatNameToCancel = scobj.next();
                }
                for(int k=0;k<100;k++)
                {
                    if(show3.get(k).getSeatNumber().compareTo(seatNameToCancel) == 0 && show3.get(k).isBooked() == false)
                    {
                        show3.get(k).setBooked(true);
                        System.out.println(seatNameToCancel + " Cancelled!");
                        show3Total++;
                    }
                }
            }
        }
        if(showName == "show4")
        {
            System.out.println("Enter the number of tickets to be cancelled: ");
            int noOfTicketsCancel = scobj.nextInt();
            for(int i=1;i<=noOfTicketsCancel;i++)
            {
                System.out.println("Enter seat number to cancel:");
                String seatNameToCancel = scobj.next();
                while(isSeatBooked(showName,seatNameToCancel))
                {
                    System.out.println("Invalid! Please enter another seat number: ");
                    seatNameToCancel = scobj.next();
                }
                for(int k=0;k<100;k++)
                {
                    if(show4.get(k).getSeatNumber().compareTo(seatNameToCancel) == 0 && show4.get(k).isBooked() == false)
                    {
                        show4.get(k).setBooked(true);
                        System.out.println(seatNameToCancel + " Cancelled!");
                        show4Total++;
                    }
                }
            }
        }
        System.out.println("Your amount will be refunded! Thank you!!!");
    }
boolean validateUser(String username,String password)
{
    if(username.compareTo("user1") == 0 && password.compareTo("user") == 0)
        return true;
    else
        return false;
}
}