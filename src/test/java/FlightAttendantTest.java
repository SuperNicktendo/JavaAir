import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightAttendantTest {

    FlightAttendant flightAttendant;

    @Before
    public void setUp(){
        flightAttendant = new FlightAttendant("Elaine", CabinCrewMembers.ATTENDANT);
    }

    @Test
    public void flightAttendantHasName(){
        assertEquals("Elaine", flightAttendant.getName());
    }

    @Test
    public void flightAttendantHasRank(){
        assertEquals(CabinCrewMembers.ATTENDANT, flightAttendant.getRank());
    }

    @Test
    public void flightAttendantCanRelayMessage(){
        assertEquals("A hospital? What is it?", flightAttendant.relayMessage());
    }

}
