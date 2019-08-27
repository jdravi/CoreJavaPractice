package thread.concepts;

public class ThreadUsingRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName()  + Thread.currentThread().getPriority());
        }
    }



    public static void main(String[] args){

        ThreadUsingRunnable threadUsingRunnable = new ThreadUsingRunnable();

        Thread t = new Thread(threadUsingRunnable);

        t.start();

        for(int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority());
        }


        Thread t1 = new Thread(new Runnable(){

            public void run(){
                for(int i=0; i<10;i++){
                    System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority());
                }
            }

        });

        t1.start();
    }
}
