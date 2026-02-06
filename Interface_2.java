// Interface 1
interface InterfaceA {
    void show();
}

// Interface 2
interface InterfaceB {
    void show();
}

// Class implementing both interfaces (Multiple Inheritance of Type)
// This solves the Diamond Problem because there is no conflicting implementation logic 
// inherited from InterfaceA or InterfaceB. The class defines its own logic.
class ConcreteClass implements InterfaceA, InterfaceB {
    public void show() {
        System.out.println("Diamond Problem Solved: I am the specific implementation for this class.");
    }
}


public class Interface_2 {
        public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        
        // No ambiguity here because the logic is inside ConcreteClass, 
        // not inherited from the interfaces.
        obj.show(); 
    }
}
