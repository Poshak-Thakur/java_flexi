package Case_3;
abstract class Robot {
    private String batteryId;
    protected double chargeLevel;
    public Robot(String batteryId, double chargeLevel) {
        this.batteryId = batteryId;
        this.chargeLevel = chargeLevel;
    }
    public abstract void performTask();
    public void reportStatus(){
        System.out.println("Battery ID: " + batteryId + ", Charge Level: " + chargeLevel + "%");
    }
}
public class case2 {
    
}
