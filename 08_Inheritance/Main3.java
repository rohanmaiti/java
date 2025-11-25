// public class Main3 {
//     public static void main(String args[]){
//         B obj = new B(3);
//     }
// }
// class A{
//     A(){
//         System.out.println("Inside A no args constructor");
//     }
//     A(int a){
//         System.out.println("Inside A  args constructor");
//     }
//     void func(){
//         System.out.println("Inside func");
//     }
// }

// class B extends A{
//     int b;
//     B(){
//         // super(); // it is here by default and it calls 1st
//         func();
//         System.out.println("Inside B no args constructor");
//     }
//     B(int a){
//        this(); 
//     }
// }


// *Example 2
public class Main3 {
    public static void main(String args[]){
        B obj = new B();
    }
}
class A{
    A(){
        System.out.println("Inside A no args constructor");
    }
}

class B extends A{
    int b;
}
            
// when we are creating obj of B , b's default constructor get called and default's constructor's 1st statement is super()  
// so A's constructor get called;