class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class constructor");
    }
}
public class Parent_constructor {
    public static void main(String[] args) {
        new Child();
    }
}
