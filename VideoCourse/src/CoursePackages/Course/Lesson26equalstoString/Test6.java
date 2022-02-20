package CoursePackages.Course.Lesson26equalstoString;

public class Test6 {
    int a = 3;//1   non static переменная

    Test6() {
        a = 4;//3
    }

    {
        a = 5;//2 non static
    }

//    public static void main(String[] args) {
//        Test6 t = new Test6();
//        System.out.println(t.a);//4
//    }

}
class A {

    static final int i;
    final int i2;
    static {
        i = 3;
        //i2=5; no non static
    }

    A() {
        i2 = 5;

    }
}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        c = 5;
        d = 3;
        //e = 2; no final
        f = 0;
    }


}

class C {
    String s = "ok";

    {
        System.out.println(s);//3
    }
    static int i3 = 0;

    static
    {
        System.out.println(i3);//1
    }

    static {
        i3 = i3 + 1;
        System.out.println(i3);//2
    }
    C() {
        System.out.println("constructor");//4
    }

//    public static void main(String[] args) {
//        System.out.println("main");
//        C c = new C();//0,1,main,ok,constructor
//        //  1)    статики
//        //  2)    все что в main
//        //  3)    non static (вне конструктора)
//        //  4)    конструктор
//    }
}

class D{
    static {
        abc(2);//1
    }

    static void abc(int a) {
        System.out.println(a + " ");//1
    }

    D() {
        abc(5);//5
    }

    static {
        abc(4);//2
    }

    {
        abc(6);//3
    }


    static {
        // перед созданием объекта создаются все non static
        new D();//6
        System.out.println("new Object");//7
    }

    {
        abc(8);//4
    }

    public static void main(String[] args) {
//2,4,6,8,5 new Object
    }

}