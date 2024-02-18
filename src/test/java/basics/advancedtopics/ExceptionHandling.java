package basics.advancedtopics;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Exception handling is needed in programs to avoid the unknown interventions of the code...
 * -
 * try
 * catch
 * throw
 * throws
 * finally
 * -
 * Combinations :
 * try + catch
 * try + finally
 * try + catch + finally
 * try + multiple catch blocks
 * ERROR --> only try, only catch, only finally...
 */
public class ExceptionHandling {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the division value : ");
            int value = scanner.nextInt();

            int a = 10 / value;
            System.out.println(a);

            if (a == 5) {
                throw new Exception("Value is 5, Hence exception thrown...");
            }

            verifyIsElementEnabled();
            newMethod();

            int[] values = {10, 20};
            System.out.println(values[0]);
        } catch (Exception e) {
            System.out.println("Exception Occurred : " + e.getMessage());
        } finally {
            System.out.println("I am in finally");
        }
    }

    public static void main(int[] args) {

    }

    public static void verifyIsElementEnabled() {
        try {
            Thread.sleep(1000);
            throw new NoSuchElementException("Username element is not available");
        } catch (Exception e) {
            System.out.println("Error Occurred : " + e.getMessage());
        }
    }

    public static void newMethod() throws Exception {
        Thread.sleep(1000);
    }
}