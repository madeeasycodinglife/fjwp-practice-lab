package com.madeeasy.week1.session4.assignment2;

/**
 * The type Animal.
 */
class Animal {
    /**
     * Make sound.
     */
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

/**
 * The type Dog.
 */
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

/**
 * The type Cat.
 */
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

/**
 * The type AbstractionExample.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Calling methods:");
        animal.makeSound();        // Calls the Animal class method
        dog.makeSound();         // Calls the overridden Dog class method
        cat.makeSound();         // Calls the overridden Cat class method
    }
}

/**
 * Calling methods:
 * The animal makes a sound.
 * The dog barks.
 * The cat meows.
 */