package CoursePackages.Course.Lesson19Parametr;

public class Test2 {
    static void sum (int a, int b) {
        System.out.println(a + b);
    }
    static void sum (int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void sum (int ... a) { // массив
        int amount = 0;
        for (int i = 0; i < a.length; i++) {
            amount += a[i];
            System.out.println(amount);
        }
    }
    // overload методы имена разные
    static void sum2 (int [] a) { // массив Нельзя два (int [] a, int [] b)


            int amount = 0;
            for (int i = 0; i < a.length; i++) {
                amount += a[i];
                System.out.println(amount);
            }
    }
    static void sum3 (String s, int ... a) { // массив  массив Нельзя (int [] b, String s) varags  должен  быть последним
        int amount = 0;
        for (int i = 0; i < a.length; i++) {
            amount += a[i];
            System.out.println(amount);
        }

    }
    static void sum5 (int ... a){

    }
    public static void main(String[] args) {
        //public static void main(String ... args) {
        sum(1,2,3,4);
        sum3("Hello", 1,2,3,4);
        sum2(new int []{1,2,3,4});
        sum5(null);
    }
}
