package CoursePackages.Course.Lesson30Lyamda;

import CoursePackages.Course.Lesson10.A;

import java.util.ArrayList;

public class Test1 {
    //var v = 100; нельзя вне метода
    public static void main(String[] args) {

//        TestInferenceType t1 = new TestInferenceType();
//        var t2 = new TestInferenceType(); // local variable inference
//        var i = 10;
//        var f = 1.8f;//float
//        var array = new String []{"1", "2"};
//        var result = abc();
//        Object obj1 = "Привет";
//        var obj2 = obj1;
//        ArrayList <String>  a1 = new ArrayList<>();
//        for (var s: a1) {
//            System.out.println(s);
//        }
       // var array2  = {1,2}; нельзя
//        var array2  = new int[]{1,2};

       // int [] array3  = new int[]{1,2};нельзя [] с var
        int array4 []   = new int[]{1,2};
        int [] array5  = new int[] {1,2};
        //var h; нельзя без объявления
        //var h2 = null; нельзя
//        var var = "var"; //можно но не профессионально
       // var r = abc(1); нельзя
    }
    static double abc() {
        return 3.14;
    }
//    static double abc2(var d) {
//        return 3.14;
//    }
}

class TestInferenceType {

}
