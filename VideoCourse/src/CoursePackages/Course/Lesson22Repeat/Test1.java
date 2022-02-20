package CoursePackages.Course.Lesson22Repeat;

public class Test1 {
    public static void main(String[] args) {
        int x = 1;
        String s = new String []{"1","2"}[x];
        System.out.println(s);//2
        Human.rest(); // в том же пакете
    }
}
