import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HottubAreaTest {

    HottubArea hottubArea;

    @Before
    public void before(){
        hottubArea = new HottubArea(10, "double");

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
    public void isChargable() {
        assertEquals(false, hottubArea.isChargable());
    }
}