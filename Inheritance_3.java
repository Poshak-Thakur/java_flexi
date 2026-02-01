// Demonstration of 'this' and 'super' keywords in Java
// Parent Class
class Symbiosis {

    String course = "General Program";

    void enrolled() {
        System.out.println("This student is enrolled");
    }
}

// Child Class
class Student extends Symbiosis {

    String course = "CSE";

    void enrolled() {

        // Using super to call parent method
        super.enrolled();

        // Using this to refer to child class variable
        System.out.println("This student enrolled in " + this.course);

        // Using super to refer to parent class variable
        System.out.println("Parent course is: " + super.course);
    }
}

// Main Class
public class Inheritance_3 {
    public static void main(String[] args) {

        Student s = new Student();
        s.enrolled();
    }
}
