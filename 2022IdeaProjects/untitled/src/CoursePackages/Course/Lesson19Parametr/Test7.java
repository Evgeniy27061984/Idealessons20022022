package CoursePackages.Course.Lesson19Parametr;

public class Test7 {
    public static void main(String[] args) {
        // примитивные данные
        int [] array = {0,7,9,8};
        for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }
        for (int d : array
        ) {
            System.out.print(d + " "); //3 3 3 3
        }


        System.out.println();

        int [] array2 = {0,7,9,8};

        for (int d : array
        ) {
            d = 3;
            System.out.print(d + " "); //3 3 3 3 d в самом array2 не поменялись
        }
        for (int d : array2
        ) {
            System.out.print(d + " "); //0 7 9 8
        }

    }
}
