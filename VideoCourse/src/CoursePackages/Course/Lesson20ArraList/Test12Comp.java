package CoursePackages.Course.Lesson20ArraList;

import java.util.Arrays;

public class Test12Comp {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};
        int [] array5 = {1,2,3,4};

        char [] array3 = {'p','r','i','v'};
        char [] array4 = {'p','r','i'};
        char [] array7 = {'p','r','i'};
        char [] array8 = null;
        char [] array9 = null;

        System.out.println(Arrays.compare(array1,array2)); // 1 array1 < array2
        System.out.println(Arrays.compare(array2,array1)); // -1 array2 > array1
        System.out.println(Arrays.compare(array1,array2)); // 1 array1 < array2
        System.out.println(Arrays.compare(array1,array5)); // 1 array1 < array5
        System.out.println(Arrays.compare(array3,array4)); // 1 array3 < array4 раньше в словаре
        System.out.println(Arrays.compare(array7,array8)); // 1 array7 > array8
        System.out.println(Arrays.compare(array9,array8)); // 0 array9 == array8

        System.out.println(Arrays.mismatch(array1,array2)); // 3 первый индекс расхождения
        System.out.println(Arrays.mismatch(array4,array7)); // -1 если одинаковые


    }
}
