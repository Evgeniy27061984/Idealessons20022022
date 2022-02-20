package CoursePackages.Course.HomeWork.Lesson18;

import java.util.Arrays;

public class Test2 {
    public static int[] sortirovka2(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }
}

class TestSort2 {
    public static void main(String[] args) {
        int [] arr = {2,9,0,6,-6};
        System.out.println(Arrays.toString(arr));
        arr =Test2.sortirovka2(arr);
        System.out.println(Arrays.toString(arr));

    }
}

