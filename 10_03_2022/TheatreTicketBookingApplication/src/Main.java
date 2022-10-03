import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main mainobject = new Main();
        mainobject.initiate();
    }

    void initiate() {
        int userMenuInput,showMenuinput;
        Scanner sc = new Scanner(System.in);
        TicketController tickConObject = new TicketController();
        System.out.println("************Theatre Ticket Booking************");
        System.out.println("Ponniyin Selvan-Part 1");
        System.out.println("**********************************************");
        do {
            tickConObject.displayMenu();
            userMenuInput = sc.nextInt();
            switch (userMenuInput) {
                case 1:
                    System.out.println("Show 1 : 08.30 AM");
                    do {
                        tickConObject.displayShowMenu();
                        showMenuinput = sc.nextInt();
                        switch (showMenuinput) {
                            case 1:
                                tickConObject.showAvailableSeats("show1");
                                break;
                            case 2:
                                tickConObject.bookTickets("show1");
                                break;
                            case 3:
                                tickConObject.cancelTickets("show1");
                                break;
                            case 4: break;
                                default:
                                System.out.println("Please enter a valid value!");
                        }
                    }while(showMenuinput!=4);
                    break;
                case 2:System.out.println("Show 2 : 12.30 PM");
                    do {
                        tickConObject.displayShowMenu();
                        showMenuinput = sc.nextInt();
                        switch (showMenuinput) {
                            case 1:
                                tickConObject.showAvailableSeats("show2");
                                break;
                            case 2:
                                tickConObject.bookTickets("show2");
                                break;
                            case 3:
                                tickConObject.cancelTickets("show2");
                                break;
                            case 4: break;
                            default:
                                System.out.println("Please enter a valid value!");
                        }
                    }while(showMenuinput!=4);
                    break;
                case 3:System.out.println("Show 3 : 04.30 PM");
                    do {
                        tickConObject.displayShowMenu();
                        showMenuinput = sc.nextInt();
                        switch (showMenuinput) {
                            case 1:
                                tickConObject.showAvailableSeats("show3");
                                break;
                            case 2:
                                tickConObject.bookTickets("show3");
                                break;
                            case 3:
                                tickConObject.cancelTickets("show3");
                                break;
                            case 4: break;
                            default:
                                System.out.println("Please enter a valid value!");
                        }
                    }while(showMenuinput!=4);
                    break;
                case 4:System.out.println("Show 4 : 08.30 PM");
                    do {
                        tickConObject.displayShowMenu();
                        showMenuinput = sc.nextInt();
                        switch (showMenuinput) {
                            case 1:
                                tickConObject.showAvailableSeats("show4");
                                break;
                            case 2:
                                tickConObject.bookTickets("show4");
                                break;
                            case 3:
                                tickConObject.cancelTickets("show4");
                                break;
                            case 4: break;
                            default:
                                System.out.println("Please enter a valid value!");
                        }
                    }while(showMenuinput!=4);
                    break;
                case 5: break;
                default:
                    System.out.println("Please enter a valid value!");
            }
        } while (userMenuInput != 5);
    }
}