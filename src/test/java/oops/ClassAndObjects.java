package oops;

public class ClassAndObjects {

    // Global Variable
    final float PI_VALUE = 3.14f;

    // Normal Function
    public void printPIValue() {
        System.out.println(PI_VALUE);
    }

    // Function with local variable
    public void printMyName() {
        String name = "sample.Sabari";
        System.out.println("My name is " + name);
    }

    // Main Function
    public static void main(String[] args) {
        // Object Creation
        ClassAndObjects obj = new ClassAndObjects();

        // Calling the class variables and methods using the object name
        obj.printPIValue();
        System.out.println(obj.PI_VALUE);
        obj.printMyName();

        // Printing Statements...
        System.out.print("I am running the Java Program");
        System.out.print("I am running one more Java Program");
    }
}