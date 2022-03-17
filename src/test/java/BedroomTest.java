import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Bedroom newBedroom;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        guest1 = new Guest("Bob");
        guest2 = new Guest("Rob");
        guests = new ArrayList<>();
        bedroom = new Bedroom(0, guests, 69, RoomType.DOUBLE);
        newBedroom = new Bedroom(0, guests, 27, RoomType.SINGLE);
    }

    @Test
    public void canCheckIn(){
        bedroom.checkIn(guest1);
        bedroom.checkIn(guest2);
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canCheckOut(){
        bedroom.checkIn(guest1);
        assertEquals(1, bedroom.getCapacity());
        bedroom.checkOut();
        assertEquals(0, bedroom.getCapacity());
    }

    @Test
    public void testRates(){
        assertEquals(69.0, bedroom.getRates(), 0);
        assertEquals(34.5, newBedroom.getRates(), 0);
    }


}
