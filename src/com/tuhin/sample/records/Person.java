package com.tuhin.sample.records;

record Person(String firstName, String lastName) {

    static int x;

//    We can also add constructors, and modify the canonical constructor
//    (the one that takes the two String parameters). If we want to override
//    the canonical constructor, we can omit the parameters and the assignments
//    to the fields:

    public Person {
        if (firstName == null && lastName == null) {
            try {
                throw new IllegalAccessException("Firstname and lastname can not be null");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    //We can define static methods and instance methods that can operate on the state of the object:
    public static void doX() {
        x++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Test {

    public static void main(String[] args) {

        Person jane = new Person("Jane", "Dae");
        Person johnCopy = new Person("John", "Doe");

        System.out.println(jane.toString());
        System.out.println(johnCopy.toString());
    }

}
