package com.company;




// This class demonstrates static fields, a static initializer, and
// a static method
class StaticStuff {
    // adding final with static will not initialize the class to use this variable.
    static final String appName = "A Good App";
//    static final String appName = "A Good App";

    // static initializer
    static {
        System.out.println("Initializing StaticStuff class");
        StaticStuff.counter++;
    }

    static void printAppName() {
        System.out.println("Application Name:  " + appName +
                " : counter  = " + counter);
    }

    static int counter;
}

public class StaticElementTests {
    public static void main(String[] args) {
        //Creating an object .
        //But static initializer block will run first.
//        StaticStuff stuff = new StaticStuff();
 //       System.out.println("Creating instance of StaticStuff.");

        //Just declare Object.it will run static initializer block first.
        StaticStuff s = null;

        // We access static member of the StaticStuff class
        System.out.println("Application Name: " + s.appName);
    }
}