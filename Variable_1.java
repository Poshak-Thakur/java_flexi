//java program using static variable to display student details where college name is comming through static variable
import java.util.Scanner;
class Variable_1{
    String name;
    int prn;
    static String collegeName = "Symbiosis Institute of Technology"; // static variable

    //parameterized constructor
    Variable_1(String n, int r){
        name = n;
        prn = r;
    }                   

    void display(){
        System.out.println("Name: " + name);
        System.out.println("PRN: " + prn);
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter PRN: ");
        int roll = sc.nextInt();

        Variable_1 student = new Variable_1(name, roll);
        student.display();

        sc.close();
    }
}