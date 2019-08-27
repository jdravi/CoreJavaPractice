package thread.demo;

import java.util.SortedMap;
/*Example of notify(): notify to one single thread (which one cant predict ) and notifyAll() : notify to all waiting thread*/
class MythreadOne extends Thread{
    @Override
    public void run() {
        synchronized (this){
            System.out.println("Started .." + Thread.currentThread().getName());
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +  "notified" );
        }
    }
}

class MythreadTwo extends Thread{
    private MythreadOne t1;
    MythreadTwo(MythreadOne t1){
        this.t1 = t1;
    }

    @Override
    public void run() {

        synchronized (this.t1){

            System.out.println("Started .." + Thread.currentThread().getName());
            try {
                this.t1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() +  "notified" );

        }
    }
}

class MythreadThree extends Thread{
    private MythreadOne t1;
    MythreadThree(MythreadOne t1){
        this.t1 = t1;
    }

    @Override
    public void run() {
        synchronized (this.t1){
            System.out.println("Started .." + Thread.currentThread().getName());
        /* logic to notify all waiting object with notify only  or use notifyAll()*/
        /* for (int i =0;i<Thread.activeCount();i++){
                this.t1.notify();

            }*/
             this.t1.notify();
            //this.t1.notifyAll();
            //System.out.println(Thread.currentThread().getName() +  "notified" );
        }
    }
}

public class NotifyDemo {

    public static void main(String[] args) throws InterruptedException {

        MythreadOne one = new MythreadOne();// wait
        MythreadTwo two = new MythreadTwo(one); //wait
        MythreadThree three = new MythreadThree(one);//notify

        Thread t1 = new Thread(one,"wait-1");
        Thread t2 = new Thread(two,"wait-2");
        Thread t3 = new Thread(three,"NotifyThread");

        t1.start();
        t2.start();
        Thread.sleep(1000);
        t3.start();
    }
}
