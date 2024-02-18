package basics.javabasics;

/**
 * Method is a set of executable statements...
 * Types : default Method, Parameterized Method...
 */
public class Methods {

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.printAboutMe("sample.Sabari", 1, "India");
        obj.printAboutMe("Vivek", 2, "USA");
        obj.printAboutMe("Anu", 3, "France");
        obj.printAboutMe("Jeevitha", 4, "Japan");
        obj.printAboutMe("Preethi", 5, "North Korea");
        obj.printStaticData();
    }

    public void printAboutMe(String name, int age, String location) {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("I am living in " + location);
    }

    public void printStaticData() {
        System.out.println("This is Java Program");
    }
}