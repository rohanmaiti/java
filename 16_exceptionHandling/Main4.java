public class Main4{
    public static void main(String []args){
    try{
    m1();
    }
    catch(Exception e){
    System.out.println(e.getMessage());
    }
    }
    static void m1()throws MyException{  // while throwing a user define exception object we have to mention the particual class of Exception that is going to throw
        System.out.println("m1 function");
        throw new MyException("My Exception");
    }
}
class MyException extends Exception{
    MyException(String s){
        super(s);
    }
    
}