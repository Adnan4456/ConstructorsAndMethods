package com.company;

public class Quiz28 {
    String name;
    int age;

    Quiz28(String name) {
        this.name = name;
    }

    void Quiz28(String name, int age) { // Line 1
        this.name = name;
        this.age = age;
    }

    static public void main(String[] args) {
     //   Quiz28 a = new Quiz28(); // Line 2
        Quiz28 b = new Quiz28("Mary");  // Line 3
    //    Quiz28 c = new Quiz28("Mary", 25);  // Line 4
        b.Quiz28("Mary", 25);  // Line 5
    }
}
