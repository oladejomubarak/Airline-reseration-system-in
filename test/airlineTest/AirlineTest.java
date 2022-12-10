package airlineTest;

import airline.Airline;
import airline.ClassType;
import passenger.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static airline.ClassType.ECONOMY;
import static airline.ClassType.FIRST;
import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {
   private Airline airline;
   private Passenger passenger;
    @BeforeEach
    void setUp(){
        airline = new Airline();
        passenger = new Passenger();
    }
    @Test
    void testThatAirlineExists(){
        assertNotNull(airline);

    }
    @Test
    void testThatPassengerExists(){
        assertNotNull(passenger);
    }
    @Test
    void testThatIfPassengerSelectOne_FirstClassSeatIsAssigned(){
        passenger.selectClassType(1);
        assertEquals(passenger.getClassType(), FIRST);

    }
    @Test
    void testThatIfPassengerSelectTwo_ECONOMYSeatIsAssigned() {
        passenger.selectClassType(2);
        assertEquals(passenger.getClassType(), ECONOMY);

    }
    @Test
    void testThatIfPassengerSelectsFirstClassAndThePassengerBooksFlight_SeatNumberIsAssignedBetweenOneToFive(){
      passenger.selectClassType(1);
      passenger.bookFlight(airline);
      assertEquals(1, passenger.getSeatNumber());

        passenger.selectClassType(1);
        passenger.bookFlight(airline);
        assertEquals(2, passenger.getSeatNumber());
    }
    @Test
    void testThatIfPassengerSelectsEconomyAndThePassengerBooksFlight_SeatNumberIsAssignedBetweenSixToTen(){
        passenger.selectClassType(2);
        passenger.bookFlight(airline);
        assertEquals(6, passenger.getSeatNumber());


        passenger.selectClassType(2);
        passenger.bookFlight(airline);
        assertEquals(7, passenger.getSeatNumber());


    }

    }
