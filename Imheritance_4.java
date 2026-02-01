// Parent Class
class Symbiosis_1 {

    void enrolled() {
        System.out.println("This student is enrolled");
    }
}

// Child Class
class Student_1 extends Symbiosis_1 {

    void enrolled() {
        // Calling parent class method
        super.enrolled();

        // Child class own message
        System.out.println("This student enrolled in CSE");
    }
}

// Main Class
public class Imheritance_4 {
    public static void main(String[] args) {

        Student_1 s = new Student_1();
        s.enrolled();
    }
}
