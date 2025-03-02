package adams_live_labs;

public class J03_ConfirmationBot {

    public static void main(String[] args) {

        char response = 'h';

        switch(response) {
            case 'y':
                System.out.println("Your request is being processed");
                    break;
            case 'n':
                System.out.println("Thank you for your consideration");
                    break;
            case 'h':
                System.out.println("Sorry, no live agents are currently available.");
                    break;
                default:
        }







    }
}
//3) ------- Confirmation bot ----------------
//
//        ### Use a `switch statement` to create a confirmation bot. Given a `response` value as a `char`,
//output a message based on the following:
//
//        > - if the response is `y` print the message: `Your request is being processed`
//        > - if the response is `n` print the message: `Thank you for your consideration`
//        > - if the response is `h` print the message: `Sorry, no live agents are currently available`
//        > - if the response is anything other than `y, n, or h` print: `Invalid entry, please try again