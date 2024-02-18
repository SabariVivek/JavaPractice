package oops;

/**
 * Overloading is the concept of loading the same methods with different arguments...
 */
public class Overloading {

    public void click() {
        System.out.println("I clicked the element");
    }

    public void click(int waitTime) {
        System.out.println("I am waiting for given " + waitTime + " seconds");
        System.out.println("I clicked the element");
    }

    public void click(String elementName) {
        System.out.println("I have clicked the " + elementName + " element");
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.click();
        obj.click(15);
        obj.click("SignIn Icon");
    }
}