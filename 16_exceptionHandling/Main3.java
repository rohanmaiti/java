
//     public static void main(String args[]){

//         try{
//             // System.out.println(10/0); // ArithmeticException Obj;
//             Exception obj = new Exception("My new exception");
//             //   if(true)
//             //   throw obj;
//              if(true)
//             //  throw new Exception("My new exception");
//             throw new MyException("Rohan is exception");
            

//         }
//         catch(Exception e){
//         System.out.println(e.getMessage());
//         }
//     }
// }

class MyException extends Exception{
MyException(String s){
    super(s);  
}
}
class MyException2 extends Exception{
MyException2(String s){
    super(s);  
}
}

/* throws */
public class Main3{
    public static void main(String []args){
    try{
    m1();
    }
    catch(Exception e){
    System.out.println("Ecception throws");
    } 

    System.out.println("After try catch block");
    }
    
    static void m1() throws MyException ,MyException2 {
        System.out.println("function m");
        System.out.println(10/0);

        if(true){
            throw new MyException("my Exception");
        }
        else{
            throw new MyException2("my Exception");
        }
    }
}
