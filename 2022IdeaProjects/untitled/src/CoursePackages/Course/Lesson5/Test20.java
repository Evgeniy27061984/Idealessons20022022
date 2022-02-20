package CoursePackages.Course.Lesson5;

public class Test20 {
    int amount (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int average (int a1, int b1, int c1) {
        int result2 = amount(a1, b1, c1)/3;
        return result2;
    }
}
class Test21 {
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summa = t.amount (2,7,9);
        System.out.println(summa);
        System.out.println(t.average(5,6,7));
    }



}