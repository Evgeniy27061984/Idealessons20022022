package CoursePackages.Course.Lesson20ArraList;

import java.util.HashMap;
import java.util.Map;

public class Test15Map {
    public static void main(String[] args) {


       Map<Integer, String> a1 = new HashMap<>();//

        a1.put(1, "one");
        a1.put(2, "two");

        System.out.println(a1);

        a1.put(2, "два");
        System.out.println(a1);
        a1.remove(2);
        System.out.println(a1);
    }
}
