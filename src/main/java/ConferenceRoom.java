import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;

    public ConferenceRoom(Integer capacity, ArrayList<Guest> guests, String name) {
        super(capacity, guests);
        this.name = name;
    }
}
