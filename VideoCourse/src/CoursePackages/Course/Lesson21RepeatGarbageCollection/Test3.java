package CoursePackages.Course.Lesson21RepeatGarbageCollection;

public class Test3 {
//    public Test3 (){
//        System.out.println("Created object");
//    }
    Test3 test3; // переменная типа Test3 т к есть класс Test3 Нежелательно чтобы
    //методы и переменные совпадали имена
    void Test3 (){
        System.out.println("Created object"); // если добавить вместо public
    }
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
