public class FlightManager {

    public double getTotalReservedBaggageWeight(Plane plane){
        double reservedWeight = plane.getWeight() / 2;
        return reservedWeight;
    }

    public double getPassengerBaggageWeight( Passenger passenger, Plane plane, Flight flight){
        double weightTotal = 0;
        double assignedWeight = getTotalReservedBaggageWeight(plane) / plane.getCapacity();
        for (int i = 0; i < flight.numberOfPassengers(); i++){
            weightTotal += (assignedWeight * passenger.getLuggage());
        }
        return weightTotal;
    }

    public double getRemainingPassengerBaggageWeight(Passenger passenger, Plane plane, Flight flight) {
        double remainingWeight = getTotalReservedBaggageWeight(plane) - getPassengerBaggageWeight( passenger, plane, flight);
        return remainingWeight;
    }


}
