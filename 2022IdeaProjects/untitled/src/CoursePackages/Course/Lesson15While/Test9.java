package CoursePackages.Course.Lesson15While;

public class Test9 {
    public static void main(String[] args) {

        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;

            INNER: while (minute < 60) {
                if(minute == 20) {
                    continue OUTER; // break вообше закроет Будет также как continue
                                     //break INNER;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }
            minute++;
        }

    }
}
