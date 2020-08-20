package com.tuhin.sample.patternmatchins.traditional;

public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("Our dog is barking");
    }

    public void woof() {
        System.out.println("our dog is barking");
    }
}
