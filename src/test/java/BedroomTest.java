import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(15, "single", 39.99);

    }

    @Test
    public void getRoomNumber() {
        assertEquals(15, bedroom.getRoomNumber());
    }

    @Test
    public void getType() {
        assertEquals("single", bedroom.getType());
    }

    @Test
    public void getRate() {
        assertEquals(39.99, bedroom.getRate(), 0.0);
    }
}
