package CoursePackages.Course.HomeWork.Lesson16;

public class Test2 {
    public static void email(String s) {
        int a = 0; // позиция @
        int b = 0; // позиция .
        int c = 0; // позиция ;

        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);

            System.out.println(s.substring(a + 1, b));

        }

    }
        public static void main (String[]args){
            String em = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
            System.out.println(em.length());
            email(em);
        }

}

