//default and parameterized constructor example
class Student {
    String name;
    int age;
    // Student(){               //default constructor
    //     name = "Default Name";
    //     age = 18;
    // }
    Student(String n, int a){   //parameterized constructor
        name = n;
        age = a;
    }

    void Display(){
        System.out.println("Name: " + name + ","+ " Age: " + age);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        student1.Display();
    }
}