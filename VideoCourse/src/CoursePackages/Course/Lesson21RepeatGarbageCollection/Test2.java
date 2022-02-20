package CoursePackages.Course.Lesson21RepeatGarbageCollection;

public class Test2 {
    public static void main(String[] args) {
        String s1,s2;
        s1 = new String ("Hello"); // 1 объект
        s2 = new String ("Bye"); // 2 объект
        s1 = s2; // стало Bye (объект Hello может быть удален)
        String s3 = s1; // Bye
        s1 = null; // s1 ссылка пропала но s
    }
    // после фигурных скобок все объекты могут быть удалены
}

//class Test33 {
//    public Test33 (){
//        this(); нельзя рекурсию вызывать самого себя
//    }
//}
