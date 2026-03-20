abstract class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public abstract void turnOn();
}

interface RemoteControllable { 
    void connectToWifi();
}

interface PowerSaving {
    String getEnergyRating();
}

class SmartTV extends Device implements RemoteControllable, PowerSaving { 
    public SmartTV(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Smart TV is now ON.");
    }

    @Override
    public void connectToWifi() {
        System.out.println(brand + " Smart TV connected to WiFi.");
    }

    @Override
    public String getEnergyRating() {
        return "A+";
    }
}

class ElectricKettle extends Device {
    public ElectricKettle(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(brand + " Electric Kettle is now ON.");
    }
}

public class case_2 {
    public static void main(String[] args) {
        System.out.println("--- Test Case 1 ---");
        Device d = new SmartTV("Sony");
        d.turnOn(); 
        System.out.println("\n--- Test Case 2 ---");
        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();
        System.out.println("\n--- Test Case 3 ---");
        
    }
}