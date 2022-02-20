package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(new String("bye"));
        list.add(new String("Hi"));
        list.add(new String("Hello"));
        list.add(new String("bye"));
        list.add(new String("Hello2"));
        for (String s: list) {
            System.out.print(s + " ");
        }

        System.out.println(list.indexOf(new String("bye"))); //0 первое совпадение
        System.out.println(list.lastIndexOf(new String("bye"))); //3 самое последнее совпадение

        System.out.println(list.size()); //false
        System.out.println(list2.isEmpty()); //true

        System.out.println(list.contains(new String("bye"))); // true
        System.out.println(list); // [bye, Hi, Hello, bye, Hello2]
        System.out.println(list.toString()); // [bye, Hi, Hello, bye, Hello2]

    }

}
