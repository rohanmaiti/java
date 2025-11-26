// ******** THEORY *******
/*
* 1. The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). also can have constructor
*    We use the abstract keyword to declare an abstract class.
* 2. An abstract class can have both the regular methods and abstract methods.
* 3. If a class contains an abstract method, then the class should be declared abstract.
* 4. If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method.
*.   ELSE the child class has to be declared as abstract 
* 5. We can access the static attributes and methods of an abstract class using the reference of the abstract class. 

*/

// abstract class A{
//       // abstract method 
//     abstract public void show();
//       // regular method 
//     void method1(){
//         System.out.println("method1");
//     }
//     static void s(){
//         System.out.println("inside A s");
//     }
// }
// class B extends A{
//     public void show(){
//         System.out.println("In B show");
//     }
    
// }
// public class Main{
//     public static void main(String []args){
//         B obj = new B();  // can use the abstruct class for holding reference like -- A obj = new B();
//         obj.show();
//         obj.method1();
//         obj.s();
//     }
// }

//******************************************************** */

public class Main{
    public static void main(String []args){
     A obj = new B();
    //  obj.draw();
    //  obj.print2();
     System.out.println(A.staticVariable);
     A.staticMethod();
     System.out.println(obj.a);
    }
} 

abstract class A{
    final int a;
    static int staticVariable = 200;
    static void staticMethod() {
        System.out.println("Static method of A");
    }
    A(){
        System.out.println("Inside A constructor");
        a = 1000; // will not give error as it is initialise for the 1st time 
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
        System.out.println("class B Drawing...");
    }
    void print2(){
        System.out.println("Printing 2 in B....");
    }
}


