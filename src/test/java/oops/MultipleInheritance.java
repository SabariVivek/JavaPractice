package oops;

/**
 * Why Java doesn't support Multiple Inheritance?
 * When the two parent class has same methods, variables & accordingly when you create an object for its child and try to call its parent, compiler
 * will get confusion on which method that it should initiate the call...
 * -----
 * To overcome this problem, we have the concept of Interface in Java...
 */
public class MultipleInheritance {

    public static void main(String[] args) {

        MultipleInheritance obj = new MultipleInheritance();
    }
}

class parent_one {
    public void method() {
        System.out.println("I am inside the method");
    }
}

class parent_two {
    public void method() {
        System.out.println("I am inside the method");
    }
}

/*
class child extends parent_one, parent_two {

    public static void main(String[] args) {
        child obj = new child();
        obj.method();
    }
}*/