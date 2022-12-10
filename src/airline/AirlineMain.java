package airline;

import passenger.Passenger;

import java.util.Scanner;

public class AirlineMain {
    private static final Airline airline = new Airline();
    private static final Passenger passenger = new Passenger();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    airlineBookingSystem();

    }

    private static void airlineBookingSystem() {

    }
    private static void prompt(String message){
        System.out.println(message);
    }
}
