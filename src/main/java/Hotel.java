import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conferenceRoom;
    private HottubArea hottubArea;

    public Hotel(String name, ConferenceRoom conferenceRoom, HottubArea hottubArea) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRoom = conferenceRoom;
        this.hottubArea = hottubArea;
    }

    public String getName() {
        return name;
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public int countGuests(Bedroom bedroom1) {
        int targetBedroom = this.bedrooms.indexOf(bedroom1);
        return this.bedrooms.get(targetBedroom).countGuests();
    }

    public void checkIn(Bedroom bedroom, Guest guest) {
        int targetBedroom = this.bedrooms.indexOf(bedroom);
        this.bedrooms.get(targetBedroom).addGuest(guest);
    }
}
