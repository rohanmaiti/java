## Abstract class 
* 1. The abstract class in Java cannot be instantiated (we cannot create objects of abstract classes). also can have constructor
*    We use the abstract keyword to declare an abstract class.
* 2. An abstract class can have both the regular methods and abstract methods.
* 3. If a class contains an abstract method, then the class should be declared abstract.
* 4. If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation of the abstract method.
*.   ELSE the child class has to be declared as abstract 
* 5. We can access the static attributes and methods of an abstract class using the reference of the abstract class. 

## Interface
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