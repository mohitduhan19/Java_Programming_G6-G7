package Lec17;

public class Hybrid_Inherit {
  static   class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }

    // Intermediate class inheriting from Animal
   static class Mammal extends Animal {
        void breathe() {
            System.out.println("Breathing...");
        }
    }

    // Base class 2
    static class Bird extends Animal {
        void fly() {
            System.out.println("Flying...");
        }
    }

    // Derived class inheriting from Mammal
   static class Dog extends Mammal {
        void bark() {
            System.out.println("Barking...");
        }
    }

    // Derived class inheriting from Bird
   static class Sparrow extends Bird {
        void chirp() {
            System.out.println("Chirping...");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Sparrow sparrow = new Sparrow();

        // Dog can access methods from Animal and Mammal classes
        dog.eat();      // Inherited from Animal class
        dog.breathe();  // Inherited from Mammal class
        dog.bark();     // Defined in Dog class

        // Sparrow can access methods from Animal and Bird classes
        sparrow.eat();  // Inherited from Animal class
        sparrow.fly();  // Inherited from Bird class
        sparrow.chirp(); // Defined in Sparrow class
    }
}
