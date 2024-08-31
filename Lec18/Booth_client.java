package Lec18;

public class Booth_client {
    public static void main(String[] args) {
        TollBooth sc=new TollBooth("NH26");
        sc.CarPassed(60.00);
        sc.DisplayBoothDetail();
    }
}
