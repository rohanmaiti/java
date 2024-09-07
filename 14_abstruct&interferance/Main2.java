// abstruct and annonimus class 
public class Main2{
    public static void main(String []args){
    A obj = new A(){
     void draw(){
        System.out.println("Drawing...");
     }
    } ; // while we are writing this syntex like new A(){} then we are not creating an  obj of A we are creating a obj of an annonimus class 

    obj.draw();
    }
}
abstract class A {
    int a;
    A(){
        System.out.println("Inside constructor of A");
    }
    abstract void draw();
}