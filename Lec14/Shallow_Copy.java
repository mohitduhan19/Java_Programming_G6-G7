package Lec14;


public class Shallow_Copy {
   static class Movie{
        int duration = 100;
        String genre = " Action";
        double rating = 9.0;
    }
    public static void main(String[] args) {
     Movie avenger = new Movie();
     System.out.println(avenger.duration + " " + avenger.genre + " " + avenger.rating);

     Movie copy = avenger;
     System.out.println(copy.duration + " " + copy.genre + " " + copy.rating);

     copy.duration = 50;
     System.out.println(avenger.duration + " " + avenger.genre + " " + avenger.rating);
     System.out.println(copy.duration + " " + copy.genre + " " + copy.rating);

    }
}
