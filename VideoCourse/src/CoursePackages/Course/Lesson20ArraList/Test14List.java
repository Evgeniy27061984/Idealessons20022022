package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;
import java.util.List;

public class Test14List {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");
        a1.add("5");

        System.out.println(a1);
        List<String> list = List.of("one","two"); // null нельзя
        System.out.println(list);
        //list.add("three");// нельзя изменять list
        //System.out.println(list);//UnsupportedOperationException

        List<String> list2 = List.copyOf(a1);
        System.out.println(list2);//1 2 3 4 5


    }
}
