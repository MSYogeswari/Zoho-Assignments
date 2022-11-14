package model;

public class Ticket {
    long pnrNumber;
    int ticketNumber;
    int passengerId;
    String flightNumber;
    float ticketFare;

    public Ticket(long pnrNumber, int ticketNumber, int passengerId, String flightNumber, float ticketFare) {
        this.pnrNumber = pnrNumber;
        this.ticketNumber = ticketNumber;
        this.passengerId = passengerId;
        this.flightNumber = flightNumber;
        this.ticketFare = ticketFare;
    }

    public long getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(long pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public float getTicketFare() {
        return ticketFare;
    }

    public void setTicketFare(float ticketFare) {
        this.ticketFare = ticketFare;
    }
}
