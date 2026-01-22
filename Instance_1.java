// demonstration of instance method in Java
public class Instance_1 {
    String name;
    
    void display() {
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        Instance_1 obj = new Instance_1();
        obj.name = "Your Name";  // initialize the variable
        obj.display();
    }
}