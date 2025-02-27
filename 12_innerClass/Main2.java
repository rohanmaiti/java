public class Main2{
    public static void main(String []args){
        A obj = new B();
        obj.print();
    }
}
class A{
    void print(){
        System.out.println("Print A");
    }
}
class B extends A{
    void print(){
        System.out.println("Print B");
    }
}


// just to change the behavoiur of A we are defining another class .
// now what we can do is like this in below 

public class Main2{
    public static void main(String []args){
        A obj = new A()
        {
            void print(){
                System.out.println("Print B");
            }
        };
        obj.print();
    }
}
class A{
    void print(){
        System.out.println("Print A");
    }
}

