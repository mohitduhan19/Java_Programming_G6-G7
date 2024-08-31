package Lec17;

public class Inheritance {
   static class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }

    // Derived class inheriting from Animal
   static class Mammal extends Animal {
        void breathe() {
            System.out.println("Breathing...");
        }
    }

    // Derived class inheriting from Mammal
    static class Dog extends Mammal {
        void bark() {
            System.out.println("Barking...");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Dog can access methods from Animal and Mammal classes
        dog.eat();      // Inherited from Animal class
        dog.breathe();  // Inherited from Mammal class
        dog.bark();     // Define
    }
}
