import java.util.ArrayList;

public class DinningRoom extends Room {

    private String name;

    public DinningRoom(Integer capacity, ArrayList<Guest> guests, String name, ArrayList<Guest> guests1) {
        super(capacity, guests);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
