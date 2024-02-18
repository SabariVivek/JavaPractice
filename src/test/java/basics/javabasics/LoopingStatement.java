package basics.javabasics;

public class LoopingStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //-----

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        //-----

        int count = 1;
        do {
            System.out.println("I am in Paradise...");
            count++;
        } while (count <= 5);
    }
}