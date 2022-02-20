package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test13subListContains {
    public static void main(String[] args) {
        ArrayList <String> a1 = new ArrayList<>();

        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");
        a1.add("5");

        System.out.println(a1);

        ArrayList <String> a2 = new ArrayList<>();

        a2.add("1");
        a2.add("2");
        a2.add("3");

//        a1.removeAll(a2);
//        System.out.println(a1); //4,5

//        a1.retainAll(a2);
//        System.out.println(a1); //1,2,3

        System.out.println(a1.containsAll(a2)); // true содержит ли a1 все элементы массива а2
        System.out.println(a2.containsAll(a1)); // false

        List<String> list = a1.subList(2,4); // вью view
        System.out.println(list);
        list.add("ten");

        System.out.println(list);
        System.out.println(a1);
        a1.add("ten"); // нельзя view не получится
        //System.out.println(list); //ConcurrentModificationException


        Object [] array = a1.toArray();
        String [] array2 = a1.toArray(new String[5]);
        System.out.println(Arrays.toString(array2));

    }
}
