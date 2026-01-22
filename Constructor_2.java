//Parametarized constructor to find 1. sum 2.difference 3.product of two numbers 4. division of two numbers using user choice

import java.util.Scanner;
class Constructor_2{
    int num1, num2;
    //parameterized constructor
    Constructor_2(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }                   

    void sum(){
        System.out.println("Sum: " + (num1 + num2));
    }

    void difference(){
        System.out.println("Difference: " + (num1 - num2));
    }

    void product(){
        System.out.println("Product: " + (num1 * num2));
    }

    void division(){
        if(num2 != 0){
            System.out.println("Division: " + ((double)num1 / num2));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        Constructor_2 obj = new Constructor_2(n1, n2);

        System.out.println("Choose an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Division");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                obj.sum();
                break;
            case 2:
                obj.difference();
                break;
            case 3:
                obj.product();
                break;
            case 4:
                obj.division();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}