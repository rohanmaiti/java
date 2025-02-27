/* 
 * ACCESS MODIFIER
 * class Animal {
    public void method1() {...}
    private void method2() {...}
 * }
 * 
 * In the above example, we have declared 2 methods: method1() and method2(). Here,
method1 is public - This means it can be accessed by other classes.
method2 is private - This means it can not be accessed by other classes.

 * https://www.programiz.com/java-programming/access-modifiers || read this 
 * 
 */



// *MCQ  tell the output
//  class Main1{
//      void printThis(){
//         System.out.println(this);
//     }
//     public static void main(String args[]){
//         Main1 obj = new Main1();
//         obj.printThis();
//         System.out.println(obj.toString()); // thease 2 have same output
//     }
//  }

// *MCQ
//  class Main1{
//      Main1 getA(){ return this;};
//      void msg(){
//         System.out.println("hello Java");
//     }
//     public static void main(String args[]){
//         new Main1().getA().msg();
//     }
//  }
