package com.tuhin.sample.patternmatchins.traditional;

public class Cat implements Animal {

    @Override
    public void move() {
        System.out.println("our cat is moving");
    }

    public void meow() {
        System.out.println("our cat is making some sound");
    }
}
