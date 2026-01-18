// showing of inheritance in java by inheriting parent class properties to child class
class Parent{
    void display (){
        System.out.println("This property is accessed from the parent class.");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("This property is accessed from the child class.");
    }
}

class Inherit {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.show();
    }
}