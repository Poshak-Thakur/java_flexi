// program in java, write two methods with same name with different parameters will be used.
class Overload {
    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(String s) {
        System.out.println("String value: " + s);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display(10);
        obj.display("Hello");
    }
}