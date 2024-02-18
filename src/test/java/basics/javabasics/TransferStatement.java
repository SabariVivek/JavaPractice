package basics.javabasics;

/**
 * Break - Exists from the complete loop...
 * Continue - Exists from the current iteration in the loop...
 * Return - Used to return some value...
 */
public class TransferStatement {

    String name = "Sabari Vivek";
    int age = 24;

    public static void main(String[] args) {

        // Break...
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // break;
            }
            System.out.println("The value of i : " + i);
        }

//        // Return Statement...
//        TransferStatement obj = new TransferStatement();
//
//        int age = obj.returnMyAge();
//        String name = obj.returnMyName();
//
//        System.out.println("My name is " + name);
//        System.out.println("My age is " + age);
    }

    public int returnMyAge() {
        return age;
    }

    public String returnMyName() {
        return name;
    }
}