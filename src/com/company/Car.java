package com.company;

public class Car {

    int year;
    double volume;
    String model;
    Person person;

    public Car(int y, double v, String m) {
        this.year = y;
        this.volume = v;
        this.model = m;
        person = setDefaultPerson();
    }

    public Person setDefaultPerson(){
        Person p = new Person(30, "Ivan", "Ivanov", 180.4f);
        return p;

    }

}
