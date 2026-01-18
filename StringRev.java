//string reversal using predefined function and without using predefined function
class StringRev{
    public static void main(String[] args){
        String str = "HELLO";
        String rev1 = new StringBuilder(str).reverse().toString();      //using predefined function
        System.out.println("Reversed using predefined function: " + rev1);


        String rev2 = "";       //without using predefined function
        for(int i = str.length() - 1; i >= 0; i--){
            rev2 += str.charAt(i);
        }
        System.out.println("Reversed without predefined function: " + rev2);
    }
}