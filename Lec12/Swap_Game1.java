package Lec12;

public class Swap_Game1 {
    static class  Movie{
        Movie(){
            duration = 100;
            genre = "untitled";
            rating = 0.0;
        }
        private   int duration;
        private String genre ;
        private double rating;

        public void setDuration(int newDuration){
            duration = newDuration;
        }
        public void setGenre(String newGenre){
              genre = newGenre;
        }
        public void setRating(double newRating){
            rating = newRating;
        }

        public int getDuration(){return duration;};
        public double getRating(){return rating;};
        public String getGenre(){return genre;};

        Movie(int duration , String genre , double rating){
            setDuration(duration);
            setGenre(genre);
            setRating(rating);
        }
        Movie(Movie other){
            setRating(other.rating);
            setDuration(other.duration);
            setGenre(other.genre);
        }
    }
    public static void swap(Movie a1, Movie a2){
        Movie a3 = a1;
        a1 = a2;
        a2 = a3;
    }
    public static void main(String[] args) {
        Movie a1 = new Movie();
        a1.setDuration(120);
        System.out.println(a1.getDuration());

        Movie a2 = new Movie();
        a2.setDuration(150);
        System.out.println(a2.getDuration());

        swap(a1 , a2);

        System.out.println(a1.getDuration());
        System.out.println(a2.getDuration());
    }
}
