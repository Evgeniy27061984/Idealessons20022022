package CoursePackages.Course.Lesson18ArrayException;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int [] array = {1, 9, 6, 7};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int index = Arrays.binarySearch(array,6);
        System.out.println(index); // 1
        int index2 = Arrays.binarySearch(array,2);
        System.out.println(index2);
        // -2 так как он должен был стоять на 1 месте +1 и меняем знак


    }
}
