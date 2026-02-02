abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("This dog barks");
    }
}
public class Abstract_Example_2 {
    public static void main (String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}
