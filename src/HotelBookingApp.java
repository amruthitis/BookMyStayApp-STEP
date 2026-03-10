
abstract class Room {
    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;


    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }


    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds +
                " | Size: " + squareFeet + " sq.ft" +
                " | Price per night: ₹" + pricePerNight);
    }
}


class SingleRoom extends Room {
    public SingleRoom() {
        super(1, 250, 2000.0);
    }
}


class DoubleRoom extends Room {
    public DoubleRoom() {
        super(2, 400, 3500.0);
    }
}


class SuiteRoom extends Room {
    public SuiteRoom() {
        super(3, 800, 6000.0);
    }
}


public class HotelBookingApp {
    public static void main(String[] args) {
        System.out.println("Welcome To BookMyStay");

        // Static availability variables
        int singleRoomAvailability = 5;
        int doubleRoomAvailability = 3;
        int suiteRoomAvailability = 2;

        // Initialize room objects
        Room single = new SingleRoom();
        Room doubleR = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display room details and availability
        System.out.println("\n--- Room Details ---");
        System.out.print("Single Room -> ");
        single.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailability);

        System.out.print("Double Room -> ");
        doubleR.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailability);

        System.out.print("Suite Room -> ");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailability);

        System.out.println("\nThank you for using BookMyStay!");
    }
}