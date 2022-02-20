package CoursePackages.Course.Lesson11;

public class Student {
    public String name;
    public int course;
    public double grade;
 ;

    public Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
//
//    public static void swap(Student s1, Student s2) { // не работает замена имен
//        Student s3 = s1;
//        s1= s2;
//        s2 = s3;
//
//    }

    public static void swap(Student s1, Student s2) { // здесь работает замена имен
        Student s3 = new Student(s1.name, 0, 0);
        s1.name = s2.name;
        s2.name = s3.name;


    }

    public static void changeName (Student s) {
        s.name = "Vasiliy";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Alex", 1,5.3);
        Student st2 = new Student("Max", 2,5.6);
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st1);
        System.out.println(st1.name);
    }
}
