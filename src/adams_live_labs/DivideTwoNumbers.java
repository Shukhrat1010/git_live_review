package adams_live_labs;

public class DivideTwoNumbers {

    public static void main(String[] args) {


        int balls = 100;
        int basket = 6;
        int counter =0;
        while(true){
            counter++;
            balls=balls-basket;
            if(balls < basket){
                break;



            }


        }

        System.out.println( counter+ " with a remainder of " + basket);





    }
}
