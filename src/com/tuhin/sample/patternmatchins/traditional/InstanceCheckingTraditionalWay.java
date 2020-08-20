package com.tuhin.sample.patternmatchins.traditional;

public class InstanceCheckingTraditionalWay {

    public static void main(String[] args) {

        Animal animal = new Dog();

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
            // other cat operations
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.woof();
            // other dog operations
        }
    }
}
