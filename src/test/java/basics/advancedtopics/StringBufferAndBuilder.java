package basics.advancedtopics;

/**
 * Example --> Aadhar name is dependent on Bank, Cyclinder Agency, Companies...
 * String Buffer --> Introduced by Sun Micro System, Java 1.0 along with String Concepts...
 * String Buffer --> Java LATER VERSIONS along with String Concepts...
 */
public class StringBufferAndBuilder {

    public static void main(String[] args) {
        ExampleOfStringBuffer();
        ExampleOfStringBuilder();
    }

    public static void ExampleOfStringBuffer() {
        StringBuffer strBuffer = new StringBuffer("Automation");
        strBuffer.append(" Testing");
        System.out.println(strBuffer);

        strBuffer.delete(0, 4);
        System.out.println(strBuffer);

        strBuffer.insert(0, "Auto");
        System.out.println(strBuffer);

        System.out.println(strBuffer.length());

        System.out.println(strBuffer.reverse());
    }

    public static void ExampleOfStringBuilder() {
        StringBuilder strBuilder = new StringBuilder("Automation");
        strBuilder.append(" Testing");
        System.out.println(strBuilder);

        strBuilder.delete(0, 4);
        System.out.println(strBuilder);

        strBuilder.insert(0, "Auto");
        System.out.println(strBuilder);

        System.out.println(strBuilder.length());

        System.out.println(strBuilder.reverse());
    }
}