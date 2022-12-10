package passenger;

import static airline.ClassType.ECONOMY;
import static airline.ClassType.FIRST;

import airline.Airline;
import airline.AirlineException;
import airline.ClassType;

public class Passenger {
    private int seatNumber;
    private ClassType classType;

    public ClassType getClassType() {
        return classType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void selectClassType(int classTypeNumber) {
        if (classTypeNumber == 1) {
            classType = FIRST;
        } else {
            if (classTypeNumber == 2) {
                classType = ECONOMY;
            } else {
                throw new AirlineException("only 1 or 2 can b selected");
            }
        }
    }

        private void bookFirstClassSeat ( boolean[] seats){
            if (classType == FIRST) {
                for (int i = 0; i < 5; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("First class seat booked successfully");
                        seatNumber = i + 1;
                        break;
                    }

                }
            }

        }

        private void bookEconomyClassSeat ( boolean[] seats){
            if (classType == ECONOMY) {
                for (int i = 5; i < seats.length; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("Economy seat booked successfully");
                        seatNumber = i + 1;
                        break;
                    }
                }
            }
        }
        public void bookFlight (Airline airline){
            var seats = airline.getSeats();
            bookFirstClassSeat(seats);
            bookEconomyClassSeat(seats);

        }

        public void displayBoardingPass () {
            System.out.printf("your boarding pass is: %nSeat Number: %d, class type: %s", getSeatNumber(), getClassType());
        }
    }

