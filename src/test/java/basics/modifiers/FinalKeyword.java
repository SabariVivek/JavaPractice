package basics.modifiers;

/**
 * Final keyword is used to restrict the access of variables, methods & classes...
 * -
 * Variable - Cannot re-assign the value...
 * -- Value cannot be null, if it is we need to used constructor to assign the value...
 * Method - Won't allow overriding...
 * Class - Won't allow inheritance...
 */
public class FinalKeyword extends DummyFinal {

    public final int MAX_COUNT;

    FinalKeyword() {
        MAX_COUNT = 100;
    }

    public void method2() {
        System.out.println("I am the final method");
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword();
        // obj.MAX_COUNT = 1000000;
    }
}

class DummyFinal {

    public final void method() {
        System.out.println("I am the final method...");
    }

    public final void method1() {
        System.out.println("I am the final method...");
    }
}

final class OneMoreDummyFinal {

    public void noOneCanUseMe() {
        System.out.println("I am the unused in my entire lifespan...");
    }
}