public class Main5{
    public static void main(String []args){
    // A obj = new A();
    // obj.print();
    B obj = new B();
    obj.print1();
    obj.print2();

    }
}

abstract class A{
    public void print1(){
        System.out.println("Print1 called");
    }
    abstract public void print2();
}

class B extends A{
//  public void print2(){
//         System.out.println("Print2 called");
//  }
}