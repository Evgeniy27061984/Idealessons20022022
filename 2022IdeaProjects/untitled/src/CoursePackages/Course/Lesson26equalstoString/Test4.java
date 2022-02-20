package CoursePackages.Course.Lesson26equalstoString;

public class Test4 {
    //static void abc(String s ) {System.out.println("A");}
    static void abc(String ... s ) {System.out.println("B");}
   // static void abc(Object s ) {System.out.println("C");}
    static void abc(String s,String s2 ) {System.out.println("D");}

    static void def(Long s ) {System.out.println("E");}
    static void def(Long... s ) {System.out.println("F");}

    //static void def(long s ) {System.out.println("G");}
    static void def(Object o ) {System.out.println("I");}
    //static void def(Integer i ) {System.out.println("H");}


    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("Hi");//A,C,B
        //t.def(50l);//G
        t.def(50);//G,H,I
        //2 этапа конвертации нельзя long в Long нельзя
    }



}
