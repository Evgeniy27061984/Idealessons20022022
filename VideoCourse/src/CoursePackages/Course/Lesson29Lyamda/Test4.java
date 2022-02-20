package CoursePackages.Course.Lesson29Lyamda;

public class Test4 {
    static void def(Test5 t) {
        System.out.println(t.abc("Hello"));
    }
    static void def2(Test6 t) {
        System.out.println(t.abc());//5
    }
    static void def3(Test7 t) {
        System.out.println(t.abc("Hello","Hello"));//5
    }

    public static void main(String[] args) {
        def(x -> x.length());//6
        def((x) -> x.length());//6
        def((String x) -> x.length());//6
        def2(() -> 5 );//5
        def3((x,y) -> x.length());//6
        def3((String x,String y) -> x.length());//6
        def3((String x,String y) -> {return x.length();});//6
        def((var x) -> x.length());//6
    }
}
interface Test5{
    int abc(String s);
}
interface Test6{
    int abc();
}
interface Test7{
    int abc(String s1,String s2);
}
