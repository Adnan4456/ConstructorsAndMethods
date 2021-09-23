package com.company;

//create abstract class with abstract method
abstract class WillHaveSubTypes{

    //abstract methods can not be private. it will give error.
    public abstract void doXYourWay();
    public abstract String toString();
    protected abstract void doYYourWay();


    //Here we create a final method in an abstract class
    final void doZOnlyOneWay(){
        System.out.println("Z can be done this way...");
    }
}

public class FinalMethodExample extends WillHaveSubTypes{

    public static void main(String[] args) {

        //We instantiate an object and test all the method.
        FinalMethodExample e = new FinalMethodExample();
        e.doXYourWay();
        e.doYYourWay();e.doZOnlyOneWay();
        e.toString();
        //print the Object
        System.out.println(e);
    }

    //implementing abstract method.
    @Override
    public void doXYourWay() {
        System.out.println("Implement X my way");
    }

    @Override
    public String toString() {
        //It try to exceute parent class toString method.That is abstract
        //and give error.
        // return super.toString();

        return "Not implemented yet ";
    }

    //implementing abstract method.
    @Override
    protected void doYYourWay() {
        System.out.println("Implement Y my way");
    }
}
