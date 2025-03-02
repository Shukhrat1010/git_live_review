package adams_live_labs;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        int N =100;
        String result = "";

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                result += "Alpha";
            }
            if (i % 3 == 0) {
                result += "Beta";
            }
            if (i % 5 == 0) {
                result += "Gamma";
            }
            if (result == "") {
                System.out.println(i);
            } else {
                System.out.println(result);
                result = "";
            }

        }
    }
}
