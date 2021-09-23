package com.company;

class WhichOne{

    public String thisOne(Integer i) {
        return "Integer mathced";
    }
    public String thisOne(long i){
        return "long matched";
    }
    public String thisOne(short s){
        return "short matched";
    }
    public String thisOne(char... c){
        return "char matched";
    }
    //Adding a method with matching wrapper (Object)
    //It will still match with long
    public String thisOne(Character c){
        return "Character matched";
    }
}

public class OverloadMatches {

    public static void main(String[] args) {
        WhichOne whichOne = new WhichOne();
        char c = 'a';
        System.out.println("Method ( "+ whichOne.thisOne(c)
                    +") was executed for " + c);
    }
}
