import java.util.Scanner;
abstract class Payment{
    private String transactionID;
    private float amount;

    public Payment(String transactionID, float amount) {
        this.transactionID = transactionID;
        this.amount = amount;
    }

    public String getTransactionID() {
        return transactionID;
    }
    // public float getAmount() {
    //     return amount;
    // }
    public abstract void processPayment(float amount);
}

class CreditCardPayment extends Payment{
     public CreditCardPayment(String transactionID, float amount) {
        super(transactionID, amount);
    }
    public void processPayment(float amount) {
        System.out.println("Processing credit card payment including the handeling fee, amount: $ " + (amount + 2 * amount / 100));
    }
}

class UPIpayment extends Payment{
     public UPIpayment(String transactionID, float amount) {
        super(transactionID, amount);
    }
    public void processPayment(float amount) {
        System.out.println("UPI id for transaction: " + getTransactionID());
        System.out.println("Processing UPI payment with no additional fee. Total amount: $" + amount);
    }
}

public class case_1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Select payment method: \n1. Credit Card \n2. UPI \n3. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter transaction ID and amount:");
                String transactionID = sc.next();
                float amount = sc.nextFloat();
                Payment payment = new CreditCardPayment(transactionID, amount);
                payment.processPayment(amount);
            } else if (choice == 2) {
                System.out.println("Enter transaction ID and amount:");
                String transactionID = sc.next();
                float amount = sc.nextFloat();
                Payment payment = new UPIpayment(transactionID, amount);
                payment.processPayment(amount);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
