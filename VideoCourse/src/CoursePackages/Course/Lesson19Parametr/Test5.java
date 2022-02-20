package CoursePackages.Course.Lesson19Parametr;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Sidorov", "Petrov"};
        String[] exam = {"matem", "filosofia", "geografia"};

        for (String s1 : students ) {
            for (String s2: exam ) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
