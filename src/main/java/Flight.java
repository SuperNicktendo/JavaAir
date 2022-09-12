import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<FlightAttendant> cabinCrew;
    private ArrayList<Pilot> pilots;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.cabinCrew = new ArrayList<FlightAttendant>();
        this.pilots = new ArrayList<Pilot>();
        this.passengers = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int numberOfCabinCrew() {
        return cabinCrew.size();
    }

    public void addFlightAttendant(FlightAttendant flightAttendant){
        this.cabinCrew.add(flightAttendant);
    }

    public int numberOfPilots() {
        return this.pilots.size();
    }

    public void addPilot(Pilot pilot){
        this.pilots.add(pilot);
    }

    public double numberOfPassengers() {
        return passengers.size();
    }


    public void bookPassenger(Passenger passenger, Plane plane){
        if(plane.getCapacity() > 0) {
            this.passengers.add(passenger);
        }
    }

    public int checkSeatsAvailable(Plane plane) {
        int capacity = plane.getCapacity();
        int seatsAvailable = capacity - this.passengers.size();
        return seatsAvailable;
    }
}
