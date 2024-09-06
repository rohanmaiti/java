public class Main{
    public static void main(String args[]){
        A ob1 = new A();
        A ob2 = new A();
        B obj3 = new B();

    }
}

class A{
    int age;
    String name;

    // whether you write in top or bottom this block will call first
    //  {
    //     System.out.println("this is a non static block");
    //  }

    A(){
        System.out.println("Default constractor of A called");
    }
    static {
        System.out.println("inside STATIC block");
    }

    
}
class B extends A{
B(){
    System.out.println("Default constractor of B called");
}
} 