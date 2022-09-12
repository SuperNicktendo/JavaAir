import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(100, 100);
    }

    @Test
    public void planeHasWeight(){
        assertEquals(100, plane.getWeight());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(100, plane.getCapacity());
    }
}
