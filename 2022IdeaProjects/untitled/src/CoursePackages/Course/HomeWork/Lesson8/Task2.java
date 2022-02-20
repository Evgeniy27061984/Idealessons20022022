package CoursePackages.Course.HomeWork.Lesson8;

public class Task2 {
    static final double PI = 3.14;

    public double areaCircle (double r) {
        double areaC = PI * r * r;
        return areaC;
    }

    public static double lengthCircle (double r) {
        double lengthC = 2 * PI * r;
        return lengthC;
    }

    public void info (double r) {

        System.out.println("радиус -" + r +  " площадь -" + areaCircle (r) +
                " длина -" + lengthCircle (r));
    }
}
class TestTask2 {
    public static void main(String[] args) {
        Task2 t = new Task2();
        t.info(3);
    }
}

