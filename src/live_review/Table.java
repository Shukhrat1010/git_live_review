package live_review;

public class Table {
    public static void main(String[] args) {
        multiplicationTable(5);
        multiplicationTable();
    }

        /*
    Overloaded Method: multiplicationTable
    param: num
    Return: void
    prints multiplication table for the numbers 1 - 10
     */

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }

        /*
    Method: multiplicationTable
    Return: void
    prints multiplication table for the numbers 1 - 9
     */
    public static void multiplicationTable(){
        for (int i = 1; i <= 10; i++) {
            multiplicationTable(i);
            System.out.println("-----------");
        }
    }
}
