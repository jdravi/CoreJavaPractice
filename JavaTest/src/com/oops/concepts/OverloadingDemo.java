package com.oops.concepts;
/*
* overloading : within class, same method name, different signature(in terms of no of args, type, order of argument )
*
* info : if exact method not found then compiler looks for higher order data type
* */
public class OverloadingDemo {

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
    }
}
