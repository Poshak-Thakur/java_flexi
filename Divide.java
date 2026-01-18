// java code to divide two numbers and also check the division by zero error
// public class Divide {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         if (b == 0) {
//             System.out.println("Division by zero error");
//         } else {
//             System.out.println("Result: " + (a / b));
//         }
//     }
// }

// for user input
import java.util.Scanner;
public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int b = scanner.nextInt();
        if (b == 0) {
            System.out.println("Division by zero error");
        } else {
            System.out.println("Result: " + (a / b));
        }
        scanner.close();
    }
}