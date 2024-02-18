package basics.advancedtopics;

/**
 * String is a class in Java...
 * String is an array of char...
 * How many types of declaration are there? --> Literal, Using new Keyword...
 * ---
 * What is Immutable? --> Once declared, the value cannot be changed in the same memory location...
 * -- String Method...
 */
public class StringConcept {

    public static void main(String[] args) {

        String str_ = new String("I am Java Class");
        System.out.println(str_);

        String str = "Automation Testing";
        String str1 = "     Java     ";
        String str2 = " Class";
        String str3 = "Sabari,Vivek,Anu";
        int num = 1234;
        String str4 = "123";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.isEmpty());
        System.out.println(str.contains("Testing"));
        System.out.println(str.equals("Automation"));
        System.out.println(str.equalsIgnoreCase("automation testing"));
        System.out.println(str.indexOf('u'));
        System.out.println(str.charAt(2));
        System.out.println(str.replace("Automation", "Testing"));
        System.out.println(str1.trim());
        System.out.println(str1.trim().length());
        System.out.println(str.substring(11));
        System.out.println(str.substring(11, 15));
        System.out.println(str.concat(str2));
        System.out.println(str3.split(",")[1]);
        System.out.println(String.valueOf(num));
        System.out.println(Integer.parseInt(str4));
    }
}