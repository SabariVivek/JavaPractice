package oops;

/**
 * Overriding is the concept of creating a method with same name and same arguments in different classes...
 * -
 * Rules :
 * We have to use super keyword in the first line of the method...
 * We cannot use this and super keyword in the same method...
 */
public class Overriding extends Super {

    Overriding() {
        super.Method();
        this.Method();
    }

    public void Method() {
        System.out.println("I am the method in Overriding class...");
    }

    public static void main(String[] args) {
        Overriding obj = new Overriding();
    }
}

class SuperSuper {
    public void Method() {
        System.out.println("I am the method in Super Super class...");
    }
}

class Super extends SuperSuper {

    public void Method() {
        super.Method();
        System.out.println("I am the method in Super class...");
    }
}