public class Ex1 {
    public static void main(String []args){
      
        //    System.out.println(x); 
        A a = new B();
        a.print();
    }
   
}
class A{
    void print(){
        System.out.println("print in A");
    }
}
class B extends A{
    void print(){
        System.out.println("print in B");
    }
}
// interface A
// {
// int x=10;
// }
// interface B
// {
// int x=100;
// }

// abstract class demo
// {
//    public int a;
//    demo()
//    {
//        a = 10;
//    }
//    abstract public void set();
//    abstract public void get();
// }

// abstract class demo
// {
//    public int a;
//    demo()
//    {
//        a = 10;
//    }
//    abstract public void set();
// //    final public void get();
// }