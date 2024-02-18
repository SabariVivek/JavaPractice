package basics.modifiers;

public class AccessModifiers extends TestingPrivate {


    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.AccountBalance);
        // System.out.println(obj.Count);
    }
}

class TestingPrivate {

    protected int AccountBalance = 10000;
    private int Count = 1000;
}