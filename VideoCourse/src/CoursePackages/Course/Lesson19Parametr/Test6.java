package CoursePackages.Course.Lesson19Parametr;

public class Test6 {
    public static void main(String[] args) {
        int [][] array = {{3,7,8},{4,5}, {9,7,8,3,4,8}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        System.out.println();
        for (int [] array2 : array) {
            for (int d : array2) {
                System.out.print(d + " ");
            }

        }
    }
}
