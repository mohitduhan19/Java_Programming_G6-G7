package Lec18;

public class TollBooth {
    private String BoothLocation;
    private int NoOfCarrPassed;
    private double totalAmmountCollected;
    public TollBooth(String Location){
        this.BoothLocation=Location;
        this.NoOfCarrPassed=0;
        this.totalAmmountCollected=0.0;
    }
    public void DisplayBoothDetail(){
        System.out.println("BoothLocation"+BoothLocation);
        System.out.println("total car passed "+NoOfCarrPassed);
        System.out.println("Ammount Collect "+totalAmmountCollected);
    }
    public void CarPassed(Double TallAmmount){
    for(int i=0;i<10;i++){
        NoOfCarrPassed++;
        totalAmmountCollected=totalAmmountCollected+TallAmmount;
        System.out.println("car passed tall amoount collected "+TallAmmount);
    }
    }
}
