package thread.concepts;

/*Creating Thread using Thread Class
*
* 1 . extend the thread class
* 2 . override the run method
* 3 . register the thread and start
* */
public class ThreadUsingThreadClass extends Thread{


    public void run(){

        for (int i = 0 ; i<10; i++){

            System.out.println("UserThread " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){

        System.out.println("Start" + Thread.currentThread().getName());


        ThreadUsingThreadClass t = new ThreadUsingThreadClass();
        t.start();

        for (int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
        }


    }

}
