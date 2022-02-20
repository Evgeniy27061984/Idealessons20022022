package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        list.add(new StringBuilder("bye"));
        list.add(new StringBuilder("Hi"));
        list.add(0,new StringBuilder("Hello"));
        for (StringBuilder s: list) {
            System.out.print(s + " ");
        }

        System.out.println();
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.set(1,new StringBuilder("Привет"));
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.remove("Привет");
        list.remove(new String("Hi")); // удаляет так как проверка идет с помощью equals
        System.out.println();

        ArrayList <StringBuilder> list3 = new ArrayList<>();
        list3.add(new StringBuilder("one"));
        list3.add(new StringBuilder("two"));

        list.addAll(list3);
        list.addAll(0, list3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // one two Hello one two
        }
        list3.set(0,new StringBuilder("three"));
        System.out.println();
        list3.get(1).append("!");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); //one two Hello one two  ничего не меняется
        }
       // list.clear(); //очищает
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // one two Hello one two
        }

        int x = list.indexOf("one");
        System.out.println();
        System.out.println(x);
    }
}

