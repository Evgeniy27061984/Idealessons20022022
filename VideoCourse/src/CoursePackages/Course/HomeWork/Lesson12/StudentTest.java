package CoursePackages.Course.HomeWork.Lesson12;

import CoursePackages.Course.Lesson11.Student;

public class StudentTest {
    public  static void compressionStudent1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course
                && st1.grade == st2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты разные");
        }

    }

    public  static void compressionStudent2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Студенты одинаковое все");
                } else {
                    System.out.println("Студенты одинаковые имена и курсы а разные оценки");
                }
            } else {
                System.out.println("Имена одинаковые, но курсы разные");
            }
        } else {
            System.out.println("Имена разные");
        }
    }


    public static void main(String[] args) {
        Student st1 = new Student("Ivan",1,7.8);
        Student st2 = new Student("Ivan",1,7.8);
        compressionStudent1(st1,st2);
        compressionStudent2(st1,st2);
    }
}
