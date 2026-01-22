//java method to demonstrate static method and static variable
class Static_1{
    static String collegeName = "Symbiosis Institute of Technology"; // static variable

    //static method
    static void displayCollegeName(){
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {
        //calling static method without creating an object
        displayCollegeName();
    }
}