class Account {
    String accNum, holder;
    double balance;

    Account(String a, String h, double b) {
        accNum = a;
        holder = h;
        balance = b;
    }

    void transfer(Account target, double amt) {
        if (amt > balance) {
            throw new RuntimeException("Not enough money!");
        }
        balance -= amt;
        target.balance += amt;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account("101", "Poshak", 5000);
        Account a2 = new Account("102", "Rahul", 2000);

        try {
            a1.transfer(a2, 6000); 
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}