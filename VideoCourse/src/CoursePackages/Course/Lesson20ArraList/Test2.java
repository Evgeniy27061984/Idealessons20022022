package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        list.add("bye");
        list.add("Hi");
        list.add(0,"Hello");
        for (String s: list) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.set(1,"Привет");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.remove("Привет");
        list.remove(new String("Hi")); // удаляет так как проверка идет с помощью equals
        System.out.println();

        ArrayList <String> list3 = new ArrayList<>();
        list3.add("one");
        list3.add("two");

        list.addAll(list3);
        list.addAll(0, list3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // one two Hello one two
        }
        list3.set(0,"three");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); //one two Hello one two  ничего не меняется
        }



    }
}
