//instance method example in java
public class Test5 {
    String name;
    void display() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Test5 obj = new Test5();
        obj.name = "John";
        obj.display();
    }
}
