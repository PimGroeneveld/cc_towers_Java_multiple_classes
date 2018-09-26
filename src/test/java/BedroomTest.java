import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        bedroom = new Bedroom(15, "single", 39.99, 1);
        guest1 = new Guest("Mr Salmon");
        guest2 = new Guest("Ms Salmon");
        guest3 = new Guest("Salmon Sr");

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

    @Test
    public void getCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void canReturnGuest(){
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.returnGuests().size());
    }

    @Test
    public void canReturnGuestNames(){
        bedroom.addGuest(guest1);
        ArrayList<String> names = new ArrayList<>();
        names.add("Mr Salmon");
        assertEquals(names, bedroom.returnNames());
    }
}
