import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<HottubArea> hottubAreas;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.hottubAreas = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBedroomToHotel(){

    }

    public void addConferenceRoomToHotel(){

    }

    public void addHottubAreaToHotel(){

    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public int getConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public int getHottubAreas() {
        return this.hottubAreas.size();
    }
}
