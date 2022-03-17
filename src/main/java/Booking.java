public class Booking {

    private Room bedroom;
    private Integer nights;

    public Booking(Room bedroom, Integer nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public Integer getNights() {
        return nights;
    }
}
