package live_review;

public class Table {
    public static void main(String[] args) {
        multiplicationTable(5);
    }

        /*
    Method: multiplicationTable
    Return: void
    prints multiplication table for the numbers 1 - 10
     */

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
