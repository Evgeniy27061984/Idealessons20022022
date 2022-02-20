package CoursePackages.Course.Lesson13;

public class Test1 {

}

class Student {

    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        final int x = 2;
        final int y = 2; // можно case: x*y

        Student st1 = new Student(4);
        switch (y) {
            case 2:
                System.out.println("grade - 2");
                break;
            case 3:
                System.out.println("grade - 3");
                break;
//            default:
//                System.out.println("wrong grade"); можно в середине только не забыть break
//                break;
            case 4:
                System.out.println("grade - 4");
                break;
            case 5:
                System.out.println("grade - 5");
                break;
            default:
                System.out.println("wrong grade");

        }





//        if (st1.grade == 2) {
//            System.out.println("grade - 2");
//        }
//        else if (st1.grade == 3) {
//            System.out.println("grade - 3");
//        }
//        else if (st1.grade == 4) {
//            System.out.println("grade - 4");
//        }
//        else if (st1.grade == 5) {
//            System.out.println("grade - 5");
//        }
//        else  {
//            System.out.println("wrong grade");
//        }
    }
}
