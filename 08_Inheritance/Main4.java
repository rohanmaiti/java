// *RUN TIME POLIMORPHYSM
// class A{
//     void show(){
//         System.out.println("A show");
//     }
// }

// class B extends A{
//     void show(){
//         System.out.println("B show");
//     }
// }
// class C extends B{
//     void show(){
//         System.out.println("C show");
//     }
// }
// public class Main4 {
//     public static void main(String []args){
//     // <example-01 start here>    
//     A obj = new B();
//     // // if the reference object of parent then every methods of child should be present at parent class
//     obj.show();
//     //  <example-01 ends here>    

//      A obj2  = new C();
//      obj2.show();
//     }
// }


// ********************************* STATIC METHODS FOR INHERITANCE ******************
// class A{
//     static void print(){
//         System.out.println("In A");
//     }
// }

// public class Main4 extends A{
//     static void print(){
//          System.out.println("In Main");
//     }
//     public static void main(String[] args) {
//         A obj = new Main4();
//         obj.print();
//     }
// }
