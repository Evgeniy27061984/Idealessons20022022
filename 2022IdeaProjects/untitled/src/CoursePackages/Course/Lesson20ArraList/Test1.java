package CoursePackages.Course.Lesson20ArraList;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Hello");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("Hi"));

        System.out.println(list);

        //ArrayList <String> list2 = new ArrayList<String>();
        ArrayList <String> list2 = new ArrayList<String>();
        list2.add("My");
        //list2.add(s); тип должен быть String

        ArrayList <StringBuilder> list3 = new ArrayList<StringBuilder>();
        List<StringBuilder> list4 = new ArrayList<StringBuilder>();
        list4.add(new StringBuilder("Hi"));

        ArrayList<StringBuilder> list5 = new ArrayList(30);

        //ArrayList<StringBuilder> list6 = new ArrayList(-30); IllegalArgumentException

        ArrayList <String> list7 = new ArrayList<String>(list2);
        System.out.println(list7 == list2); //false ссылаются на разный объект


    }
}
class Car {

}
class Student {

}