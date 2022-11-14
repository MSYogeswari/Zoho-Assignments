import view.FlightHomePage;

public class Main {
    public static void main(String[] args) {
        Main mainObject = new Main();
        mainObject.start();
    }

    void start() {
        FlightHomePage flightHomePage = new FlightHomePage();
        flightHomePage.flightHomePageInitiate();
    }
}