package adams_live_labs;

public class J02_AlarmClock {

    public static void main(String[] args) {

        int days= 0;
        boolean isOnVacation = true;
        String alarm = "";

        boolean isWeekend = days == 0 || days == 6;

        if(isOnVacation) {
            if(isWeekend) {
                alarm= "off";
            }else{
                alarm= "10:00";
            }

        }else{
            if(isWeekend) {
                alarm= "10:00";
            }else {
                alarm= "7:00";
            }
        }
        System.out.printf("Alarm =" + alarm);



    }
}
