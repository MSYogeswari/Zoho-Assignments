class TicketInformation {
    private String showNumber;
    private String seatNumber;
    private boolean booked;

    TicketInformation(String showno,String seatno,boolean status)
    {
        this.showNumber = showno;
        this.seatNumber = seatno;
        this.booked = status;
    }


    public String getShowNumber() {
        return showNumber;
    }

    public void setShowNumber(String showNumber) {
        this.showNumber = showNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean status) {
        this.booked = status;
    }
}
