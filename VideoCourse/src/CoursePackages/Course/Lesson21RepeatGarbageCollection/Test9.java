package CoursePackages.Course.Lesson21RepeatGarbageCollection;

public class Test9 {
    int x = 0;
    public Test9(){
        System.out.println(x);
    }
    Test9 m = new Test9(); // бесконечно будет создание объекта

}

class TestEmployee {
    public static void main(String[] args) {
        Test9 t = null;
        t = new Test9();
        //t = null;
    }

}
