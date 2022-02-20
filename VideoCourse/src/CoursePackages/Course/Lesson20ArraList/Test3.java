package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hi1");
        StringBuilder sb2 = new StringBuilder("Hi2");
        StringBuilder sb3 = new StringBuilder("Hi3");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }

//        for (StringBuilder s : list) {
//            System.out.println(s);
//        }

        list.remove(2);
        list.remove(new StringBuilder("Hi1")); // не удалил так как новый объект
        list.remove(sb1); // удалил
        // list.remove(3); IndexOutOfBoundsException
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
    }
}
