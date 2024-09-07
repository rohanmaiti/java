public class Main{
    public static void main(String []args){
     A obj = new B();
     obj.draw();
     obj.print2();
    }
} 

abstract class A{
    int a;
    A(){
        System.out.println("Inside A constructor");
        a = 0;
    }
   abstract void draw();
    void print(){
        System.out.println("print in A");
    }
    void print2(){
        System.out.println("Printing 2 in A....");
    }
}
class B extends A{
    void draw(){
        System.out.println("Drawing...");
    }
    void print2(){
        System.out.println("Printing 2 in B....");
    }
}