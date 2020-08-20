package com.tuhin.sample.patternmatchins.enhancedinstanceof;

import com.tuhin.sample.patternmatchins.traditional.Animal;
import com.tuhin.sample.patternmatchins.traditional.Cat;
import com.tuhin.sample.patternmatchins.traditional.Dog;

public class EnhancedInstanceOfCheck {

    public static void main(String[] args) {

        Animal animal = new Dog();

        if (animal instanceof Cat cat) {
            cat.meow();
        } else if (animal instanceof Dog dog) {
            dog.woof();
        }
    }
}
