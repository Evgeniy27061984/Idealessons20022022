package CoursePackages.Course.HomeWork.Lesson16;



public class Test1 {
    public static void email(String s) {

        for (int i = 0; i < s.length(); ) {

            int c1 = s.indexOf('@', i);
            int c2 = s.indexOf('.', i);
            if(c1 == -1) {
                break;
            }
            String word = s.substring(c1 + 1, c2);
            System.out.println(word);
            i = c2 + 1;
        }
    }

    public static void main(String[] args) {
        String em = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        System.out.println(em.length());
        email(em);
    }
}
