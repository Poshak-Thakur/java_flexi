// Example of using 'super' to call a parent class method from a child class.
class Parent {
    void display() {
        System.out.println("Parent class method.");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child class method.");
    }
}

public class Super_exmp {
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}