import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Sam Jackson", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Sam Jackson", passenger.getName());
    }

    @Test
    public void checkHowManyBagsPassengerHas(){
        assertEquals(2, passenger.getLuggage());
    }


}
