package CoursePackages.Course.Lesson20ArraList;

import java.util.*;

public class Test9 {
    public static void main(String[] args) {



        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        Object [] array1 = list1.toArray(); // добавляет в массив

        for (Object o : array1) {
            System.out.print(o + " ");
        }

        StringBuilder [] array2 = list1.toArray(new StringBuilder[10]);
        // добавляет новый массив
        System.out.println();
        for (StringBuilder s : array2) {
            System.out.print(s + " ");
        }

        System.out.println();
        StringBuilder [] array4 = {sb1,sb2,sb2};
        List <StringBuilder> list = Arrays.asList(array4);
        System.out.println(list);

        array4[0].append("!!!");
        System.out.println(list);
        array4[0] = new StringBuilder("???");
        System.out.println(list);


    }
}
