import java.util.ArrayList;

public class ConferenceRoom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;

    ConferenceRoom(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }



}