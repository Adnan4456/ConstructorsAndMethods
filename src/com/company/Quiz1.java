package com.company;

class SuperTest{

   // public SuperTest() {}
    public SuperTest(int a){}

    public SuperTest() {

    }

}

public class Quiz1 extends SuperTest{
    int first , second , third;

    public Quiz1(int x , int y)
    {
        //it will call parent conctructor no parameter.
        first  =x;
        second = y;
    }
    public Quiz1(int a )
    {
        super(a);
    }
}
