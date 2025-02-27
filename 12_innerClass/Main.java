class A{
    int a;
    public void print(){
        System.out.println("Print in A");
    }
    static class B{
        void print(){
            System.out.println("Print in B which is inside A");
        }
    }
}

public class Main{
    public static void main(String []args){
    A obj = new A();
    // obj.print();

    // to acces the class B we need a obj of A 
    // like this or 
    // A.B obj2 = obj.new B();
    // obj2.print();
    // this 
    // A.B obj2 = new A(). new B();
    // obj2.print();

    // but if we make the inner class Static then no need to create a Obj of A to access , we can simple use referance of class A
    // like this 
    // A.B obj3 = new A.B();
    // obj3.print();

    // anonimus inner class 
    // new A().new B().print();
    }
}
