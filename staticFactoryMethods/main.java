package org.example;

import org.example.staticFactoryMethods.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        var person = new Person();
        System.out.println(person.getInstance("anas","elmakhloufi",20));
    }
} 