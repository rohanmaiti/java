public class Main3{
    public static void main(String []args){
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
   
    }
}

interface x{
    public default void mq(){
        System.out.println("default method can have body");
    }
    static void m3(){
        System.out.println("static method also can have body");
    }
}

class F implements x{
void m3(){
        System.out.println("staatic method also have body in F");
    }
}

interface C{
     void swim();
}

interface A{  // can't instanstialte 

    // we can declare variable also but they are by default :-> final and static 
    int a = 30;
    String name = "Rohan"; 

    void show();
    void draw(); // by default they are public abstract
}
class B implements A,C{
    int a = 40;
    public void show() {
        System.out.println("Inside show " +a);
    }
    public void draw() {
        System.out.println("Inside draw");
    }
    public void swim(){
        System.out.println("Swiming..");
    }

}