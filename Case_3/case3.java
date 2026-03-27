package Case_3;
abstract class Media{
    private String title;
    private int duration;
    protected boolean isPremium;
    public void getDetails(){
        System.out.println("Title: " + title + ", Duration: " + duration + " mins");
    }
    abstract void playContent();
}
public class case3 {
    
}
