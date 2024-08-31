package Lec13;

public class Constructor {
   static class Animal{
        int eye = 2;
        //Non paramatized
        Animal(){

        }
        //Paramatized
        Animal(int eye){
            this.eye= eye;
        }
        //copy
        Animal(Animal other){
            this.eye = other.eye;
        }
    }
    public static void main(String[] args) {
        //Non paramatized
        Animal animal = new Animal();

        //paramatized
        Animal animal1 = new Animal(2);

        //copy

        Animal animal2 = new Animal(animal1);
    }
}
