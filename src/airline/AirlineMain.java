package airline;

import passenger.Passenger;

import java.util.Scanner;

import static java.lang.System.exit;

public class AirlineMain {
    private static final Airline airline = new Airline();
    private static final Passenger passenger = new Passenger();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    airlineBookingSystem();

    }

    private static void airlineBookingSystem() {
        prompt("""
                Welcome to Airline Reservation System
                Please select a preferred option:
                1.Book flight
                2. Exit""");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                bookAFlight();
            case 2:
                exit(2);
            default:
                prompt("Please enter a valid option");
                airlineBookingSystem();
        }

    }

    private static void bookAFlight() {
        prompt("""
                Select your class choice
                1.First class flight
                2.Economy flight""");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                firstClassBooking();
            case 2:
                economyBooking();
            default:
                prompt("select a valid option please");
                bookAFlight();
        }
    }

    private static void economyBooking() {
        passenger.selectClassType(2);
        passenger.bookFlight(airline);

    }

    private static void firstClassBooking() {
        passenger.selectClassType(1);
        passenger.bookFlight(airline);
    }

    private static void prompt(String message){
        System.out.println(message);
    }
}
