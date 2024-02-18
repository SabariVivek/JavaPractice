package basics.javabasics;

/**
 * Constructor is a special type of method...
 * Constructor is used to initialize the value of class variables...
 * It gets called automatically when you create an object for the class...
 * --
 * Rules :
 * Constructor name and class name should be same...
 * Constructor should not have any return type...
 * Constructor should not be static or final...
 * --
 * Types :
 * Default Constructor
 * Parameterized Constructor
 */
public class Constructors {

    static int exceptionHandlingCount = 10;

    int a;
    Operators opr;

    Constructors() {
        opr = new Operators();
        a = 100;
        System.out.println("I am inside Default Constructor...");
    }

    Constructors(String name, int age, String location) {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("I am living in " + location);
    }

    public static void main(String[] args) {
        Constructors obj1 = new Constructors();
        Constructors obj2 = new Constructors("sample.Sabari", 24, "Chennai");
    }
}