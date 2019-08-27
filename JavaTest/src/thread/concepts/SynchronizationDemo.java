package thread.concepts;


class Test{

    public synchronized void display(String message){

        for(int i=0; i<10;i++){
            System.out.println("Display in test " + Thread.currentThread().getName() + "Message : "+ message);
        }
    }

    public synchronized void m(){
        System.out.println("inside m function");
    }


}



class DisplayThread extends Thread{

    private Test t;
    private String message;

    DisplayThread(Test t,String message){
        this.t = t;
        this.message = message;
    }
    public void run(){
        this.t.display(this.message);
        this.t.m();
    }
}

public class SynchronizationDemo {




    public static void main(String[] args){

        Test test = new Test();

        Thread t = new DisplayThread(test,"Ravi");
        Thread t2 = new DisplayThread(test,"Prakash");
        Thread t3 = new DisplayThread(test,"check");
        t.start();
        t2.start();
        t3.start();



    }
}
