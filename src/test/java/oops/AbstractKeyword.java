package oops;

/**
 * On Specifying a method with abstract modifier, we can just declare the method without implementing it...
 * Abstract --> If you don't know what is the requirement, you can go with the abstract class...
 * Abstract class can have abstract methods as well as non-abstract methods...
 */
abstract class AbstractKeyword {

    public abstract void click(); // Declaration...

    public abstract void sendKeys(); // Declaration...

    public abstract void fullScreen(); // Declaration...

    public abstract void mercuryBallWithSquareShape(); // Declaration...

    public void maximize() {  // Declaration + Implementation...
        System.out.println("I am maximized...");
    }
}

abstract class VersionOne extends AbstractKeyword {
    @Override
    public void click() {
        System.out.println("I am clicked...");
    }
}

abstract class VersionTwo extends VersionOne {
    @Override
    public void sendKeys() {
        System.out.println("I am entering...");
    }
}

abstract class VersionThree extends VersionTwo {

    @Override
    public void fullScreen() {
        System.out.println("I am maximized with full screen...");
    }
}