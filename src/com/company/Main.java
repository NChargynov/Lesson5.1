package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Car c1 = new Car(2012, 2.0, "CRV");
        Car c2 = new Car(2009, 3.5, "Camry");


        System.out.println(c1.model + " " + c1.year + " " + c1.volume);
        c2.year = 2010;
        System.out.println(c2.model + " " + c2.year + " " + c2.volume);
        System.out.println(c1.person.name);

        Person p = new Person();
        p.age = 15;
        p.name = "Jack";
        p.surname = "Sparrow";
        p.height = 180.3F;
        p.sayYourName();

        Person p2 = new Person(25, "Maksat ", "Alkov", 182.3f);

        System.out.println(p2.age + " " + p2.name + " " + p2.surname + " "+ p2.height);
        c1.person = p2;

        System.out.println(c1.person.name);

        Person p3 = new Person(34, "Ali", "Maksatov", 185.5F, true);

    }
}
