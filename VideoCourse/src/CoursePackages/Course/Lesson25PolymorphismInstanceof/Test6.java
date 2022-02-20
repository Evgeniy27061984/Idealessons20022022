package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println(7);
        byte b2 = 3;
        short s1 = -6;
        char c = 100;
        int a2 = 3;
       // short s2 = a2; нельзя тк переменные
        short s3 = (short)a2;

        final int a3 = 3;
        short s4 = a3;
        // byte b3 = 128; не помещается в байт
            short s10 = 110;
        System.out.println(s10);
        int i2 = 100000;
        short s11 = (short) i2;
        System.out.println(s11);


        char c2 = (char) -8;
        System.out.println(c2);

        int i3 = (int) 3.64;
        System.out.println(i3); //3

        int i4 = 5;
        long l = 10;

        System.out.println(i4*=l); //cast auto

       // int i5 = i*l; нельзя
        long l2 = i4*l; // 50

        float f =3.14f;
        int i6 = 10;

        System.out.println(f+i6); // 13.14

        byte b5 = 3;
        short s5 = 5;
        char c5 = 4;

        System.out.println(b5 + s5 + c5); //12 int

        System.out.println(b5++);//4 byte

        byte b7 = 3;
        float s7 = 5;
        double c7 = 4;
        System.out.println(b7+s7+c7);//double

        float s8 = 5.88f; //если дробь то надо f
        float s9 = 5;
        float f10 = 0*5.2f;
        float f11 = 0*(float)5.2;

    }
}
