interface Animal{
    void sound();
}

class Cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark");
    }
}
public class Interface_Example {
    public static void main(String[] args) {
        Animal a = new Cat();
        Animal b = new Dog();
        a.sound();
        b.sound();
    }
}