package CoursePackages.Course.Lesson19Parametr;

public class Test10 {
    public static void main(String[] args) {
        int [] array1 = {0,7,9,8};
        int [] array2 = {0,7,9,8};
        for (int i = 0; i < array1.length && i < array2.length; i++) {
            array1[i] = 12;
            array2[i] = 3;
        }
        // с foreach не получится
    }
}
