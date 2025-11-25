class Earth {
    Earth() {
        System.out.println("Default constructor of Earth");
    }
}
class Animal extends Earth{
    String type = "animal";

    Animal() {
        System.out.println("Default constructor of Animal");
    }
}

class Dog extends Animal {
    String type = "mamal";

    void printType() {
        System.out.println(type);
        System.out.println(super.type);
    }

    Dog() {
        // super // this is here by default which calls the default constructor of parent class 
        System.out.println("Default constructor of Dog");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printType();
    }
}
