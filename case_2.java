abstract class Device{
    protected String brand;
    public Device (String brand){
        this.brand = brand;
    }
    public abstract void turnOn();
}

interface RemoteControllablae {
    void connectToWifi();
}

interface PowerSaving {
    String getEnergyRating ();
}

public class case_2 {
    
}
