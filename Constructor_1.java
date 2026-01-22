//java program to demonstrate parameterized constructor to print name, roll, prn of user using user input
import java.util.Scanner;
class Constructor_1{
    String name;
    int roll;
    int prn;

    //parameterized constructor
    Constructor_1(String n, int r, int p){
        name = n;
        roll = r;
        prn = p;
    }                   
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("PRN: " + prn);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter PRN: ");
        int prn = sc.nextInt();

        Constructor_1 obj = new Constructor_1(name, roll, prn);
        obj.display();

        sc.close();
    }
}