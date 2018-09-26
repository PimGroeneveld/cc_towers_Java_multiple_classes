import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Mr Salmon");
    }

    @Test
    public void getName() {
        assertEquals("Mr Salmon", guest.getName());
    }
}
