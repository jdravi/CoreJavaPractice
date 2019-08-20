package com.oops.concepts;
/*
* can achieve with the inheritance , same method name and signature but different implementation
* When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type)
* as a method in its super-class,then the method in the subclass is said to override the method in the super-class
*Rules for method overriding:
* Overriding and Access-Modifiers : can allow more, but not less
* final methods cant be override
* static methods cant be override
* Private methods can not be overridden
* The overriding method must have same return type (or subtype :
*        From Java 5.0 onwards it is possible to have different return type for a overriding method in child class,
*        but child’s return type should be sub-type of parent’s return type ( co-varient return type)
*
* Overriding and abstract method ; meant for overriding
*
*
* */
class Parent {

    public void  marrige(){
        System.out.println("son will mary with girl X");
    }

    public final void show(){
        System.out.println("parent show called ");
    }
    public static void display(){
        System.out.println("Parent display callled ");
    }

}

class  Child extends Parent {
    @Override
    public void marrige(){
        System.out.println("I will marry with girl y");
    }

    //public void show(){} // not possible bcz final method cant be overridden
    public static void display(){
        System.out.println("child static method called ");
    }

}
public class OverridingDemo {

    public static void main(String[] args) {

//        Child c = new Child();
//        c.marrige();
//        Child.display();
//        Parent.display();

        Parent p = new Child();
        p.display(); // will call the parent method bcs display is not overriden
        p.marrige();
    }
}
