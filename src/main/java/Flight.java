import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> bookedSeats;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureTime;


    public Flight(Plane plane, String flightNumber, String destination, String departureTime) {
        this.bookedSeats = bookedSeats;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public int getBookedSeats() {
        return bookedSeats.size();
    }


    public int freeSeatsLeft(){
        return (plane.getType().getCap() - this.bookedSeats.size());
    }

    public void bookAPassenger(Passenger passenger){
        if (plane.getType().getCap() >= this.bookedSeats.size()){
            this.bookedSeats.add(passenger);
        } else{
            System.out.println("Plane is full");
        }
    }


}
