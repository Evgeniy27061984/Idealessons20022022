package CoursePackages.Course.Lesson26equalstoString;

public class Test5 {

    static {
        System.out.println("static block1");
    }
    static {
        System.out.println("static block2");
    }


    Test5() {
        System.out.println("constructor1");
    }

    Test5(int a) {
        this();// вызываем 1 конструтор
        System.out.println("constructor2");
    }


    String s;

    {
        s = "Bye";
        System.out.println("Hi"); // срабатывает каждый раз как создается объект
    }

    {
        s = "Bye";
        System.out.println("Hi2"); // срабатывает каждый раз как создается объект
    }

    public static void main(String[] args) {
        Test5 t1 = new Test5();// static block Hi Hi2 constructor1
        Test5 t2 = new Test5();// Hi Hi2 constructor1
        Test5 t3 = new Test5(1);// Hi Hi2 constructor1 constructor2
    }

}
