package Lec18;

interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void play() {
        System.out.println("Dog is playing...");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}
public class Multiple_inherti {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
        dog.bark();
    }
}
