class Animal{
    void eat (){
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("This dog barks");
    }
}
public class Multiple_inherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); 
        dog.bark();
    }
}