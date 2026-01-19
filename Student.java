//instance variable example in java 
class Student{
    int id;
    String name;

    public static void main(String[] args){
        Student s1 = new Student();
        s1.id = 136;
        s1.name = "Poshak";
        System.out.println("ID: " + s1.id + ", Name: " + s1.name);
        Student s2 = new Student();
        s2.id = 137;
        // s2.name = "John";
        System.out.println("ID: " + s2.id + ", Name: " + s2.name);
    }
}

