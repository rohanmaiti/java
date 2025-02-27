public class Variable {
    static int a = 10;
    public static void main(String []args){
        System.out.println(a);
        // nonStaticMethod();  // non-static method nonStaticMethod() cannot be referenced from a static context

 
        System.out.println(A.b); // static variabel / methods can be used without creating object of the class 
        // System.out.println(A.a); // non static variable can not be used without creating a object of the class
        
        // static methods can be used without creating object of the class like below 
        // A.print();
        // non static methods can not  be used without creating object of the class like below 
        // A.method();
        // to call non static method we have to make object of the class and then call it 
        // A obj  = new A();
        // obj.method();
    }
    public void nonStaticMethod(){
        System.out.println(a); // non-static method nonStaticMethod() cannot be referenced from a static context
    }
}
class A{
    int a = 101;
    static String b = "static variable";
    static void print(){
        System.out.println("Print");
    }
    void method(){
        System.out.println("Method");
    }
}