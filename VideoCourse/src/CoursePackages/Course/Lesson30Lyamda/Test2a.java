package CoursePackages.Course.Lesson30Lyamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2a {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3", "4", "5");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(s -> System.out.println(s));


        ArrayList <Integer> s1 = new ArrayList<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);
        s1.add(7);
        //s1.removeIf(el -> el%3 == 0);
        //or
        Predicate <Integer> p = v -> v % 3 == 0;
        s1.removeIf(p);
        System.out.println(s1);
        s1.forEach(x -> System.out.print(x));
        System.out.println();
        ArrayList <Integer> s2 =new ArrayList<>();
        s2.add(3);
        s2.add(1);
        s2.add(3);
        s2.add(5);
        s2.add(4);
        s2.add(9);
        s2.add(7);
        s2.sort((x,y) -> x.compareTo(y));
        System.out.println(s2);
        s2.sort((x,y) -> -x.compareTo(y));
        System.out.println(s2);
    }
}