package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("bye"));
        list.add(new StringBuilder("Hi"));
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Hello2"));
        for (StringBuilder s: list) {
            System.out.print(s + " ");
        }

        System.out.println(list.indexOf(new StringBuilder("bye"))); //-1

        System.out.println(list.contains(new StringBuilder("bye"))); // false
        System.out.println(list); // [bye, Hi, Hello, bye, Hello2]
        System.out.println(list.toString()); // [bye, Hi, Hello, bye, Hello2]
    }

}
