package CoursePackages.Course.Lesson2;

public class PrimitiveDataType {

    public static void main(String[] args) {


        byte b1 = 10;
        int i1 = 120;
        long l = 453453556756757L;
        long l2 = 45346757;
        float f = 3.2f;
        double d = 3.2d;
        double d2 = 3.2;
        char c = 'd';
        char c2 = 300;
        char c3 = '\u0500'; // шестиричная система
        char c4 = '\u05AF'; // шестиричная система
        boolean t = true;
        boolean t2 = false;

        System.out.println(c);      //d
        System.out.println(c+1);    //101
        System.out.println(c2);     //выведит символ Ĭ(№300)
        System.out.println(c2+1);   //301
        System.out.println(c3);     //Ԁ
        System.out.println(c4);     // ֯

        int a = 60; // десятичная система исчисления
        //int a2 = 0B0000110000; // двоичная
        int a3 = 074; // восьмеричная
        int a4 = 0x3C; // шестнадцатиричная
       // int a5 = 1_000_000; // не видит андерскор


//        System.out.println(a);     // 60
//        System.out.println(a2);     // 48
//        System.out.println(a3);     // 60
//        System.out.println(a4);     // 60
//        System.out.println(a5);     // 1000000

    }


}
