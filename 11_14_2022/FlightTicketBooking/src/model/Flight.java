package model;

import java.sql.Time;

public class Flight {
    private String flightNumber;
    private String flightName;
    private String departureTime;
    private String arrivalTime;
    private String flightRoutes;
    private int totalSeats;
    private float ticketFare;

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        arrivalTime = arrivalTime;
    }

    public Flight(String flightNumber, String flightName, String departureTime, String arrivalTime, String flightRoutes, int totalSeats, float ticketFare) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightRoutes = flightRoutes;
        this.totalSeats = totalSeats;
        this.ticketFare = ticketFare;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightRoutes() {
        return flightRoutes;
    }

    public void setFlightRoutes(String flightRoutes) {
        this.flightRoutes = flightRoutes;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public float getTicketFare() {
        return ticketFare;
    }

    public void setTicketFare(float ticketFare) {
        this.ticketFare = ticketFare;
    }
}
