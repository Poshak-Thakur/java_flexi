public class MultipleCatchExample {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Error: Null pointer exception! Object is null.");

        }catch(Exception e){
            System.out.println("Error: An unexpected exception occurred: " + e.getMessage());
        }    
    }
}
