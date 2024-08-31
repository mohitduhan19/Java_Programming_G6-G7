package Lec14;

public class Deep_Copy {
   static class Movie{
        int duration = 100;
        String genre = " Action";
        double rating = 9.0;
        Movie(){};
        Movie(Movie other){
            this.duration = other.duration;
            this.genre = other.genre;
            this.rating=other.rating;
        }
    }
    public static void main(String[] args) {
        Movie avenger = new Movie();
        System.out.println(avenger.duration + " " + avenger.genre + " " + avenger.rating);

        Movie deepcopy = new Movie(avenger);
        System.out.println(deepcopy.duration + " " + deepcopy.genre + " " + deepcopy.rating);

        deepcopy.duration = 50;
        System.out.println(avenger.duration + " " + avenger.genre + " " + avenger.rating);
        System.out.println(deepcopy.duration + " " + deepcopy.genre + " " + deepcopy.rating);

    }
}
