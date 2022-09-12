public enum CabinCrewMembers {

    CAPTAIN("Captain"),
    COPILOT("Co-Pilot"),
    ATTENDANT("Attendant");

    private final String rank;

    CabinCrewMembers(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
