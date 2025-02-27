public class Main1 {
    public static void main(String []args){
        // creating a obj of class A
        A obj = new A();
        // Access Members of a Class | . operator to access members of a class
        obj.a = 10;
        obj.print();

        // int a; // till here no problem but if i print without initialising then it will throw error || local variable cant be uninitialised
        // System.out.println(a); // remove this line , then no error
    }
}

// what is class ? 
// --> userdefined data type with additional functionalities
// how to declare?
class A{
   // field
   int a; // default value 0
   int b; // default value 0
   // methods
   void print(){
    System.out.println(a+" "+b);
   }
}
