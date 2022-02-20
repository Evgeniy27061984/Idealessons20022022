package CoursePackages.Course.HomeWork.Lesson18;

import java.util.Arrays;

public class Test1 {
    public static int [] sortirovka(int [] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}

class TestSort {
    public static void main(String[] args) {
        int [] arr = {2,9,0,6,-6};
        System.out.println(Arrays.toString(arr));
        arr =Test1.sortirovka(arr);
        System.out.println(Arrays.toString(arr));

    }
}
