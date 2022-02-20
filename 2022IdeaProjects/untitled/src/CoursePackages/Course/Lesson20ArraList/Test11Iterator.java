package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Test11Iterator {

    public static void main(String[] args) {
        String a1 = "A";
        String a2 = "B";
        String a3 = "C";
        String a4 = "A";
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add(a1);
        list1.add(a2);
        list1.add(a3);
        list1.add(a4);
        System.out.println(list1);

        Iterator <String> it1 = list1.iterator();
        while (it1.hasNext()) { //смотрит есть ли дальше следующий элемент
            System.out.print(it1.next() + " ");
        }

        System.out.println();

        ListIterator <String> it2 = list1.listIterator();
        while (it2.hasNext()) { //смотрит есть ли дальше следующий элемент
            System.out.print(it2.next() + " ");
        }

        Iterator <String> it3 = list1.iterator();
        while (it3.hasNext()) { //смотрит есть ли дальше следующий элемент
                it3.next(); //выдает элемент
                it3.remove(); // удаляет
        }
        System.out.println();
        System.out.println(list1);
        list1.add("1");
        System.out.print(list1);
    }
}
