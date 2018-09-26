public class HottubArea {

    private int roomNumber;
    private String type;
    private double rate;

    public HottubArea(int roomNumber, String type, double rate){
        this.roomNumber = roomNumber;
        this.type = type;
        this.rate = rate;
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
}
