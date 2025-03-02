package adams_live_labs;

public class J01_SpeedingTicket {

    public static void main(String[] args) {

        int speedLimit = 55;
        int currentSpeed = 65;

        if(currentSpeed > speedLimit) {
            int ticketamout = ( currentSpeed - speedLimit) * 6 + 51;
            System.out.println("ticketamout = $" + ticketamout);
        }else{
            System.out.println("No speeding");
        }




    }
}
