package Lec17;

public class Abstraction extends Abstraction_Demo {

    @Override
    public void Payment() {
        System.out.println("we can pay");
    }

    @Override
    public void ViewBallence() {
        System.out.println("we can check Ballence");
    }
    public Abstraction(){
        super.ShowItem();
        System.out.println("i m inside Abstraction");
    }
}
