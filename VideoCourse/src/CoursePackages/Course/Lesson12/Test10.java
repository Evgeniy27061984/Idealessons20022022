package CoursePackages.Course.Lesson12;

public class Test10 {
    void maximum (int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("max " + i1);
        }
        else if (i2 > i1 && i2 > i1) {
            System.out.println("max " + i2);
        }
        else {
            System.out.println("max " + i3);
        }
    }

    void abc () {
        String str;
        int a = 11;
        if (a >= 10) {
            System.out.println("Привет");
        }
        if (a > 10) {
            System.out.println("Пока");
        }
    }

    public static void main(String[] args) {
//        int a = 160;
//        if (a < 20) {
//            System.out.println("Меньше 20");
//            a++
//        }

//        if (a < 20)
//            System.out.println("Меньше 20");
//            System.out.println("2Меньше 20"); // к if не относится


//        if (a < 20)
//            System.out.println("Меньше 20");
//        else
//            System.out.println("2Меньше 20");


//        if (a < 20) {
//            System.out.println("Меньше 20");
//        }
//        else {
//            System.out.println("2Меньше 20");
//        }


//        if (a < 20) {
//            System.out.println("Меньше 20");
//        }
//        else if (a < 100) {
//            System.out.println("Меньше 100");
//        }
//        else if (a < 200) {
//            System.out.println("меньше 200");
//        }
//        else {
//            System.out.println("другое");
//        }

        Test10 t = new Test10();
        t.maximum(3,7,1);
         t.abc();
         int a = 10;
         int b = 20;
         int maximum = (a > 10) ? a : b;
        System.out.println(maximum);


    }
}