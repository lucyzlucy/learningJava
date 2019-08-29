package OverrideHide;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
//        Animal myAnimal = myCat;
        myCat.testClassMethod();
        myCat.testInstanceMethod();
        Animal myAnimal = new Animal();
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
        myAnimal = myCat;
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
        myCat.testClassMethod();
        myCat.testInstanceMethod();

    }
}

//    public static void main(String[] args) {
//        Cat myCat = new Cat();
//        Animal myAnimal = myCat;
//        Animal.testClassMethod();
//        myAnimal.testInstanceMethod();
//    }
//    If a subclass defines a static method with the same signature as a static method in the superclass, then the method in the subclass hides the one in the superclass.
//
//        The distinction between hiding a static method and overriding an instance method has important implications:
//
//        The version of the overridden instance method that gets invoked is the one in the subclass.
//        The version of the hidden static method that gets invoked depends on whether it is invoked from the superclass or the subclass.

//    The Cat class overrides the instance method in Animal and hides the static method in Animal. The main method in this class creates an instance of Cat and invokes testClassMethod() on the class and testInstanceMethod() on the instance.
//
//        The output from this program is as follows:
//
//        The static method in Animal
//        The instance method in Cat
//        As promised, the version of the hidden static method that gets invoked is the one in the superclass, and the version of the overridden instance method that gets invoked is the one in the subclass.