package com.company;

public class Person {
    int age;
    String name;
    String surname;
    float height;
    boolean isMarried;

    public Person(){}


    public Person(int age, String name, String surname, float height){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;

    }

    public void sayYourName(){
        System.out.println(this.name);
    }

    public Person(int age, String name, String surname, float height, boolean isMarried){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.isMarried = isMarried;

    }


}
