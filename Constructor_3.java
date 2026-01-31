// this is the java code for the demonstration of constructor calling and the use of this() keyword to call one constructor from another constructor within the same class.
class Demo{
    Demo(){
        this("Default Constructor");
    }
    Demo(String msg){
        System.out.println(msg);
    }
}
public class Constructor_3 {
    public static void main(String[] args){
        new Demo();
    }
}
