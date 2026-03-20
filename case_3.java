import java.util.ArrayList;
import java.util.List;

abstract class Transport {
    protected String trackingId; 
    protected String destination; 

    public Transport(String trackingId, String destination) { 
        this.trackingId = trackingId;
        this.destination = destination;
    } 
    
    public abstract void dispatch();
}

interface GPS {
    void getCoordinates(); 
    
    default void pingServer() {
        System.out.println("Online tracking enabled");
    } 
}

interface Autonomous { 
    void selfNavigate();
}

class DeliveryDrone extends Transport implements GPS, Autonomous {
    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }
    
    @Override
    public void dispatch() {
        System.out.println("Drone dispatched to " + destination);
    }
    
    @Override
    public void getCoordinates() {
        System.out.println("Current coordinates: 37.7749° N, 122.4194° W");
    }
    
    @Override
    public void selfNavigate() {
        System.out.println("Drone is navigating autonomously.");
    }
}

class Truck extends Transport {
    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    @Override
    public void dispatch() {
        System.out.println("Truck driving on highway to " + destination);
    }
}

public class case_3 {
    public static void main(String[] args) {
        System.out.println("--- Test Case 1: Polymorphism ---");
        Transport t = new DeliveryDrone("D101", "New York");
        t.dispatch();
        
        System.out.println("\n--- Test Case 2: Interface Reference ---");
        GPS g = new DeliveryDrone("D102", "Los Angeles");
        g.getCoordinates();
        g.pingServer(); 

        System.out.println("\n--- Test Case 3: The 'instanceof' Loop ---");
        List<Transport> fleet = new ArrayList<>();
        fleet.add(new DeliveryDrone("D999", "Chicago"));
        fleet.add(new Truck("T555", "Miami"));

        for (Transport vehicle : fleet) {
            vehicle.dispatch();
            if (vehicle instanceof GPS) {
                System.out.println("  -> SUCCESS: This vehicle has GPS. Pinging server...");
                GPS gpsDevice = (GPS) vehicle;
                gpsDevice.pingServer();
            } else {
                System.out.println("  -> FAILED: This vehicle is NOT equipped with GPS.");
            }
        }
    }
}