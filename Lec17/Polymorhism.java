package Lec17;

public class Polymorhism {
    static class Animal {
        // Method to be overridden
        void makeSound() {
            System.out.println("Animal makes a sound");
        }

        // Overloaded methods
        void eat() {
            System.out.println("Animal is eating...");
        }

        void eat(String food) {
            System.out.println("Animal is eating " + food);
        }
    }

    // Child class inheriting from Animal
    static class Dog extends Animal {
        // Overriding the makeSound method
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }

        // Overloading the eat method with a different parameter
        void eat(int amount) {
            System.out.println("Dog is eating " + amount + " units of food");
        }
    }
    public static void main(String[] args) {
        // Using parent class reference to create an object
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();  // Polymorphism in action

        // Calling overridden methods
        myAnimal.makeSound();  // Outputs: Animal makes a sound
        myDog.makeSound();     // Outputs: Dog barks

        // Calling overloaded methods
        myAnimal.eat();
        myAnimal.eat("grass");
        myDog.eat();
        myDog.eat("meat");
        ((Dog) myDog).eat(5);
    }

}
