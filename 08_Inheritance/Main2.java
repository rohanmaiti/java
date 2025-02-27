class Animal{
    String type = "animal";
}
class Dog extends Animal{
    String type = "mamal";
    void printType(){
        System.out.println(type);
        System.out.println(super.type);
    }
}
public class Main2 {
    public static void main(String []args){
        Dog obj = new Dog();
        obj.printType();
    }
}
