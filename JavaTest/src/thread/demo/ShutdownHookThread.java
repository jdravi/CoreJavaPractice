package thread.demo;
/*hook thread is used of cleanup activities , it is called when  jvm terminated normally or abnormally*/
class MyThread extends Thread{


    @Override
    public void run() {

            System.out.println("shut down hook task completed..");

    }
}
public class ShutdownHookThread {

    public static void main(String[] args) {
        Runtime r=Runtime.getRuntime();
        Thread t1 =new MyThread();
        r.addShutdownHook(t1);
        System.out.println("Now main sleeping... press ctrl+c to exit");
        try{
            Thread.sleep(3000);
        }catch (Exception e) {
            System.out.println("Exception..");
        }
    }

}


