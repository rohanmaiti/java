public class Main{
public static void main(String []args){
    C obj = new C(10);

}
}
class A{
    A(){
        System.out.println("Inside A");
    }
    A(int a){
        System.out.println("Inside A int");
    }
}
class B extends A{
    B(){
        // super() // by default this is here
        System.out.println("Inside B");
    }
    B(int a){
        // super(a); // by default this is here 
        System.out.println("Inside B int");
    }
}
class C extends B{
    C(){
        // super(); // by default
        System.out.println("Inside C");
    }
    C(int a){

        super(a);
        // this();
        System.out.println("Inside C int");
    }
    C(int b,int a){
        System.out.println("Inside C int , int");
    }
}