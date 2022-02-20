package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test2 {
    public static void main(String[] args) {
        JumpAble j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof JumpAble) {
            System.out.println("j is JumpAble");
        }
        if (j instanceof Human) {
            System.out.println("j is Human");
        }
//        if (s instanceof Human) { //нельзя т к тип и объект равны по названиям
//            System.out.println("j is Student");
//        }
                if (s instanceof JumpAble) { //можно писать false
            System.out.println("j is JumpAble2");
        }

        if (j instanceof Human) { //можно
            System.out.println("j is Human2");
        }
    }
}
interface JumpAble {

}

class Human implements JumpAble {

}
class Man extends Human {

}
class Student {

}
