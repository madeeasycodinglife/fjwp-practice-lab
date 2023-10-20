package com.madeeasy.week3.session2.assignment2;

/**
 * The type Animal.
 */
class Animal {
    /**
     * Make sound.
     */
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

/**
 * The type Dog.
 */
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

/**
 * The type Cat.
 */
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

/**
 * The type AbstractionExample.
 */
public class MethodOverrideExample {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
    }
}

/**
 * o/p
 * ----
 * The cat meows.
 * The dog barks.
 */