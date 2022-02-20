package CoursePackages.Course.Lesson21RepeatGarbageCollection;

public class Test4 {

    public void abc(String s) {
        System.out.println(s);
    }

    public void abc(boolean b) {
        System.out.println(b);
    }

    public StringBuilder abc(StringBuilder sb) {
        System.out.println(sb);
        return new StringBuilder();
    }
}
