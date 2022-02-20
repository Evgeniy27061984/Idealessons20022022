package CoursePackages.Course.Lesson3;

public class Test3 {
    public static void main(String[] args) {
        double a = 5;
        double a2 = 3;
        double d = 5/3;
        double d2 = a/a2;

        System.out.println(d);      // 1
        System.out.println(d2);     // 1.6666666666666667

        int i = 5;
        int i2 = 3;
        int i3 = 5%3;
        int i4 = i/i2;

        System.out.println(i3);      // 2
        System.out.println(i4);     // 1

        int y = 2;
        int t = 2;
        int z = 5 - ++y;
        int z2 = 5 - t++;
        System.out.println(z);      // 2
        System.out.println(z2);      // 3

        int n = 2;
        int m = 4;

        n+=m;
        System.out.println(n);      // 3
        System.out.println(n > m); //true

        boolean e = n> m; //true


        long h = 10;
        // int f = h; нельзя

        // || - если хотя бы одна true, то true
        // && - если хотя бы одна false, то false

        boolean g = false;
        boolean g2 = false;
        boolean g3 = true;
        boolean result = g || g2 || g3;

        System.out.println(result);

        boolean p = false;
        boolean p2 = false;
        boolean p3 = false;
        boolean result2 = p || p2 || p3;
        System.out.println(result2);

        boolean v = false;
        boolean v2 = true;
        boolean v3 = true;
        boolean result3 = v && v2 && v3;

        System.out.println(result3);

        boolean s = true;
        boolean s2 = true;
        boolean s3 = true;
        boolean result4 = s && s2 && s3;
        System.out.println(result4);

        int j = 10;
        int j2 = 11;
        int j3 = 12;

        boolean result5 = j < j2 && j2 < j; // true && false = false
        System.out.println(result5);

        boolean result6  = j < j2 && j3 == ++j2; // true && true = false
        System.out.println(result6);


        // | - если хотя бы одна true, то true выполняет все действия
        // & - если хотя бы одна false, то false выполняет все действия

        int k = 10;
        int k2 = 11;
        int k3 = 12;

        boolean result7 = k < k2 | k3 == ++k2; // true | true = true
        //boolean result7 = k < k2 || k3 == ++k2; // true | true = true

       System.out.println(result7);
       System.out.println(k2);

        //System.out.println(k2&&k3); c && и || нельзя так, а с & и | можно

        int w = 10;
        int w2 = 11;
        System.out.println(w&w2);
        //1010
        //1011
        //1010
        //10

        System.out.println(w|w2);
        //1010
        //1011
        //1011
        //11

        // ^ возвращает true когда одна операнда true
        boolean u = false;
        boolean u2 = true;
        boolean u3 = false;
        boolean u4 = false;
        boolean result8 = u2^u3^u4; //true
        boolean result9 = u^u2^u3^u4; //true
        System.out.println(result8);
        System.out.println(result9);
        char vv= 'a';
        int gg = 10;
        System.out.println(vv+0);
        System.out.println(vv%gg);

        /*
        ++ -- !
        * / %
        + -
        < <= > >=
        == !=
        && ||
        = += -= /= *= %=
         */
    }
}
