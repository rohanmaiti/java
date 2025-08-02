// * packages are just containers of similar type of class, interface etc.
// *Built-in packages are existing java packages that come along with the JDK. For example, java.lang, java.util, java.io, etc. For example:

// *User-defined Package
// Java also allows you to create packages as per your need. These packages are called user-defined packages.

// *How to define a Java package?
// To define a package in Java, you use the keyword package.
// package packageName;

import tools.AdvCal;
import com.animal.Animal;

public class Main {
    public static void main(String args[]) {
        // Calc class is made in different file but in same folder so no need to declare
        // it as a pckage, it will by default behave like this
        // i can use the calc class because we are in same folder or package
        Calc obj = new Calc();
        System.out.println(obj.add(1, 2));

        // Now to use AdvCalc, need to import the package
        // syntax --> import foldername.className
        // we can use all the functions of that class Now
        AdvCal obj2 = new AdvCal();
        obj2.load(10, 20);
        System.out.println(obj2.mul());

        AdvCal obj3 = new AdvCal();
        System.out.println(obj3.mul(2, 3));

        Animal.bark();
    }

}

// we can use the class to extend as well
class ScienCal extends Calc {
    public int a;
}