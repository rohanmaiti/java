// ********** THEORY *********
/*
* 1. Interface can't have object but can hold referance 
* 2. we can declare variables inside the interface - by default they are final static and must be initialise 
* 3. by default methods are public and abstract 
* 4. if you want to define body of any method, then it has to be "public default"
* 5. Class can implement one or many Interfaces --> you have to define body of all methods that are mot defined in the interface unless the class is abstract. (multiple inheritance)
* 6. one interface also can extends multiple interfaces (multiple inheritance) unless default methods conflict.
* 7. interface can have static methods as well and to access it we will have to write the " interfaceName.functionName() "
* 8. A class implementing interface can also extend a class, like -->  class A extends B implements X, Y { }
* 9. No constructor in interface Because interfaces cannot be instantiated.
* 10. If two interfaces have same default method, class must override and resolve.
* 11. Interfaces can have private methods (Java 9+). Used for code reusability inside interface. Not accessible outside.
*/

import java.util.Arrays;

interface A { // can't instanstialte (means -> we can not create object of A but can hold
              // referance)

    // we can declare variable also but they are by default :-> final and static
    int a = 30;
    String name = "Rohan";

    void show();

    void draw(); // by default they are public abstract
}

class B implements A, C {
    int a = 40;

    public void show() {
        System.out.println("Inside show " + a);
    }

    public void draw() {
        System.out.println("Inside draw");
    }

    public void swim() {
        System.out.println("Swiming..");
    }
}

interface C {
    void swim();
}

// * one interface can extends multiple interfaces and this can achive multiple
// inheritance
interface Abc extends A, C {

}

interface x {
    // public default methods can have body (but have to mention explicitly )
    public default void mq() {
        System.out.println("default method can have body");
    }

    static void m3() {
        System.out.println("static method also can have body");
    }
}

class F implements x {
    void m3() {
        System.out.println("staatic method also have body in F");
    }
}

public class Main3 {
    public static int sum(int... nums) {  // * spread operator like in js (hold array of int)
        int temp = 0;
        System.out.println(Arrays.toString(nums));
        for (int ele : nums) {
            temp += ele;
        }
        return temp;
    }

    public static void main(String[] args) {
        // B obj = new B();
        // obj.show();
        // obj.draw();
        // System.out.println(B.a);
        // System.out.println(B.name);
        // B obj2 = new B(){

        // };
        // obj2.draw();
        // obj2.swim();
        // obj2.show();

        // x obj = new F();
        // obj.mq();
        // x.m3();
        // obj.m3();    

        System.out.println(sum(10,20,30));

    }
}
