public class Main{
    public static void main(String []args){
    A obj = new B();
    obj.print();

    }
}
class A{
int a = 10;
void print(){
    System.out.println("Hello A");
}
}
class B extends A{
int a = 20;
void print(){
System.out.println("Hello B"+ ":" +" "+super.a);
super.print();

}
}