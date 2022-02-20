package CoursePackages.Course.Lesson14For;

public class Test5 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
               continue;
            }
            if (i == 8) {
                continue;
            }
            System.out.println(i);
        }
    }
}
