package CoursePackages.Course.Lesson31Generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> all1 = new ArrayList<>();
        all1.add(1);
        all1.add(2);
        all1.add(3);
        Integer a1 = genMethod.getSecondElement(all1);
        System.out.println(a1);

        ArrayList <String> all2 = new ArrayList<>();
        all2.add("one");
        all2.add("two");
        all2.add("three");
        String a2 = genMethod.getSecondElement(all2);
        System.out.println(a2);
    }

}

class genMethod {
    public static <T> T getSecondElement (ArrayList<T> a1) {
        return a1.get(1);
    }
}
