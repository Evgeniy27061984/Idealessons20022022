package CoursePackages.Course.Lesson16part2;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " ";
        String s3 = "";
        String s4 = null;
        String s5 = "   Hello  ";
        System.out.println(s1.isBlank());//false
        System.out.println(s2.isBlank());//true если пробелы таб

        System.out.println(s3.isEmpty());//true
        //System.out.println(s4.isEmpty());
        // NullPointerException ссылка ни куда не ссылется
        System.out.println(s5.strip());//Hello работает как trim
        System.out.println(s5.stripLeading());//Hello работает как trim спереди убирает
        System.out.println(s5.stripTrailing());//Hello работает как trim в конце убирает

    }
}
