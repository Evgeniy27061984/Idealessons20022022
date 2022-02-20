package CoursePackages.Course.HomeWork.Lesson13;

public class Month {
    public static void monthCountDays(int month) {
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("29");
                break;
            default:
                System.out.println("30");


        }


    }
    public static void main(String[] args) {
            monthCountDays(3);
    }
}
