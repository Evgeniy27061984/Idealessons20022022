package CoursePackages.Course.Lesson16String;

public class Test7 {

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Uraaa";
        String s3 = s1.concat(s2).trim().replace("Uraaa", "Ura").substring(6,10);
        // выполняются слева направо
        System.out.println(s3);
    }
}
