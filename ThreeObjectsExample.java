//java program using static variable to display student details where college name is comming through static variable
// Class 1
class Student {
    void showStudent() {
        System.out.println("Student class object created.");
    }
}

// Class 2
class Teacher {
    void showTeacher() {
        System.out.println("Teacher class object created.");
    }
}

// Class 3
class School {
    void showSchool() {
        System.out.println("School class object created.");
    }
}

// Main class
public class ThreeObjectsExample {
    public static void main(String args[]) {

        // Object of Student class
        Student s = new Student();
        s.showStudent();

        // Object of Teacher class
        Teacher t = new Teacher();
        t.showTeacher();

        // Object of School class
        School sc = new School();
        sc.showSchool();
    }
}