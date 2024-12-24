public class Main{
    public static void main(String []args){
    B obj = new B("rohan");
    }
}
class A{
    int a ;
    A(){
        System.out.println("Default constructor");
    }
    A(int b){
        this.a = b;
        System.out.println("int constructor");

    }
    A(String s){
        System.out.println("String constructor");
        System.out.println(s);
    }
}

class B extends A{
  B(){
  super(10);
  }
  B(String s){
     super(s);
  }
}