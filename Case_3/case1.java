package Case_3;

abstract class Plan {
    private String patientName;
    private float baseFee;
    public Plan(String patientName, float baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }
    abstract float calaculateBill(float baseFee);;
}

class SilverPlan extends Plan{
    public SilverPlan(String patientName, float baseFee) {
        super(patientName, baseFee);
    }
    @Override
    float calaculateBill(float baseFee) {
        System.out.println("Calculating bill for Silver Plan");
        return baseFee + 15f;
    }
}

class GoldPlan extends Plan{
    public GoldPlan(String patientName, float baseFee) {
        super(patientName, baseFee);
    }
    @Override
    float calaculateBill(float baseFee) {
        System.out.println("Calculating bill for Gold Plan");
        return baseFee + baseFee *0.1f -20f;
    }
}

public class case1 {
    public static void main(String[] args) {
        System.out.println("--- Test Case 1: Polymorphism ---");
        Plan silver = new SilverPlan("Alice", 100f);
        Plan gold = new GoldPlan("Bob", 200f);
        
        System.out.println("Silver Plan Bill: $" + silver.calaculateBill(100f));
        System.out.println("Gold Plan Bill: $" + gold.calaculateBill(200f));
    }
}
