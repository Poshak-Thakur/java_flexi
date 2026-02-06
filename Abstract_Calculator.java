import java.util.Scanner;
// 1. Abstract class (The Blueprint)
abstract class Calculator {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
}

class MyCalculator extends Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
}

public class Abstract_Calculator {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        MyCalculator calc = new MyCalculator();

        System.out.print("Enter first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter second number: ");
        int num2 = s.nextInt();

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));

        s.close();
    }
    
}
