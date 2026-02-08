public class Test4 {
    public static void main (String[] args){
        Test4 obj = new Test4();
        obj = null;
        System.gc();
    }
}
