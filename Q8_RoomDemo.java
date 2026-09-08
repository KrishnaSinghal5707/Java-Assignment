class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    public void setData(int rNo, String rType, double rArea, boolean ac) {
        roomno = rNo;
        roomtype = rType;
        roomarea = rArea;
        ACmachine = ac;
    }

    public void displayData() {
        System.out.println("Room No: " + roomno);
        System.out.println("Room Type: " + roomtype);
        System.out.println("Room Area: " + roomarea + " sq ft");
        System.out.println("AC Included: " + (ACmachine ? "Yes" : "No"));
    }
}

public class RoomDemo {
    public static void main(String[] args) {
        Room myRoom = new Room();
        myRoom.setData(101, "Deluxe Suite", 450.5, true);
        myRoom.displayData();
    }
}
