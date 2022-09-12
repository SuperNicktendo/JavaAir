public class FlightAttendant {

    private String name;
    private CabinCrewMembers rank;

    public FlightAttendant(String name, CabinCrewMembers rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public CabinCrewMembers getRank() {
        return rank;
    }

    public String relayMessage() {
        return "A hospital? What is it?";
    }
}
