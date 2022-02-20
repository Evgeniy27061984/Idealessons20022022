package CoursePackages.Course.Lesson18ArrayException;

public class Test2 {
    public static void main(String[] args) {
        String [] array1;
        int [][] array2;

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "Привет" + i;
            System.out.println(array1[i]);
        }

        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++) { //длина массива 3
            for (int j = 0; j < array2[i].length; j++) { // разная длина
                array2[i][j] = i + j;
                System.out.print(array2[i][j]);
            }
        }
    }
}
