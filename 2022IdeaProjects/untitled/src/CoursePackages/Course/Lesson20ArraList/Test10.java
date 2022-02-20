package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) {
        String a1 = "A";
        String a2 = "B";
        String a3 = "C";
        String a4 = "A";
        ArrayList <String> list1 = new ArrayList<String>();
        list1.add(a1);
        list1.add(a2);
        list1.add(a3);
        list1.add(a4);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        ArrayList <String> list2 = list1;
        System.out.println(list1.equals(list2)); // true
        ArrayList <String> list3 = new ArrayList<String>();
        list3.add(a1);
        list3.add(a2);
        list3.add(a3);
        list3.add(a4);
        Collections.sort(list3);
        System.out.println(list1.equals(list3)); // true






    }
}
