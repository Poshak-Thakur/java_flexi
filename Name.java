 //to store name using an array of characters taking input from user

// class string {
//     public static void main(String[] args) {
//         char[] name = new char[20];
//         java.util.Scanner scanner = new java.util.Scanner(System.in);
//         System.out.print("Enter your name: ");
//         String input = scanner.nextLine();
//         int length = Math.min(input.length(), name.length);
//         for (int i = 0; i < length; i++) {
//             name[i] = input.charAt(i);
//         }
//         System.out.print("Your name is: ");
//         for (int i = 0; i < length; i++) {
//             System.out.print(name[i]);
//         }
//         scanner.close();
        
//     }
// }

// class string{
//     public static void main(String[] args){
//         char[] name = {'J','O','H','N'};
//         System.out.print("Your name is: ");
//         for(int i=name.length-1;i>=0;i--){
//             System.out.print(name[i]);
//         }
//         System.out.println();
    
//     }
// }

// class Name{
//     public static void main(String[] args){
//         String name = "JOHN";
//         String reverse = new StringBuilder(name).reverse().toString();
//         System.out.print("Your name is: " + reverse);
        
//     }
// }

class Name{
    public static void main (String[] args){
        String name = "JOHN";
        String reverse ="";
        for (int i = name.length()-1; i >=0; i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Before reverse: " + name);
        System.out.println("After reversing: " + reverse);
    }
    
}



