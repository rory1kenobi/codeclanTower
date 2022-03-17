import java.util.ArrayList;

public abstract class Room {

    private Integer capacity;
    private ArrayList<Guest> guests;

    public Room(Integer capacity, ArrayList<Guest> guests) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return guests.size();
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void emptyRoom(){
        this.guests.clear();
    }
}
