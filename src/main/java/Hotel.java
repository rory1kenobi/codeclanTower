import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confroom;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom>;

    public Hotel(String name, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> confroom) {
        this.name = name;
        this.bedrooms = bedrooms;
        this.confroom = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addBedroom(Bedroom room){
        this.bedrooms.add(room);
    }

    public int roomCount(){
        return this.bedrooms.size();
    }

    public void bookRoom(Bedroom room, int nights){
        Booking booking = new Booking(room, nights);
        this.bookings.add(booking);
    }

    public int getBookingCount(){
        return this.bookings.size();
    }

    public double chargeBooking(int roomNo){
        int bookingIndex = 0;
        for (int i = 0; i < getBookingCount(); i++){
            Booking booking = bookings.get(i);
            Bedroom room = (Bedroom) booking.getBedroom();
            if(room.getRoomNo() == roomNo){
                bookingIndex = i;
            }
        }
        Booking booking = bookings.get(bookingIndex);
        Bedroom bookedRoom = (Bedroom) booking.getBedroom();
        int bookedNights = booking.getNights();
        return bookedRoom.getRates() * bookedNights;
    }
}
