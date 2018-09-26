import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("BigBusinessBoys", 59.99);

    }

    @Test
    public void getName() {
        assertEquals("BigBusinessBoys", conferenceRoom.getName());
    }

    @Test
    public void getRate() {
        assertEquals(59.99, conferenceRoom.getRate(), 0.0);
    }
}