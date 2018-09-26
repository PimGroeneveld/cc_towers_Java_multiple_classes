import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("River Room", 59.99);

    }

    @Test
    public void getName() {
        assertEquals("River Room", conferenceRoom.getName());
    }

    @Test
    public void getRate() {
        assertEquals(59.99, conferenceRoom.getRate(), 0.0);
    }
}