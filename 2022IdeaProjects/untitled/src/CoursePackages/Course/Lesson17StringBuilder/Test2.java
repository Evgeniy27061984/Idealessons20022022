package CoursePackages.Course.Lesson17StringBuilder;

public class Test2 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append("11");
        System.out.println(sb2);
        sb2.append("1").append("1");
        System.out.println(sb1); // ссылаются на один объект
        System.out.println(sb2);
        System.out.println(sb1 == sb2); //true
        System.out.println(sb1.equals(sb2)); //true

        StringBuffer sb3 = new StringBuffer("Hello");
        String s1 = new String(sb1);
        String s2 = new String(sb3);
    }
}
