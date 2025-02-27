// class A{
//     int a = 10;
//     void printA(){
//         System.out.println(a);
//     }
// }
// class B extends A{
//     int b = 20;
//     void printB(){
//         System.out.println(b);
//     }
// }
// // here obj of B can access all the feild and methods of class A
// public class Main{
//     public static void main(String []args){
//     B obj = new B();
//     obj.printA();
//     obj.printB();
//     }
// }

// *What if method name are same in both class ? or variable
// class A{
//     int a = 10;
//     void print(){
//         System.out.println("hii"+" value of a = "+a);
//     }
// }
// class B extends A{
//     int a = 20;
//     void print(){
//         System.out.println("hello"+" value of a = "+a);
//     }
// }
// public class Main{
//     public static void main(String []args){
//     B obj = new B();
//     obj.print();
//     }
// }

// *Now how to access the super class methods and fields --> using super and we can use super only inside the class
// class A{
//     static int a = 10;
//     static void print(){
//         System.out.println("hii"+" value of a = "+a);
        
//     }
// }
// class B extends A{
//     int a = 20;
//     void print(){
//         super.print(); // it not need to be the 1st statement
//         System.out.println(super.a);
//         System.out.println("hello"+" value of a = "+a); 
//     }
// }
// public class Main{
//     public static void main(String []args){
//     B obj = new B();
//     obj.print();
//     }
// }

// *Access specifier in java;
// class A{
//     private void printA(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     void printB(){
//         System.out.println("B");
//     }
// }
// public class Main{
//     public static void main(String []args){
//     B obj = new B();
//     obj.printA();
//     obj.printB();
//     }
// }

// *MCQ
// class A{
//     private void print(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     void print(){
//         // super.print(); // as in super class print function has private access so cant access and will throw an error
//         System.out.println("B");
//     }
// }
// public class Main{
//     public static void main(String []args){
//     B obj = new B();
//     obj.print();
//     obj.print();
//     }
// }


// *MCQ
    class A{
        int a = 10;
        void print(){
            System.out.println("A");
        }
    }
    class B extends A{
        void print(){
            // super.print(); // as in super class print function has private access so cant access and will throw an error
            System.out.println("B");
        }
        void callSuperPrint() {
            super.print(); // Calls A's print method
        }
    }
    class C extends B{
        void print(){
            // super.super.print(); // in java there is no direct way to access a grandparent's method like this
            // However, you can achieve this by defining an intermediate method in class B that explicitly calls super.print(), and then calling that method from class C.
            callSuperPrint();
            System.out.println("C");
        }
        void printA(){
            System.out.println(this.a);
        }
    }
    public class Main{
        public static void main(String []args){
        C obj = new C();
        obj.print();
        obj.printA();
        obj.a = 100;
        obj.printA();
        }
    }

