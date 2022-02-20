package CoursePackages.Course.HomeWork.Lesson26;

public class X {
    static String s = "";

    {s += "A";}

    static
    {s += "B";}

    {s += "C";}

}

class Z {
    public static void main(String[] args) {
        System.out.println(X.s); //B
        System.out.println(X.s); //B
        new X();//BAC
        new X();//BACAC
        System.out.println(X.s);//BACAC


    }
}
