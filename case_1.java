import java.util.Scanner;

abstract class Payment {
    private String transactionID;
    private float amount;

    public Payment(String transactionID, float amount) {
        this.transactionID = transactionID;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }
    
    public float getAmount() {
        return amount;
    }

    public abstract float processPayment();
}

class CreditCardPayment extends Payment {
     public CreditCardPayment(String transactionID, float amount) {
        super(transactionID, amount);
    }
    
    @Override
    public float processPayment() {
        float total = getAmount() + (getAmount() * 0.02f);
        System.out.println("Processing credit card payment (includes 2% fee). TXN: " + getTransactionID());
        return total;
    }
}

class UPIpayment extends Payment {
     public UPIpayment(String transactionID, float amount) {
        super(transactionID, amount);
    }
    
    @Override
    public float processPayment() {
        System.out.println("Processing UPI payment (0% fee). TXN: " + getTransactionID());
        return getAmount();
    }
}

public class case_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        while (true) {
            System.out.println("\nSelect payment method: \n1. Credit Card \n2. UPI \n3. Run Test Case 3 (Total Array) \n4. Exit");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("Enter transaction ID and amount:");
                String transactionID = sc.next();
                float amount = sc.nextFloat();
                Payment payment = new CreditCardPayment(transactionID, amount);
                
                System.out.println("Total Charged: $" + payment.processPayment());
                
            } else if (choice == 2) {
                System.out.println("Enter transaction ID and amount:");
                String transactionID = sc.next();
                float amount = sc.nextFloat();
                Payment payment = new UPIpayment(transactionID, amount);
                
                System.out.println("Total Charged: $" + payment.processPayment());
                
            } else if (choice == 3) {
                System.out.println("--- Processing Polymorphic Array ---");
                Payment[] payments = {
                    new CreditCardPayment("TXN12345", 1000.0f),
                    new UPIpayment("UPI67890", 1000.0f)
                };
                
                float grandTotal = 0;
                for (Payment p : payments) {
                    grandTotal += p.processPayment(); 
                }
                System.out.println("Grand Total for all payments: $" + grandTotal);
                
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        sc.close(); 
    }
}