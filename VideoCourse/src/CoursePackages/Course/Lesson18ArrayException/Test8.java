package CoursePackages.Course.Lesson18ArrayException;

public class Test8 {
    public static void main(String[] args) {
        char [] array = {'r','t','r'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(array, 1,2);
        System.out.println(sb);
        sb.insert(2, array,0,3);
        System.out.println(sb);
    }
}
