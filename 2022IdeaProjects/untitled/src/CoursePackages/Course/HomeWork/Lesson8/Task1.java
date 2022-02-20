package CoursePackages.Course.HomeWork.Lesson8;

public class Task1 {

    public static int multiThree (int a, int b, int c) {
        return a*b*c;
    }
    public static void division (int a2, int b2) {
       int c2 = a2/b2;
       int c3 = a2%b2;
        System.out.println("целое " + c2  + " остаток " + c3 );
    }
}
class TestTask1 {
    public static void main(String[] args) {
        int x = Task1.multiThree(1, 4, 3);
        int y = Task1.multiThree(1, 4, 3);
        Task1.division(5,2);
        Task1.division(6,2);
    }
}