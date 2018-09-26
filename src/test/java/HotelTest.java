import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    HottubArea hottubArea;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        hotel = new Hotel("Big Bear Hotel");
        bedroom1 = new Bedroom(15, "single", 39.99);
        bedroom2 = new Bedroom(17, "double", 59.99);
        conferenceRoom = new ConferenceRoom("River Room", 49.99);
        hottubArea = new HottubArea(80, "Relaxation");
        guest1 = new Guest("Mr Salmon");
        guest2 = new Guest("Ms Salmon");
        guest3 = new Guest("Salmon Sr");
    }

    @Test
    public void getName() {
        assertEquals("Big Bear Hotel", hotel.getName());
    }

    @Test
    public void getNumberOfBedrooms() {
        assertEquals(0, hotel.getBedrooms());
    }

    @Test
    public void getNumberOfConferenceRooms() {
        assertEquals(0, hotel.getConferenceRooms());
    }

    @Test
    public void getNumberOfHottubAreas() {
        assertEquals(0, hotel.getHottubAreas());
    }
}