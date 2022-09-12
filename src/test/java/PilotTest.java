import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Rex Kramer", CabinCrewMembers.CAPTAIN, "LC102030");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Rex Kramer", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(CabinCrewMembers.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicence(){
        assertEquals("LC102030", pilot.getLicence());
    }

    @Test
    public void pilotCanFly(){
        assertEquals("Engage!", pilot.flyPlane());
    }

}
