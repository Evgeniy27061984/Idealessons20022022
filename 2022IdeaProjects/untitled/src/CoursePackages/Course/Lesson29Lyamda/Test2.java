package CoursePackages.Course.Lesson29Lyamda;

import java.util.ArrayList;

public class Test2 {

}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo2 {
    void printStudent(Student2 st) {
        System.out.println("Info " + st.name + " "  + st.sex
                + " " + st.age + " " + st.course + " " + st.avgGrade);
    }
    void testStudent(ArrayList<Student2> aL, StudentChecks sc1) {
    //вместо StudentChecks можно вставить любой класс имплементирующий StudentChecks
        for (Student2 s: aL) {
            if(sc1.test(s)) {
            printStudent(s);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<Student2>();
        Student2 st1 = new Student2("Ivan1",'m',22,1,1);
        Student2 st2 = new Student2("Ivan2",'m',22,1,2);
        Student2 st3 = new Student2("Ivan3",'m',22,1,3);
        Student2 st4 = new Student2("Ivan4",'m',22,1,4);
        Student2 st5 = new Student2("Ivan5",'m',22,1,5);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo2 s = new StudentInfo2();
        FindStudentsOverGrade f = new FindStudentsOverGrade();
        s.testStudent(list,f);
    }
}

interface StudentChecks {
    boolean test(Student2 s);
}

class FindStudentsOverGrade implements StudentChecks{
    @Override
    public boolean test(Student2 s) {
        return s.avgGrade > 3;
    }
}
class FindStudentsUnderGrade implements StudentChecks {
    @Override
    public boolean test(Student2 s) {
        return s.avgGrade < 3;
    }

    class FindStudentsBySex implements StudentChecks {
        @Override
        public boolean test(Student2 s) {
            return s.sex == 'm';
        }
    }
}