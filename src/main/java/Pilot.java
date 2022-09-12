public class Pilot {

    private String name;
    private CabinCrewMembers rank;
    private String licence;

    public Pilot(String name, CabinCrewMembers cabinCrewMembers, String licence) {
        this.name = name;
        this.rank = cabinCrewMembers;
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public CabinCrewMembers getRank() {
        return rank;
    }

    public String getLicence() {
        return licence;
    }

    public String flyPlane(){
        return "Engage!";
    }
}
