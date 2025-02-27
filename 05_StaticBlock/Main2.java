// *this can be used in the context of constructor
// public class Main2{
//     static int a;
//     int b;
//     Main2(){
//         this.a = 20;
//         this.b = 30;
//     }
//     Main2(int a, int b){
//         this.a = 100;
//         this.b = 200;
//     }
//     public static void main(String []args){
//         Main2 obj1 = new Main2();
//         System.out.println(obj1.a + " "+ obj1.b);
//         Main2 obj2 = new Main2(2,2);
//         System.out.println(obj2.a + " "+ obj2.b);
//     }
// }

// *this cant be used for a context of static view
// public class Main2{
//     static int a;
//     int b;
//     static void func1(){
//         System.out.println(this.a); // can't use this for a static variable or method 
//         System.out.println(a); // this will work
//         this.func3(); // this will not 
//         func3() ;// this will work
//     }
//     public static void main(String []args){
//         Main2.func1();
//     }
// }

// *inside a static method , cant use a non static variable or method 
// public class Main2{
//     static int a = 10; // can initialise like this as well
//     int b;
    
//     static void func1(){
//         // *these two are non static member and methods so can't use them
//         // System.out.println(b);
//         // func2();

//         // *but can work with static member and methods
//         // System.out.println(a);
//         // func3();
//     }
//     void func2(){
//         System.out.println("func2()");
//     }
//     static void func3(){
//         System.out.println("func3()");
//     }
//     public static void main(String []args){
//         Main2.func1();
//     }
// }


// *static methods can receive local variabls as args
// public class Main2{
//     static int a;
//     int b;
//     static void func1(int e, int f){
//         // work with local variable ;
//         int x = e+f;
//         System.out.println(x);
//         a = x;
//         // but cant do this as b is non static variable
//         // b = x;
//     }
//     public static void main(String []args){
//         Main2.func1(10,20);
//     }
// }

// *super cant be use in context of static
// public class Main2{
//     public static void main(String []args){
//         B.print();
//     }
// }
// class A{
//     static int b = 20;
// }
// class B extends A{
//     static int b  = 100;
//     static void print(){
//         // System.out.println(super.b); // will not work
//         System.out.println(b); //  will work
//     }
// }


