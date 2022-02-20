package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        String sb1 = new String("A");
        String sb2 = new String("B");
        String sb3 = new String("C");
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        ArrayList <String> list3 = list1;

        ArrayList <String> list2 = (ArrayList<String>) list1.clone();
        // list1.get(0).append("!"); нельзя изменять string
        System.out.println(list1 == list2); // false
        System.out.println(list1.equals(list2)); // true
        System.out.println(list1.equals(list2)); // true
        System.out.println(list3 == list1); // true



    }
}

