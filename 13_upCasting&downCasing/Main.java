
public class Main {
    public static void main(String[] args) {
        // double d = 4.5;
        // int i = (int) d;
        // System.out.println(i);
        // A obj = new A();
        // A obj = new B();  // we can do it 
        // obj.show1();

        // what is happening implesitly is that 
        // A obj = (A) new B();
        // obj.show1();

        // A obj = new B();
        // obj.show1();

        // B obj2 = (B)obj;
        // obj2.show1();
    }
}

class A {
    void show1() {
        System.out.println("In A show");
    }
}

class B extends A {
    void show2() {
        System.out.println("In b show");
    }
}
