package az.turingacademy.lessons;

public class WeekDaysApp {
    public static void main(String[] args) {
        String[] weekdays = {
                "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"
        };

        System.out.println( "Week days are:");
        for (int i=0; i<weekdays.length; i++) {
            System.out.println((i+1) +":" + weekdays[i]);
        }
    }
}
