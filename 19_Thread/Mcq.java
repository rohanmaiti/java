public class Mcq{
    public static void main(String []args){
    Counter c = new Counter();
    MyThread t1 = new MyThread(c);
    MyThread t2 = new MyThread(c);
    System.out.println(t1.getState());
    t1.start();
    System.out.println(t1.getState());
    t2.start();
    try{
    t1.join();
    }catch(Exception e){

    }
    
    try {
    t2.join();
    } catch (Exception e) {

    }
    System.out.println(t1.getState());
    System.out.print(c.getCount());
    }
}
class Counter{
int count = 0;
public void increment(){   // avoid that 
    count++;
}
public int getCount(){
    return  count;
}
}
class MyThread extends Thread{
Counter c ;
public MyThread(Counter c1){c = c1;}
public void run(){
    for(int i=0;i<1000;i++){
        c.increment();
    }
}
}