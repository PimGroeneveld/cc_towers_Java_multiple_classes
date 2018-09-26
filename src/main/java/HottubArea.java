public class HottubArea {

    private int roomNumber;
    private String type;
    private boolean chargeable;

    public HottubArea(int roomNumber, String type){
        this.roomNumber = roomNumber;
        this.type = type;
        this.chargeable = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public boolean isChargable() {
        return chargeable;
    }
}
