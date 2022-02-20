package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        list.add("bye");
        list.add("Hi");
        list.add(0,"Hello");
        for (String s: list) {
            System.out.print(s + " "); //Hello bye Hi
        }

        System.out.println();
        System.out.println(list.get(1)); // bye

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // Hello bye Hi
        }

        list.set(1,"Привет");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); //Hello Привет Hi
        }

        list.remove("Привет");
        list.remove(new String("Hi")); // удаляет так как проверка идет с помощью equals
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); //Hello
        }


        ArrayList <String> list3 = new ArrayList<String>();
        list3.add("one");
        list3.add("two");
        System.out.println();
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " "); // one two
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // Hello
        }

        list.addAll(list3);
        list.addAll(0, list3);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // one two Hello one two
        }
        list3.set(0,"three");
        System.out.println();

        for  (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); //one two Hello one two  ничего не меняется
        }

        System.out.println(list.indexOf(new String("Hello"))); //one two Hello one two 2

    }
}
