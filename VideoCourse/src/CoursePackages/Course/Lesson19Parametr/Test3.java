package CoursePackages.Course.Lesson19Parametr;

public class Test3 {
    public static void main(String[] args) {
        int [] array = {1,7,9,0};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int s: array) {
            System.out.print(s + " ");
        }
    }
}

