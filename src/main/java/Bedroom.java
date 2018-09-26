import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private String type;
    private double rate;
    private ArrayList<Guest> guests;
    private int capacity;

    public Bedroom(int roomNumber, String type, double rate, int capacity){
        this.roomNumber = roomNumber;
        this.type = type;
        this.rate = rate;
        this.guests = new ArrayList<>();
        this.capacity = capacity;
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

    public int getCapacity(){
        return capacity;
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public ArrayList<Guest> returnGuests(){
        return guests;
    }

    public ArrayList<String> returnNames(){
        ArrayList<String> guestNames = new ArrayList<>();
        for (Guest guest : this.guests){
            guestNames.add(guest.getName());
        }
        return guestNames;
    }
}
