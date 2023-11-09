package org.example.staticFactoryMethods;

import java.util.concurrent.ExecutionException;

public class Person {

    private String name;
    private String lastName;
    private int age;


    // static factory method
    // Here are some of the advantages of using static factory methods over constructors:
    // More flexibility:
    // More control 
    // More readable
    public static Person getInstance(String name , String lastName , int age){
        var person = new Person();
        person.name = name;
        person.lastName = lastName;
        person.age = age;
        if(name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty");
        if(age < 18 || age == null || age.isEmpty()) throw new IllegalArgumentException("age cannot be less than 18");
        return person;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
