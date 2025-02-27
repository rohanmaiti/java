public class Main{
    public static void main(String args[]){
        A ob1 = new A();
        A ob2 = new A();
        B obj3 = new B();
        B obj4 = new B();

    }
}

class A{
    int age;
    String name;

    // whether you write in top or bottom this block will call first
    //  {
    //     System.out.println("this is a non static block1");
    //  }
    //   {
    //     System.out.println("this is a non static block2");
    //  }

    A(){
        System.out.println("Default constractor of A called");
    }
    // static {
    //     System.out.println("inside STATIC block");
    // }
    // static {
    //     System.out.println("Second Static block.");
    // }

    
}
class B extends A{
B(){
    // super(); // by default it will call
    System.out.println("Default constractor of B called");
}
} 