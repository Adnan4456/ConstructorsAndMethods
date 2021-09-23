package com.company;


// The Calculator class demonstrates overloading
// static methods.  Each method prints a unique message so we can
// understand which method was picked by the JVM
class Calculator {
    public static long add(int a, Double f) {
        System.out.println("int + Double");
        long result = (long) (a + f);
        return result;
    }

    //if int not found compiler will  chose its own wrapper class.
//    public static long add(int a, Integer b) {
//        System.out.println("int + Integer");
//        return a + b;
//    }
    //wrapper class of widening data type is last option.
    public static long add(int a, Long b) {
        System.out.println("int + long");
        return a + b;
    }

    //compile error . because it will get confuse  which constructor it will use
    //we also have int ...a constructor. it also take array of int like below constructor takes.
//    public static long add(int a, int... b) {
//        System.out.println("Var args int");
//
//        int total = 0;
//        for (int val : b) {
//            total += val;
//        }
//        return total;
//    }

    public static long  add(int... a) {
        System.out.println("Var args int");

        int total = 0;
        for (int val : a) {
            total += val;
        }
        return total;
    }
}

public class OverloadTests {
    public static void main(String[] args) {

        // Testing Calculator with multiple primitive data types
        var result = Calculator.add(1, 2);
        System.out.println("result = " + result);

        result = Calculator.add(1, 2, 3);
        System.out.println("result = " + result);

        result = Calculator.add(1, 10l);
        System.out.println("result = " + result);

        result = Calculator.add(1, 12.3);
        System.out.println("result = " + result);

        //Error. because float will not go to Double wrapper class.
        //But it can go to double primitive  data type.
//        result = Calculator.add(1, 12.3f);
 //       System.out.println("result = " + result);
    }
}