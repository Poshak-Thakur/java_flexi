// passing two variables inside a function with float data types and performing their addition inside the  main function using double data types. 
public class Add {
    public static double add(float a, float b) {
        return (double)(a + b);
    }

    public static void main(String[] args) {
        float x = 5.5f;
        float y = 3.2f;
        double result = add(x, y);
        System.out.println("Sum: " + result);
    }
}

//for user input
// import java.util.Scanner;
// public class Add {
//     public static double add(float a, float b) {
//         return (double)(a + b);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         float x = scanner.nextFloat();
//         System.out.print("Enter second number: ");
//         float y = scanner.nextFloat();
//         double result = add(x, y);
//         System.out.println("Sum: " + result);
//         scanner.close();
//     }
// }