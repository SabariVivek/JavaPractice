package basics.javabasics;

/**
 * Arrays - It is used to store multiple values with same data type...
 * --
 * Homogeneous Data Type - Same Data Type...
 * Heterogeneous Data Type - Different Data Type...
 * --
 * Cons :
 * It is used to store same type of data...
 * In Array, there is no ready-made methods...
 * It is not growable in nature...
 * --
 * To overcome that, later version in Java, they have introduced the concept of Object...
 * --
 */
public class Arrays {

    public static void main(String[] args) {

        int[] arr = new int[3];

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers)
        {
            System.out.println(num);
        }

        /*String[] fruits = {"Apple", "Orange", "Jack Fruit", "Guava", "Banana"};

        float[] decimals = {10.4f, 89.87f, 222.5f, 139.392f, 1.0f};

        Object[] common = {10, 10.5f, "Sabari", 'A', "Tharani"};

        for (int number : numbers) {
            System.out.println(number);
        }

        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        // arr[3] = 400;
        // System.out.println(arr[3]); // Creates arrayIndexOutOfBoundException...*/
    }
}