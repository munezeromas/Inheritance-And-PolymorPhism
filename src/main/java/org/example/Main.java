package org.example;

public class Main {

    public static void main(String[] args) {
        Animal A = new Animal();
        System.out.print("ooh my God!! ");
        A.makeSound();
        Bird b = new Bird();
        b.makeSound();
        System.out.print("Did you know that Birds are ");
        b.fly();
        // Polymorphism
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal GB = new Bird();

        dog.makeSound();
        cat.makeSound();
        GB.makeSound();
        }}
