package basics.modifiers;

/**
 * Static keyword is used for "memory management" mainly...
 * USAGE --> Static represents class objects instead of instance objects...
 * -
 * Static can be used with Variables, Methods, Blocks (Static Blocks)...
 * Static blocks won't get executed without main method...
 * -
 * Usage :
 * You don't need to create an object for calling the static variables & methods...
 * static keyword is also used with methods...
 * static methods can access only static stuff (variables)...
 * static variables are generally used to store common data whereas object variables are used to store object specific data...
 * static stuff can be accessed outside the class with the help of class name...
 */
public class StaticKeyword {

    static int accountBalance = 100;
    int userID = 2108;

    static {
        System.out.println("I am executing before main method...");
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        StaticKeyword obj3 = new StaticKeyword();

        System.out.println("USER ID : " + obj1.userID);  //2108
        obj1.userID++;
        System.out.println("Initial Amount : " + obj1.accountBalance); //100
        accountBalance++;

        System.out.println("USER ID : " + obj2.userID); //2109
        obj2.userID++;
        method(1);
        System.out.println("After First Transaction : " + obj2.accountBalance); //101
        accountBalance++;

        System.out.println("USER ID : " + obj3.userID); //2110
        obj3.userID++;
        method(90);
        System.out.println("After Second Transaction : " + obj3.accountBalance); //102
        accountBalance++;
    }

    static {
        System.out.println("ICU");
    }

    public static void method(int transactionAmount) {
        accountBalance = accountBalance - transactionAmount;
    }
}