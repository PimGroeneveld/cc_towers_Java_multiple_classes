import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HottubAreaTest {

    HottubArea hottubArea;

    @Before
    public void before(){
        hottubArea = new HottubArea(10, "double", 59.99);

    }

    @Test
    public void getRoomNumber() {
        assertEquals(10, hottubArea.getRoomNumber());
    }

    @Test
    public void getType() {
        assertEquals("double", hottubArea.getType());
    }

    @Test
    public void getRate() {
        assertEquals(59.99, hottubArea.getRate(), 0.0);
    }
}