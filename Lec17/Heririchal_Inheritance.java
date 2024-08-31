package Lec17;

public class Heririchal_Inheritance {
   static class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }

    // Derived class inheriting from Animal
   static class Dog extends Animal {
        void bark() {
            System.out.println("Barking...");
        }
    }

    // Another derived class inheriting from Animal
  static   class Cat extends Animal {
        void meow() {
            System.out.println("Meowing...");
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Dog can access methods from Animal class
        dog.eat();   // Inherited from Animal class
        dog.bark();  // Defined in Dog class

        // Cat can access methods from Animal class
        cat.eat();   // Inherited from Animal class
        cat.meow();  // Defined in Cat class
    }
}
