public class Main{
    public static void main(String []args){
    A obj = new A();
    obj.print();

    A.B obj2 = new A(). new B();
    obj2.print();

    // anonimus inner class 
    new A().new B().print();
    }
}
class A{
    int a;
    public void print(){
        System.out.println("Print in A");
    }
    class B{
        void print(){
            System.out.println("Print in B which is inside A");
        }
    }
}