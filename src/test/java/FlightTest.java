import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING737);
        flight = new Flight(plane, "NumberWang", "London", "18:00");

    }

    @Test
    public void canBookAPassenger(){
        flight.bookAPassenger(passenger);
        assertEquals(1, flight.getBookedSeats());
    }

    @Test
    public void hasEmptySeats(){
        assertEquals(188, flight.freeSeatsLeft());
    }
}
