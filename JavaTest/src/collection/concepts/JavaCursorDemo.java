package collection.concepts;

/*cursor is use in java to iterate the collection object
*
* 3 type of cursor is present in Java
*
*  Enummeration : only for legacy classes (Stack ,vector) , only read operation , vectorObj.elements() : 2 method
*  Iterator : universal cursor can apply for any collection , read/write(add),forward direction only :3 method
*  ListIterator : only for List collection , read, add,remove, replace ,both direction movement : 9 method
* */


import java.util.*;

class CursorDemo{

    private static Vector vector = new Vector();

    public static void runEnummeration(){

        vector.addElement(2);
        vector.addElement(7);
        vector.addElement(3);
        vector.add(9);


        /*printing value of vector*/

        Enumeration enummeration = vector.elements();

        while(enummeration.hasMoreElements()){
            System.out.println(enummeration.nextElement());

        }

    }
    public static void runIterator(){

        vector.addElement(2);
        vector.addElement(7);
        vector.addElement(3);
        vector.add(9);


        /*printing value of vector*/

        System.out.println("Before  remove operation");
        System.out.println(vector);
        Iterator iterator = vector.iterator();
        System.out.println("printing iterator values ");
        while(iterator.hasNext()){
            int num  = (int) iterator.next();
            System.out.println(num);

            if(num==3){
                iterator.remove();
            }

        }

        System.out.println("After remove operation");
        System.out.println(vector);

    }


    public static void ListIterator(){


        List list = new ArrayList();
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(9);


        System.out.println("Before  remove operation : list ");
        System.out.println(list);
        ListIterator listIterator = list.listIterator();
        System.out.println("printing iterator values : list ");


        while(listIterator.hasNext()){
            int num  = (int) listIterator.next();
            System.out.println("next number" + num);


            if(num==3){
                //listIterator.remove();
                 //listIterator.add(12);
                 listIterator.set(10);
            }
        }

        System.out.println("After remove operation : list ");
        System.out.println(list);

        while (listIterator.hasPrevious()){
            if (listIterator.hasPrevious()){
                System.out.println("prev number" + listIterator.previous());
            }
        }
    }
}


public class JavaCursorDemo {

    public static void main(String[] args){
        CursorDemo.runEnummeration();
        CursorDemo.runIterator();
        CursorDemo.ListIterator();
    }
}
