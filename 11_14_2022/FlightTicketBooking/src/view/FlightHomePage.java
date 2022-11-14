package view;

import controller.FlightLogicController;
import model.Passenger;

import java.util.ArrayList;

public class FlightHomePage {

    public void flightHomePageInitiate() {
        int displayMenuOption;

        GetInput getInput = new GetInput();
        FlightLogicController flightLogicController = new FlightLogicController();
        do {
            displayMenu();
            displayMenuOption = getInput.getInteger();
            switch (displayMenuOption) {
                case 1:
                    System.out.println("Enter source station: ");
                    String sourceStation = getInput.getString();
                    System.out.println("Enter destination station: ");
                    String destinationStation = getInput.getString();
                    while (destinationStation.compareTo(sourceStation) == 0) {
                        System.err.println("Source and destination string cannot be equal! Please select another destination station: ");
                        destinationStation = getInput.getString();
                    }
                    int flightCount = flightLogicController.listFlightRoutes(sourceStation, destinationStation);
                    if (flightCount != 0) {
                        System.out.println("Enter flight number: ");
                        String flightNumber = getInput.getString();
                        System.out.println("Enter number of passenger:");
                        int numberOfPassengers = getInput.getInteger();
                        ArrayList<Passenger> passengerListToAdd = new ArrayList<>();

                        for (int index = 1; index <= numberOfPassengers; index++) {
                            System.out.println("Enter Passenger " + index + " details :");
                            System.out.println("Last Name : ");
                            String passengerLastNameTemp = getInput.getString();
                            System.out.println("First Name : ");
                            String passengerFirstNameTemp = getInput.getString();
                            System.out.println("Age : ");
                            int passengerAgeTemp = getInput.getInteger();
                            System.out.println("Gender : ");
                            String passengerGenderTemp = getInput.getString();
                            System.out.println("ID : ");
                            int passengerIdTemp = getInput.getInteger();
                            passengerListToAdd.add(new Passenger(passengerLastNameTemp, passengerFirstNameTemp, passengerAgeTemp, passengerGenderTemp, passengerIdTemp));
                        }
                        displayBookingOptions();
                        int userBookingOption = getInput.getInteger();
                        switch (userBookingOption) {
                            case 1:
                                flightLogicController.bookingTicket(passengerListToAdd, flightNumber);
                                break;
                            case 2:
                                break;
                            default:
                                System.err.println("Invalid value!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter PNR Number: ");
                    long pnrNumberToGetStatus = getInput.getLong();
                    flightLogicController.displayTicketByPnr(pnrNumberToGetStatus);
                    break;
                case 3:
                    flightLogicController.displayAllBookedTickets();
                    break;
                case 4:
                    System.out.println("Enter PNR NUmber: ");
                    long pnrNumberToDelete = getInput.getLong();
                    System.out.println("Do you want to cancel the ticket");
                    String deleteConfirm = getInput.getString();
                    if (deleteConfirm.compareTo("Yes") == 0) {
                        flightLogicController.deleteTicket(pnrNumberToDelete);
                    } else {
                        System.out.println("Delete Process Cancelled!");
                    }
                    break;
                case 5:
                    System.out.println("Enter Passenger ID:");
                    int passengerIdtoSearch = getInput.getInteger();
                    flightLogicController.searchByPassengerId(passengerIdtoSearch);
                    break;
                case 6:
                    flightLogicController.listFlightRoutes();
                    break;
                case 7:
                    break;
                default:
                    System.err.println("Please enter a valid value!");
            }
        } while (displayMenuOption != 7);
    }

    public void displayMenu() {
        System.out.println("Welcome to IRCTC\n" +
                " 1-Booking \n 2-Get PNR status \n 3-Booked tickets \n 4-Cancel Tickets \n 5-Search passenger \n 6-List flight routes \n 7-Exit\n" + "Enter your option :");
    }

    public void displayBookingOptions() {
        System.out.println("Pay :\n" + "(1-Pay,2-Cancel)");
    }
}
