public class FinalVariableExamples {
    final int max=100;
    void display(){
        System.out.println("Max value:" + max);
    }
    public static void main(String[] args) {
        FinalVariableExamples obj = new FinalVariableExamples();
        obj.display();
    }
}