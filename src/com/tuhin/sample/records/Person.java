package com.tuhin.sample.records;

record Person(String firstName, String lastName) {
}

class Test {

    public static void main(String[] args) {

        Person jane = new Person("Jane", "Dae");
        Person johnCopy = new Person("John", "Doe");

        System.out.println(jane.toString());
        System.out.println(johnCopy.toString());
    }

}
