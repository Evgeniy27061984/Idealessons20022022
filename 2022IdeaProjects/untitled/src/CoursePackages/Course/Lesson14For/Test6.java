package CoursePackages.Course.Lesson14For;

public class Test6 {
//    public void time(){
//        OUTER:
//        for (int hour = 0; hour <= 23; hour++) {
//            INNER:
//            for (int minute = 0; minute <= 59; minute++) {
//                System.out.println(hour + ":" + minute);
//                if(minute == 30){
//                    break INNER;
//                }
//            }
//        }
//    }
public void time() {
    OUTER:
    for (int hour = 0; hour <= 23; hour++) {
        INNER:
        for (int minute = 0; minute <= 59; minute++) {
            if (minute == 20) {
                continue OUTER;
            }
            System.out.println(hour + ":" + minute);

        }
    }

}

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
