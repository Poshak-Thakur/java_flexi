
class Student {
    String name;
    Student(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Name: " + this.name);
    }
}
public class This_exmp {
    public static void main(String[] args) {
        Student student = new Student("Poshak");
        student.display();
    }
}
