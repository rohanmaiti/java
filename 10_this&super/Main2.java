public class Main2{
    public static void main(String []args){
    B obj = new C();
    obj.print();
    obj.xyz();
    obj = new B();
    obj.print();
    obj.xyz();

    // obj = new A();
    // obj.print();
    }
}
class A{
    int a = 10;
    void print(){
        System.out.println("Inside A"+" "+this.a);
    }
    void xyz(){
        System.out.println("Inside A xyz");
    }
}
class B extends A{
    int a = 20;
    void print(){
        System.out.println("Inside B"+" "+this.a);
    }
}
class C extends B{
    int a = 30;
    void print(){
        System.out.println("Inside C"+" "+this.a);
    }
    void xyz(){
        System.out.println("Inside C xyz");
    }
}