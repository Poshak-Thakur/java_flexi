import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

interface Taxable{
    public float calculateTax();
}

abstract class Item{
    int itemID;
    String name;
    float BasePrice;
    Item(int itemID, String name, float BasePrice){
        this.itemID = itemID;
        this.name = name;
        this.BasePrice = BasePrice;
    }
}

class PerishableItem extends Item implements Taxable{
    String expiryDate;
    PerishableItem(int itemID, String name, float BasePrice, String expiryDate){
        super(itemID, name, BasePrice);
        this.expiryDate = expiryDate;
    }
    public float calculateTax(){
        return BasePrice * 0.05f; 
    }
}

class ElectronicItem extends Item implements Taxable{
    int warrantyPeriod;
    ElectronicItem(int itemID, String name, float BasePrice, int warrantyPeriod){
        super(itemID, name, BasePrice);
        this.warrantyPeriod = warrantyPeriod;
    }
    public float calculateTax(){
        return BasePrice * 0.15f; 
    }
}

public class LogistiTech {
    public static void main(String[] args){
        HashMap<String, Item> items = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter you choice: \n1. Add item \n2. Display Items \n3. Search by id \n4. Calculate Total \n5. Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                while(true){
                    System.out.println("Select 1. PerishableItem \n 2.ElectronicItem \n3. Exit");
                    int option = sc.nextInt();
                    if (option == 1){
                        System.out.println("Enter itemID, name, BasePrice, and expiryDate:");
                        int itemID = sc.nextInt();
                        String name = sc.next();
                        float BasePrice = sc.nextFloat();
                        String expiryDate = sc.next();
                        items.put(String.valueOf(itemID), new PerishableItem(itemID, name, BasePrice, expiryDate));
                    }
                    else if (option == 2){
                        System.out.println("Enter itemID, name, BasePrice, and warrantyPeriod:");
                        int itemID = sc.nextInt();
                        String name = sc.next();
                        float BasePrice = sc.nextFloat();
                        int warrantyPeriod = sc.nextInt();
                        items.put(String.valueOf(itemID), new ElectronicItem(itemID, name, BasePrice, warrantyPeriod));
                    }
                    else if (option == 3){
                        break;
                    }

                } 
            } else if (choice == 2) {
                // 1. Extract values from HashMap to ArrayList
                ArrayList<Item> sortedItems = new ArrayList<>(items.values());

                // 2. Sort the list based on BasePrice
                sortedItems.sort((a, b) -> Float.compare(a.BasePrice, b.BasePrice));

                // 3. Display the sorted results
                System.out.println("\n--- Inventory Sorted by Price ---");
                if (sortedItems.isEmpty()) {
                    System.out.println("No items in inventory.");
                } else {
                    for (Item i : sortedItems) {
                        System.out.println("ID: " + i.itemID + " | Name: " + i.name + " | Price: $" + i.BasePrice);
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter Item ID to search: ");
                String searchID = sc.next();
                
                // HashMap provides O(1) lookup speed here
                if (items.containsKey(searchID)) {
                    Item found = items.get(searchID);
                    System.out.println("Item Found: " + found.name + " ($" + found.BasePrice + ")");
                } else {
                    System.out.println("Item with ID " + searchID + " not found.");
                }

            } else if (choice == 4) {
                float totalInventoryValue = 0;
                for (Item i : items.values()) {
                    float tax = 0;
                    // Check if the item implements Taxable interface
                    if (i instanceof Taxable) {
                        tax = ((Taxable) i).calculateTax();
                    }
                    totalInventoryValue += (i.BasePrice + tax);
                }
                System.out.printf("Total Inventory Value (including tax): $%.2f\n", totalInventoryValue);

            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }else {
                System.out.println("Invalid choice. Please try again.");
            }
        }sc.close();
    }
}

