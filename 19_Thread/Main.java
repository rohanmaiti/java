public class Main{
    public static void main(String []args){
    // type-01
    MyThread t1 = new MyThread("ThreadName");
    // t1.start(); // it autometically invoke run() function

    // type-02
    // MyThread t = new MyThread();
    // Thread t1 = new Thread(t);


    t1.start();
    try {
    t1.join();
    } catch (Exception e) {
    }
    for(int i=0;i<100;i++)
    {
        System.out.println("main");
    }


    // System.out.println(t1.getName());
    // System.out.println(Thread.currentThread().getName()); // return name of current thread .. main


    }
}

// type-01
class MyThread extends Thread{

    public MyThread(String s){
        super(s);
    }
    public void run(){ // this is the function that has to be overloded
    String s = "";
    for(int i=0;i<100;i++){
        System.out.println("My thread");
        // s += i;
        try {
        // Thread.sleep(100); // will hold 100 milisec
        // Thread.yield();
        } catch (Exception e) {}
    }

    }
}


// type-02
// class MyThread   implements Runnable{
//  public void run(){
//     System.out.println("My thread");
//  }
// }