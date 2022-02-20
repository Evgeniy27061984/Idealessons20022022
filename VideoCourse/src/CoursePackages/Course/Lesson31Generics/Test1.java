package CoursePackages.Course.Lesson31Generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        //<String> - это generics
        Info<String> info1 = new Info<>("Привет");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(100);
        System.out.println(info2);
        String s = info1.getValue();
        int i = info2.getValue();
    }
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
    //Info info без <>
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString () {
        return "{" + value + "}";
    }
    public T getValue() {
        return value;
    }
}

//class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//} нельзя
