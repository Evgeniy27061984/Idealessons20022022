package CoursePackages.Course.HomeWork.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {

        public static ArrayList <String> abc (String ... array) {
            ArrayList <String> l = new ArrayList<>();

            for (String s: array) {
                    if(!l.contains(s)) {
                        l.add(s);
                    }
            }

            Collections.sort(l);
            System.out.println(l);
           return l;

    }

    public static void main(String[] args) {
            abc("Привет", "Пока","Удачи","Привет");
    }
}
