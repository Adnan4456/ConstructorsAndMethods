package com.company;

 class OnlyClass{

    //private constructor , the only constructor
    private OnlyClass() {}
     OnlyClass(int a ) {}

    private int classVariable;

    //instance can only  be created within current class
    //or nested class
    private static final OnlyClass instance = new OnlyClass();

    //you can expose the only instance via a static method
    public static OnlyClass getInstance()
    {
        return instance;
    }
    //Or you can make static methods which call methods on the
    // protected instance.
    public static void doSomething(){
       instance.doSomethingRestricted();
    }
    private void doSomethingRestricted()
    {
        this.classVariable++;
        System.out.println("Only one instance of this class exists" +
                " or will ever exist "+classVariable );
    }
}


public class RestrictedObjects {

    public static void main(String[] args) {
        OnlyClass.doSomething();
        //class has only private constructor will not allow to make object .

        //It will give compile time error
        //OnlyClass o = new OnlyClass();
    }
}

//Error..There is no default constructor in  OnlyClass
//So you can not extend a class who has just only private constructor.

//class MyOnlyClass extends OnlyClass{}