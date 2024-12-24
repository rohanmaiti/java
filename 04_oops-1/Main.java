// public class Main{
//     public static void main(String []args){
//       B obj = new B();
//       obj.print();
//     }
// }

// class A{
//       final void printA(){
//         System.out.println("In A");  
//     }
// }
// class B extends A{
//     void print(){
//         System.out.println("In B");
//         // super.printA();
//     }
// }

// method overloading 
// class A{
//     int add(int a,int b){
//         return a+b;
//     }
//     int add(int a,int b,int c){
//         return a+b;
//     }
//     int add(int a,int b,double c){
//         return (int)(a+b+c);
//     }
//     float add(int a,float b,double c){
//         return (float)(a+b+c);
//     }

// }
class Student{
    public String name ;
    public int id;
}
// public class Main{
//     public static void main(String []args){
    //Method overloading 
    // A obj = new A();
    // System.out.println(obj.add(10,20));
    // System.out.println(obj.add(10,20,30.0));

    // Array
    // int arr[];
    // System.out.println(arr[2]);

    // int arr[] = {1,2,3};
    // System.out.println(arr); // address of arr

    // int arr1[] = new int[5];  // all index initialized with zero
    // System.out.println(arr1);
    // System.out.println(arr1[2]);

    //  Scanner sc = new Scanner(System.in);
    // array of object
    // Student s[] = new Student[3];
    // for(int i=0;i<3;i++){
    //     Student stu = new Student();
    //     stu.name = sc.next();;
    //     stu.id = sc.nextInt();;
    //     s[i] = stu;
        
    // }

    // for Printing the values 
    // for(int i=0;i<s.length;i++)
    // {
    //     System.out.println(s[i].name + " : " + s[i].id);
    // }

    // for(Student stu : s){
    //     System.out.println(stu.name + " : " + stu.id);
    // }



//      B obj = new B();
//      obj.print();

//     }
// }
// class A{
//     A(){System.out.println("Default constructor of A called");}
//     protected void print(){
//     System.out.println("print function");
//     }
// }
// class B extends A{

// }





// method overloading 
// public class Main{
//     public static void main(String []args){
//     A obj = new A();
//     System.out.println(obj.getData());
//     }
// }

// class A{
//     int a;
//     String name;
//     int getData(int a1,String name1){
//         a = a1;
//         name = name1;

//         return 1;
//     }
//      void getData(String name1,int a1){
//         a = a1;
//         name = name1;
//     }
//     void getData(int a1){
//         a = a1;
//     }
//     void getData(String n1){
//         name = n1;
//     }
//     int getData(){  // it will not give error 
//         return 1;
//     }
// }
