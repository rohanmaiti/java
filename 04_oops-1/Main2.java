public class Main2 {
    int a;
    boolean b;
    static void print(){
        System.out.println(a+" "+b);
    }
    public static void main(String [] args){
        // in Main1.java we have created a class out side and use it inside a diffenent class 
        // However, we can also create objects inside the same class.
        Main2 obj = new Main2();
        obj.print(); // 0 0 | default value of int is 0 and boolean is false;
        print();
    }
}
// Tell the output of the above program after having read about static keyword
// how to fix the above program ?

// *NEXT TOPIC
// *METHODS OVERLOADING in JAVA
// void func() { ... }
// void func(int a) { ... }
// float func(double a) { ... }
// float func(int a, float b) { ... }
// *Here, the func() method is overloaded. These methods have the same name but accept different arguments.

// *Note: The return types of the above methods are not the same. It is because method overloading is not associated with return types. Overloaded methods may have the same or different return types, but they must differ in parameters.

// public class Main2{
//     public static void main(String []args){
//         A.method();
//         A.method(2.5f);
//     }
// }
// class A{
    // static void method(){
    //     System.out.println("method without parameter");
    // }
    // static void method(int a){
    //     System.out.println("method with 1 parameter");
    // }
    // static void method(int a, int b){
    //     System.out.println("method with 2 parameter");
    // }
    // static int method(float a){
    //     System.out.println("method with float parameter");
    //     return 0;
    // }
// }



// *MCQ
// public class Main2{
//     public static void main(String []args){
//         A.method(2.5f , 4.5f);
//         A.method(2 , 4.5f);
//         A.method(2.5f , 4);
//         A.method(2 , 4);
//     }
// }
// class A{
//     static void method(int a, int b){
//         System.out.println("method with 2 int parameter");
//     }
//     static int method(float a, float b){
//         System.out.println("method with 2 float parameter");
//         return 0;
//     }
// }


// *MCQ IMPORTANT
// public class Main2{
//     public static void main(String []args){
//         A.method(2 , 4.5f);
//         A.method(2.4f, 4);
//         A.method(2, 4); // error ambiguous
//     }
// }
// class A{
//     static void method(int a, float b){
//         System.out.println("method with  int float parameter");
//     }
//     static int method(float a, int b){
//         System.out.println("method with float int parameter");
//         return 0;
//     }
// }

// *MCQ IMPORTANT
// public class Main2{
//     public static void main(String []args){
//         A.method(2, 4); // parameter have to be diff . or error like in this case
//     }
// }
// class A{
//     static void method(int a, int b){
//         System.out.println("method with  int int with void");
//     }
//     static int method(int a, int b){
//         System.out.println("method with int int with int");
//         return 0;
//     }
// }