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

        // super(a); // is this by default or not ?  yes 
        // this();
        System.out.println("Inside C int");
    }
    C(int b,int a){
        System.out.println("Inside C int , int");
    }
}

// public class Main{
// public static void main(String []args){
//     // C obj = new C(10);
//     // if you do not have default constructor written and you are using it but have other constructor defined then 
//     // you will get error 
//     // either you will not use default constructor if not writen explicitely or will not define any constructor 
//     C obj = new C();

// }
// }
// class A{
//     A(){
//         System.out.println("Inside A");
//     }
//     A(int a){
//         System.out.println("Inside A int");
//     }
// }
// class B extends A{
//     B(){
//         System.out.println("Inside B");
//     }
//     B(int a){
//         System.out.println("Inside B int");
//     }
// }
// class C extends B{
//     C(int a){
//         System.out.println("Inside C int");
//     }
//     C(int b,int a){
//         System.out.println("Inside C int , int");
//     }
// }