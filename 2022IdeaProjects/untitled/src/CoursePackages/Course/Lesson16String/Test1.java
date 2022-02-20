package CoursePackages.Course.Lesson16String;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String ("privet Tim");
        String s2 = new String ("abcdefgj");

        int a = s1.length();
        System.out.println(a);
        char c1 = s1.charAt(3);
        System.out.println(c1); // v
        //char c2 = s1.charAt(10);//exception StringIndexOutOfBoundsException
        //System.out.println(c2); //exception StringIndexOutOfBoundsException

        int c3 = s1.indexOf("v"); // indexOf(String) 3
        System.out.println(c3);

        int c4 = s1.indexOf('e'); // indexOf(Char) 3
        System.out.println(c4);

        int c5 = s1.indexOf("i",4 ); // indexOf(String, fromIndex) 8
        System.out.println(c5);
        int c6 = s1.indexOf("i",2 ); // indexOf(String, fromIndex) 2
        System.out.println(c6);
        int c7 = s1.indexOf('i',4 ); // indexOf(Char, fromIndex) 8
        System.out.println(c7);
        int c8 = s1.indexOf('i',2 ); // indexOf(Char, fromIndex) 2
        System.out.println(c8);

        boolean c9 = s2.startsWith("abc"); // startsWith(boolean) true
        System.out.println(c9);
        boolean c10 = s2.startsWith("abc", 3); // startsWith(boolean,int from) false
        System.out.println(c10);

        boolean c11 = s2.endsWith("abc"); // startsWith(String) false
        System.out.println(c11); // заканчивается abс? нет
        boolean c12 = s2.endsWith("fgj"); // startsWith(String) true
        System.out.println(c12); // заканчивается fgj? да


        String c13 = s1.substring(1); // substring(int beginIndex) rivet Tim
        System.out.println(c13);

        String c14 = s1.substring(1, 3); // substring(int beginIndex, int endIndex) ri (3 не включено)
        System.out.println(c14);
    }
}
