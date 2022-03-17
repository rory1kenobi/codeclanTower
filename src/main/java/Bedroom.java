import java.util.ArrayList;

public class Bedroom extends Room{

    private Integer roomNo;
    private RoomType type;
    private Double rates;

    public Bedroom(Integer capacity, ArrayList<Guest> guests, Integer roomNo, RoomType type) {
        super(capacity, guests);
        this.roomNo = roomNo;
        this.type = type;
        this.rates = 34.5*type.getCapacity();
    }

    public int getRoomNo() {
        return roomNo;
    }

    public RoomType getType() {
        return type;
    }

    public double getRates(){
        return rates;
    }

    public void checkIn(Guest guest){
        this.addGuest(guest);
    }

    public void checkOut(){
        this.emptyRoom();
    }
}



