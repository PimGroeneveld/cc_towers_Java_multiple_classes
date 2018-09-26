import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

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
        if (bedroom.getCapacity() > bedroom.countGuests()) {
            int targetBedroom = this.bedrooms.indexOf(bedroom);
            this.bedrooms.get(targetBedroom).addGuest(guest);
        }
    }

    public ArrayList<Guest> getGuestList(Bedroom bedroom){
        int targetBedroom = this.bedrooms.indexOf(bedroom);
        ArrayList<Guest> roomGuests = this.bedrooms.get(targetBedroom).returnGuests();
        System.out.println("guests in the room are: " + roomGuests);
        return roomGuests;
    }

    public ArrayList<Bedroom> getVacantRooms() {
        ArrayList<Bedroom> vacantRooms = new ArrayList<>();
        for(Bedroom room : this.bedrooms){
            if(room.countGuests() == 0){
                vacantRooms.add(room);
            }
        }
        System.out.println("vacant rooms are:" + vacantRooms);
        return vacantRooms;
    }
}
