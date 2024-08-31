package Lec17;

public abstract class Abstraction_Demo {
    public abstract void Payment();
    public abstract void ViewBallence();
    public void ShowItem(){
        System.out.println("we can show Item");
    }
   public Abstraction_Demo(){
       System.out.println(" i ma inside Abstraction_Demo");
    }
}
