package controller;

import model.Flight;
import model.Passenger;
import model.Ticket;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class FlightLogicController {
    static ArrayList<Flight> flightList = new ArrayList<>();
    static ArrayList<Passenger> passengerList = new ArrayList<>();
    static ArrayList<Ticket> ticketList = new ArrayList<>();
    Random randompnr = new Random();
    static int ticketNumberTemp = 0;

    public FlightLogicController() {
        try {
            int content;
            String tempStringRead = "";
            String flightNumberTemp = "", flightNameTemp = "", flightDepartureTimeTemp = "", flightArrivalTimeTemp = "", flightRoutesTemp = "";
            int totalSeatsTemp = 0;
            float flightFareTemp = 0;
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ADMIN\\IdeaProjects\\FlightTicketBooking\\src\\controller\\FlightSchedule.txt");
            while ((content = fileInputStream.read()) != -1) {
                tempStringRead = tempStringRead + (char) content;
                if (tempStringRead.compareTo("*\r\n") == 0 || tempStringRead.compareTo("*\n\r") == 0 || tempStringRead.compareTo("*\n") == 0) {
                    tempStringRead = "";
                }
                if (tempStringRead.compareTo("Flight number : ") == 0) {
                    tempStringRead = "";
                    while ((content = fileInputStream.read()) != '\n') {
                        tempStringRead = tempStringRead + (char) content;
                    }
                    flightNumberTemp = tempStringRead;
                    tempStringRead = "";
                }
                if (tempStringRead.compareTo("Flight name : ") == 0) {
                    tempStringRead = "";
                    while ((content = fileInputStream.read()) != '\n') {
                        tempStringRead = tempStringRead + (char) content;
                    }
                    flightNameTemp = tempStringRead;
                    tempStringRead = "";
                }
                if (tempStringRead.compareTo("Flight departure time : ") == 0) {
                    tempStringRead = "";
                    while ((content = fileInputStream.read()) != '\n') {
                        tempStringRead = tempStringRead + (char) content;
                    }
                    flightDepartureTimeTemp = tempStringRead;
                    tempStringRead = "";
                }
                if (tempStringRead.compareTo("Flight Arrival time : ") == 0) {
                    tempStringRead = "";
                    while ((content = fileInputStream.read()) != '\n') {
                        tempStringRead = tempStringRead + (char) content;
                    }
                    flightArrivalTimeTemp = tempStringRead;
                    tempStringRead = "";
                }
                if (tempStringRead.compareTo("Total seats : ") == 0) {
                    tempStringRead = "";
                    while ((content = fileInputStream.read()) != '\r') {
                        tempStringRead = tempStringRead + (char) content;
                    }
                    totalSeatsTemp = Integer.parseInt(tempStringRead);
                    if (fileInputStream.read() == '\n') {
                        tempStringRead = "";
                    }
                }
                if (tempStringRead.compareTo("Flight routes : ") == 0) {
                    tempStringRead = "";
                    while ((content = fileInputStream.read()) != '\n') {
                        tempStringRead = tempStringRead + (char) content;
                    }
                    flightRoutesTemp = tempStringRead;
                    tempStringRead = "";
                }
                if (tempStringRead.compareTo("Fare : ") == 0) {
                    tempStringRead = "";
                    while ((content = fileInputStream.read()) != '\r') {
                        tempStringRead = tempStringRead + (char) content;
                    }
                    flightFareTemp = Float.parseFloat(tempStringRead);
                    if (fileInputStream.read() == '\n') {
                        tempStringRead = "";
                    }
                    tempStringRead = "";
                }
                if (tempStringRead.compareTo("*") == 0) {
                    if (flightNumberTemp.contains("\r"))
                        flightNumberTemp = flightNumberTemp.replaceAll("\r", "");
                    if (flightNameTemp.contains("\r"))
                        flightNameTemp = flightNameTemp.replaceAll("\r", "");
                    if (flightDepartureTimeTemp.contains("\r"))
                        flightDepartureTimeTemp = flightDepartureTimeTemp.replaceAll("\r", "");
                    if (flightArrivalTimeTemp.contains("\r"))
                        flightArrivalTimeTemp = flightArrivalTimeTemp.replaceAll("\r", "");
                    if (flightRoutesTemp.contains("\r"))
                        flightRoutesTemp = flightRoutesTemp.replaceAll("\r", "");
                    flightList.add(new Flight(flightNumberTemp, flightNameTemp, flightDepartureTimeTemp, flightArrivalTimeTemp, flightRoutesTemp, totalSeatsTemp, flightFareTemp));
                }
            }
            fileInputStream.close();
        } catch (IOException ex) {
            System.err.println("File not Found!");
        }
    }

    public void listFlightRoutes() {
        System.out.println("Available Flights:");
        for (Flight flight : flightList) {
            System.out.println("Flight no : " + flight.getFlightNumber());
            System.out.println("Name : " + flight.getFlightName());
            System.out.println("Departure Time : " + flight.getDepartureTime());
            System.out.println("Arrival Time : " + flight.getArrivalTime());
            System.out.println("Routes : " + flight.getFlightRoutes());
            System.out.println("Total Seats : " + flight.getTotalSeats());
            System.out.println("Ticket Fare : " + flight.getTicketFare());
            System.out.println();
        }
    }

    public int listFlightRoutes(String SourceStation, String DestinationStation) {
        System.out.println("Available Flights:");
        int flightCount = 0;
        for (Flight flight : flightList) {
            if (flight.getFlightRoutes().contains(SourceStation) && flight.getFlightRoutes().contains(DestinationStation)) {
                System.out.println("Flight no : " + flight.getFlightNumber() + "  ||  Name : " + flight.getFlightName() + "  ||  Departure Time : "
                        + flight.getDepartureTime() + "  ||  Arrival Time : " + flight.getArrivalTime() + "  ||  Fare : "
                        + flight.getTicketFare() + "  ||  Seats : " + flight.getTotalSeats());
                flightCount++;
            }
        }
        if (flightCount == 0) {
            System.err.println("No available flights");
        }
        return flightCount;
    }

    public void bookingTicket(ArrayList<Passenger> passengerListToAdd, String flightNumber) {
        long pnrTemp = randompnr.nextInt(999999999);
        float flightFare = 0;

        for (int index = 0; index < flightList.size(); index++) {
            if (flightList.get(index).getFlightNumber().compareTo(flightNumber) == 0) {
                flightFare = flightList.get(index).getTicketFare();
                int totalSeatsNew = flightList.get(index).getTotalSeats() - passengerListToAdd.size();
                flightList.get(index).setTotalSeats(totalSeatsNew);
            }
        }

        for (Passenger passenger : passengerListToAdd) {
            ticketList.add(new Ticket(pnrTemp, ++ticketNumberTemp, passenger.getPassengerId(), flightNumber, flightFare));
            passengerList.add(passenger);
        }
        System.out.println("Ticket(s) booked successfully.");
        displayTicketByPnr(pnrTemp);
    }

    public void displayTicketByPnr(long pnrNumber) {
        boolean ticketResult = false;
        String flightNumber = getFlightNumberByPnr(pnrNumber);
        System.out.println("Ticket Details \n");
        System.out.println("Flight Details");
        System.out.println("---------------");

        for (Flight flight : flightList) {
            if (flight.getFlightNumber().compareTo(flightNumber) == 0) {
                System.out.println("Flight Number : " + flight.getFlightNumber() + " || Flight Name : " +
                        flight.getFlightName() + " || Departure Time : " + flight.getDepartureTime() +
                        " || Arrival Time : " + flight.getArrivalTime() + " || Routes: " + flight.getFlightRoutes() + " || PNR No : " +
                        pnrNumber + " || Total Fare : " + flight.getTicketFare());
                ticketResult = true;
                displayPassengerByPnr(pnrNumber);
            }
        }
        if (!ticketResult) {
            System.err.println("No Tickets Found!!");
        }
    }

    public String getFlightNumberByPnr(long pnrNumber) {
        String flightNumber = "";
        for (Ticket ticket : ticketList) {
            if (ticket.getPnrNumber() == pnrNumber) {
                flightNumber = ticket.getFlightNumber();
            }
        }
        return flightNumber;
    }

    public void displayPassengerByPnr(long pnrNumber) {
        int passengerCount = 1;
        System.out.println("Passenger Details");
        System.out.println("---------------");
        for (Ticket ticket : ticketList) {
            if (ticket.getPnrNumber() == pnrNumber) {

                int passengerIdTemp = ticket.getPassengerId();
                for (Passenger passenger : passengerList) {
                    if (passengerIdTemp == passenger.getPassengerId()) {
                        System.out.println(passengerCount++ + ". Name : " + passenger.getLastName() + " ." + passenger.getFirstName()
                                + " || Age : " + passenger.getAge() + "  || gender : "
                                + passenger.getGender() + " || ID : " + passenger.getPassengerId() + " || Status : CNF");
                    }
                }
            }
        }
    }

    public void displayAllBookedTickets() {
        int numberOfTickets = 0;
        int passengerCount = 1;
        System.out.println("Total Tickets Booked:" + ticketList.size());
        for (Ticket ticket : ticketList) {
            System.out.println(++numberOfTickets + ". Ticket Details");
            for (Flight flight : flightList) {
                if (flight.getFlightNumber().compareTo(ticket.getFlightNumber()) == 0) {
                    System.out.println("Flight Details");
                    System.out.println("-------------");
                    System.out.println("Flight Number :  " + flight.getFlightNumber() + " || Flight Name : " +
                            flight.getFlightName() + " || Departure Time : " + flight.getDepartureTime() +
                            " || Arrival Time : " + flight.getArrivalTime() + " || Route : " +
                            flight.getFlightRoutes());
                }
            }
            for (Passenger passenger : passengerList) {
                if (passenger.getPassengerId() == ticket.getPassengerId()) {
                    System.out.println("Passenger Details");
                    System.out.println("-----------------");
                    System.out.println(passengerCount++ + ". Name : " + passenger.getLastName() + " ." + passenger.getFirstName() +
                            " || Age : " + passenger.getAge() + " || gender : " + passenger.getGender() + " || ID : " +
                            passenger.getPassengerId() + " || PNR No : " + ticket.getPnrNumber() + " || Total Fare : " + ticket.getTicketFare());
                }
            }
        }
    }

    public void deleteTicket(long pnrNumberToDelete) {
        float refundAmount = 0;
        for (int index = 0; index < ticketList.size(); index++) {
            if (ticketList.get(index).getPnrNumber() == pnrNumberToDelete) {
                String flightNumber = ticketList.get(index).getFlightNumber();
                refundAmount = refundAmount + ticketList.get(index).getTicketFare();
                ticketList.remove(index);
                index--;
                for (Flight flight : flightList) {
                    if (flight.getFlightNumber().compareTo(flightNumber) == 0) {
                        int totalSeatsNew = flight.getTotalSeats() + 1;
                        flight.setTotalSeats(totalSeatsNew);
                    }
                }
            }
        }
        System.out.println("Ticket Cancelled Successfully.Your refund " + refundAmount + " will be processed soon.");
    }

    public void searchByPassengerId(int passengerIdtoSearch) {
        System.out.println("Passenger details :");
        for (Passenger passenger : passengerList) {
            System.out.println("Name : " + passenger.getLastName() + ". " + passenger.getFirstName() +
                    " || Age : " + passenger.getAge() + " || gender : " + passenger.getGender() + " || ID : " + passenger.getPassengerId());
        }
    }
}
