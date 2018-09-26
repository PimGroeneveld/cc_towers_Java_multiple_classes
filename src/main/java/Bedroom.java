import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private String type;
    private double rate;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, String type, double rate){
        this.roomNumber = roomNumber;
        this.type = type;
        this.rate = rate;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public double getRate() {
        return rate;
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
}
