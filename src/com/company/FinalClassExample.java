package com.company;

final class FinalEntity{

    private String name;

    FinalEntity(String name)
    {
        this.name = name;
    }
    void doSomething()
    {
        System.out.println("Do something for " + this.name);
    }
}


public class FinalClassExample {

    public static void main(String[] args) {

        //You can create as many instance/Object of a final class.
        //But can not extend.
        FinalEntity f1 = new FinalEntity("a");
        FinalEntity f2 = new FinalEntity("b");
        f1.doSomething();
        f2.doSomething();
    }
}
