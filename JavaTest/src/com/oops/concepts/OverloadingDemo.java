package com.oops.concepts;
/*
* overloading : within class, same method name, different signature(in terms of no of args, type, order of argument )
*
* info : if exact method not found then compiler looks for higher order data type
* */
public class OverloadingDemo {


    public void m1(int x){
        System.out.println("General method");
    }

    //with var arg method
    public void m1(int... x){
        System.out.println("var arg method");
    }



    public void display(String s){
        System.out.println("inside String");
    }

    public void display(int n){
        System.out.println("inside integer");

    }

    public void display(double d){
        System.out.println("inside double");
    }


    public static void main(String[] args) {

        OverloadingDemo overloadingDemo = new OverloadingDemo();
        overloadingDemo.display("H"); // will call string
        overloadingDemo.display('H'); // no char type method so it will go for upcasting i.e inside integer
        overloadingDemo.display(1.2F);// no method for float then it will search  by upcasting , i.e inside double
        overloadingDemo.m1(); // wil call var--arg methd because that ca accept zero are more argumet
        overloadingDemo.m1(2); // wil call general method
        overloadingDemo.m1(1,2,3); // will call arg method
    }
}
