public class Main{
    public static void main(String []args){
        // System.out.println("Hello Rohan");
        // datatypes in java
        /**
         * 1. premitive (8) || boolean , byte ,short , int , long , char , float , double
         * 2. non premitive
         */
        	
    // long range = -42332200000l;
    // System.out.println(range); 
    /**Notice, the use of L at the end of -42332200000. This represents that it's an integer of the long type. */

    // double number = -42.3;
    // System.out.println(number); // prints -42.3


    //  float number = -42.3f;
    // System.out.println(number);  // prints -42.3
    /**Notice that we have used -42.3f instead of -42.3in the above program. It's because -42.3 is a double literal. */

    /*The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
    Default value: '\u0000'*/
    // char letter = '\u0051';
    // System.out.println(letter);  // prints Q
  
    // Integer a = 10;
    // int b = a;
    // b = 20;
    // System.out.println(a);
    // changeA(a);
    // System.out.println(a);
    
    // int a;
    // System.out.println(a);

    
    // A obj = new A();
    // obj.a = 10;
    // obj.b = 20;

    // A obj2 = new A();
    // obj2 = obj;

    // obj2.a = 100;
    // System.out.println(obj.a + " "+ obj.b);
    // System.out.println(obj2.a + " "+ obj2.b);

    }
    // static void changeA(Integer a){
    // a = 20;
    // }
}

class A{
    int a;
    int b;
}

