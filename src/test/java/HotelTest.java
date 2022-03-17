import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom room1;
    Bedroom room2;
    Booking booking;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;
    ArrayList<Bedroom> rooms;
    ArrayList<ConferenceRoom> confroom;


    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Rob");
        guests = new ArrayList<>();
        room1 = new Bedroom(0, guests, 69, RoomType.DOUBLE);
        room2 = new Bedroom(0, guests, 27, RoomType.SINGLE);
        rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        hotel = new Hotel("Luigi's Mansion", rooms, confroom);
    }

    @Test
    public void canAddRoom(){
        hotel.addBedroom(room1);
        assertEquals(3, hotel.roomCount());

    }

    @Test
    public void hasRooms(){
        assertEquals(2, hotel.roomCount());
    }

    @Test
    public void canBookRoom(){
        hotel.bookRoom(room1, 5);
        hotel.bookRoom(room2, 3);
        assertEquals(2, hotel.getBookingCount());
    }

    @Test
    public void canCharge(){
        hotel.bookRoom(room2, 4);
        hotel.bookRoom(room1, 5);
        double cost = hotel.chargeBooking(69);
        assertEquals(345.0, cost, 0);

    }
}


//    @Test
//    public void canBillBooking(){
//        hotel.bookRoom(room1, 5);
//        assertEquals(1, hotel.getBookingCount());
//        assertEquals(345.0, hotel.chargeBooking(), 0);
//    }
//}
