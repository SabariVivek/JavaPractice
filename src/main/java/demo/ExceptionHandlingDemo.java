package demo;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        try
        {
            int a = 10, b = 0, c;

            c = a / b; //Arithmetic Exception...(+, -, *, /, %)

            System.out.println("The value of c is " + c);
        }
        catch (ArithmeticException e)
        {
            int a = 10, b = 0, c;

            c = a / b; //Arithmetic Exception...(+, -, *, /, %)

            System.out.println("You are trying to divide the value with 0, kindly provide the value greater than 1...");
        }
        finally {
            System.out.println("There is an exception occurs in the catch block itself...");
        }
    }
}