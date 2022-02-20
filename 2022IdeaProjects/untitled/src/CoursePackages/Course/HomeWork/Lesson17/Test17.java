package CoursePackages.Course.HomeWork.Lesson17;

public class Test17 {
    public static boolean ravenstvo(StringBuilder s1, StringBuilder s2) {
        boolean result = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    result = false;
                    break;
                }
            }


        }else {
            result = false;
        }
        return result;
    }
    public static void main(String[] args) {
            StringBuilder sb1 = new StringBuilder("Hello");
            StringBuilder sb2 = new StringBuilder("Hello");
            boolean w = ravenstvo(sb1,sb2);
        System.out.println(w);
        System.out.println(sb1.equals(sb2));


    }
}
