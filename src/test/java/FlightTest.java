import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    Passenger passenger2;
    Plane plane;
    Pilot pilot;
    FlightAttendant flightAttendant1;
    FlightAttendant flightAttendant2;
    FlightAttendant flightAttendant3;
    FlightAttendant flightAttendant4;
    FlightManager flightManager;

    @Before
    public void setUp(){
        flight = new Flight("MA395", "Madrid", "Edinburgh", "14:30");
        passenger = new Passenger("Leslie Nielsen", 2);
        passenger2 = new Passenger("Sonny Bono", 5);
        plane = new Plane(1000, 100);
        pilot = new Pilot("Rex Kramer", CabinCrewMembers.CAPTAIN, "LC102030");
        flightAttendant1 = new FlightAttendant("Elaine", CabinCrewMembers.ATTENDANT);
        flightAttendant2 = new FlightAttendant("Betty", CabinCrewMembers.ATTENDANT);
        flightAttendant3 = new FlightAttendant("Johnny", CabinCrewMembers.ATTENDANT);
        flightAttendant4 = new FlightAttendant("Helen", CabinCrewMembers.ATTENDANT);
        flightManager = new FlightManager();
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("MA395", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Madrid", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("14:30", flight.getDepartureTime());
    }

    @Test
    public void flightCanAddPilot(){
        flight.addPilot(pilot);
        assertEquals(1, flight.numberOfPilots());
    }

    @Test
    public void flightCanAddCabinCrew(){
        flight.addFlightAttendant(flightAttendant1);
        flight.addFlightAttendant(flightAttendant2);
        flight.addFlightAttendant(flightAttendant3);
        assertEquals(3, flight.numberOfCabinCrew());
    }

    @Test
    public void flightCanBookPassenger(){
        flight.bookPassenger(passenger, plane);
        assertEquals(1, flight.numberOfPassengers());
    }

    @Test
    public void flightCanCheckAvailableSeats(){
        flight.bookPassenger(passenger, plane);
        flight.bookPassenger(passenger2, plane);
        assertEquals(98, flight.checkSeatsAvailable(plane));
    }

    @Test
    public void canGetTotalReservedBaggageWeight(){
        assertEquals(500, flightManager.getTotalReservedBaggageWeight(plane), 0.0);
    }

    @Test
    public void canGetPassengerBaggageWeight(){
        flight.bookPassenger(passenger, plane);
        assertEquals(10, flightManager.getPassengerBaggageWeight(passenger, plane, flight), 0.0);
    }

    @Test
    public void canGetRemainingPassengerBaggageWeight(){
        flight.bookPassenger(passenger, plane);
        assertEquals(490, flightManager.getRemainingPassengerBaggageWeight(passenger, plane, flight), 0.0);
    }





}
