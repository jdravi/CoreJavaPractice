package com.oops.concepts;

class Animal{

}
class Monkey extends Animal{


}

class Test{

    public void m1(Animal animal){
        System.out.println("Animal Version");
    }

    public void m1(Monkey monkey){
        System.out.println("Monnekey version");
    }

}

public class OverloadingDemo2 {


    public static void main(String[] args){

        Test test = new Test();
        //Case1
        Animal animal = new Animal();
        test.m1(animal);
        ///case 2
        Monkey monkey = new Monkey();
        test.m1(monkey);
        //case 3
        Animal animal1 = new Monkey();
        test.m1(animal1); // output : animal version : this is called static binding or compile time resolution

    }

}
