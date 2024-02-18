package oops;

/**
 * Interface is used to achieve the 100% of abstraction...
 * Which means when you don't have any knowledge on how the function is going to behave, you can go with Interface...
 * -----
 * Rules :
 * Interface should have only abstract methods...
 * Interface methods are by default abstract, public and static...
 * Interface variables are by default final...
 * We can use default keyword for methods to implement it inside the interface itself...
 * For Interface, we have to use implements keywords for deriving it, instead of extends keyword...
 */
public class Interface implements parent_1, parent_2 {

    @Override
    public void method() {
        System.out.println("I am in method...");
    }

    public static void main(String[] args) {
        Interface obj = new Interface();
        obj.method();
        obj.sample();
    }
}

interface parent_1 {

    void method(); // Declaration...
}

interface parent_2 {

    void method(); // Declaration...

    default void sample() {
        System.out.println("I am in sample method...");
    }
}