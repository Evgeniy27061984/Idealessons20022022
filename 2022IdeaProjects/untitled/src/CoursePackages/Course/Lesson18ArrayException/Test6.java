package CoursePackages.Course.Lesson18ArrayException;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int [] array = {1, 9, 6, 7};
        int [] array2 = {1, 7, 6, 7,8};
        System.out.println(array == array2);
        // false ссылаются на разные объекты
        int [] array3 = array2;
        System.out.println(array3 == array2);
        // true ссылаются на одинаковые объекты
        array = array2;
        System.out.println(Arrays.toString(array));//{1, 7, 6, 7,8}
        int [] array4 = {1, 9, 6, 7};
        int [] array5 = {1, 9, 6, 7};
        System.out.println(array4.equals(array5));
        //false equals не пеезаписан
        args = new String[4]; // можно записывать в main

    }
}
