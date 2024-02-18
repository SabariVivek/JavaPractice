package oops;

/**
 * Inheritance is the concept of acquiring the properties of parent class to the child class...
 * Parent & Child...
 * Super & Base...
 * -
 * Refer SS...
 * -
 * extends keyword is used to extend the class (Inheritance)...
 */
public class Inheritance {

    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.PrintAccountBalance();
        System.out.println(obj.AccountBalance);
        obj.GrandChildMethod();
    }
}

class Parent {

    public int AccountBalance = 3845679;
}

class Child extends Parent {

    public void PrintAccountBalance() {
        System.out.println(AccountBalance / 2);
    }
}

class GrandChild extends Child {

    public void GrandChildMethod() {
        System.out.println("I am the grand child of my grand father...");
        System.out.println(AccountBalance / 2);
        PrintAccountBalance();
    }
}