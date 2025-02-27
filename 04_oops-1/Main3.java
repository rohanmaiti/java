// *CONSTRUCTOR
/**
 ** Types of Constructor
  In Java, constructors can be divided into three types:
  ** No-Arg Constructor
  ** Parameterized Constructor
  ** Default Constructor
 */

 // https://www.programiz.com/java-programming/constructors
 // read it 
// public class Main3 {
//     public static void main(String []args){
        // <No Args Constructor Start>
        // A obj = new A();
        // System.out.println(obj.a);
        // <No Args Constructor Ends>

        // <Parameterised Constructor Start>
        // B obj2 = new B(2);
        // System.out.println(obj2.a);

        // comment the upper part
        // B obj2 = new B();
        // System.out.println(obj2.a);
        // <Parameterised Constructor Ends>
//     }
// }

// NO args constructor
// class A{
//     int a;
//     A(){
//         int a = 100;
//         System.out.println("Without parameter constructor");
//     }
// }

//Parameterised Constructor 
// class B{
//     int a;
//     B(int val){
//         a = val;
//         System.out.println("parameterized constructor");
//     }
// }


// *Private Constructor
// Once a constructor is declared private, it cannot be accessed from outside the class.
// So, creating objects from outside the class is prohibited using the private constructor.
// Here, we are creating the object inside the same class.
// class Main3 {
//     int i;
//     // constructor with no parameter
//     private Main3() {
//       i = 5;
//       System.out.println("Constructor is called");
//     }
//     private Main3(int a) {
//         i = a;
//         System.out.println("Constructor is called");
//       }
  
//     public static void main(String[] args) {
  
//       // calling the constructor without any parameter
//       Main3 obj = new Main3(10);
//       System.out.println("Value of i: " + obj.i);
//     }
//   }

// *constructor overloading
// public class Main3{
//     Main3(){
//         System.out.println("default / no arg constructor");
//     }
//     Main3(int a){
//         System.out.println("Parameterized int constructor");
//     }
//     Main3(float a){
//         System.out.println("Parameterized float constructor");
//     }
// public static void main(String []args){
//     Main3 obj1 = new Main3();
//     Main3 obj2 = new Main3(4);
//     Main3 obj3 = new Main3(4.5f);
// }
// }

// *we can call one constructor from another constructor
// *Note: The line inside a constructor that calls another constructor should be the first line of the constructor. That is, this(5, 2) should be the first line 
// public class Main3{
//     Main3(){
//         // this(5);  // have to be the first line 
//         System.out.println("default / no arg constructor");
//     }
//     Main3(int a){
//         // this();
//         System.out.println("Parameterized int constructor");
//     }
// public static void main(String []args){
//     Main3 obj1 = new Main3(2);
   
// }
// }


// *this keyword in constructor
// public class Main3{
//     int a;
//     int b;
//     // *onece keep this and see the output
//     Main3(int a, int b){   // *REMEMBER this is not a ambiguity error just not assigned a value so assigned default value 0 0 
//         a = a;
//         b = b;
//         // System.out.println(a+" "+b); // you and turn it off and try onece
//     }
//     // *onece keep this and see the output
//     // Main3(int a, int b){
//     //     this.a = a;
//     //     this.b = b;
//     // }
//     void print(){
//         System.out.println(this.a + " "+ this.b);
//     }
//     public static void main(String []args){
//         Main3 obj = new Main3(2,3);
//         obj.print();
//     }
// }


// can we access another constructor using this() in another method ?
// No only one constructor can call other constructor
public class Main3{
    Main3(){
        System.out.println("No args constructor");
    }
    Main3(int a){
        
        System.out.println("Args constructor");
    }
    void load(){
       
        System.out.println("Loading");
    }
    public static void main(String args[]){
        Main3 obj = new Main3();
    }
}