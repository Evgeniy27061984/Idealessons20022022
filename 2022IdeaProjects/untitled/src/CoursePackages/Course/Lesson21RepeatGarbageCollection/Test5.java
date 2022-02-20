package CoursePackages.Course.Lesson21RepeatGarbageCollection;

public class Test5 {

    void abc (int i){
        System.out.println(i); //99
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        char a = 'c';
        t.abc(a);
        System.out.println(a); // c
        System.out.println('b' + a); //197
    }
}
