//java program to demonstrate command line arguments and parameterized method
public class CommandLineExample {

    // Parameterized method
    static void displayInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]) {

        // Command line input
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        // Method call
        displayInfo(name, age);
    }
}
 
