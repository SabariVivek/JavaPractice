package basics.javabasics;

/**
 * This keyword is used to refer the class objects...
 * Function declaration - Arguments...
 * Value passing - Parameters...
 */
public class ThisKeyword {

    int rowCount, columnCount;

    ThisKeyword(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(10, 20); // Instance...
        System.out.println(obj.rowCount);
        System.out.println(obj.columnCount);
    }
}