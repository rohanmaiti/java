public class Main{
    public static void main(String []args){
    A obj = new A();
    System.out.println(obj); // this automatically calls the toString method if present else prints address
    }
}
class A{
    public String toString(){
     return "This is A obj";
    }
}