import java.util.ArrayList;

public class DiningRoom {
    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    DiningRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

}
