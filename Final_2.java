// 1. FINAL CLASS
final class SymbiosisGradingSystem {
    void showGradeingRule() {
        System.out.println("Grading System: Absolute Grading (Fixed for SIT)");
    }
}

// Parent Class
class Student {
    final long PRN; 
    String course;

    Student(long prn, String course) {
        this.PRN = prn;
        this.course = course;
    }

    final void showInstituteDetails() {
        System.out.println("Institute: Symbiosis Institute of Technology (SIT), Pune");
        System.out.println("University: Symbiosis International (Deemed University)");
    }

    void displayStudentProfile() {
        System.out.println("Student PRN: " + PRN);
        System.out.println("Course: " + course);
    }
}

// Child Class attempting to override
class SITComputerScienceStudent extends Student {
    
    SITComputerScienceStudent(long prn) {
        super(prn, "B.Tech Computer Science");
    }
}

public class Final_2 {
    public static void main(String[] args) {
        SITComputerScienceStudent student = new SITComputerScienceStudent(24070122136L);

        // Accessing Final Method
        student.showInstituteDetails();
        
        // Accessing Student Details
        student.displayStudentProfile();

        // Accessing Final Class
        SymbiosisGradingSystem grading = new SymbiosisGradingSystem();
        grading.showGradeingRule();
    }
}