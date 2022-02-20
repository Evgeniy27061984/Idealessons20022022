package CoursePackages.Course.Lesson29Lyamda;

import CoursePackages.Course.Lesson7.A;

import java.util.ArrayList;

public class Test1 {

}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Info " + st.name + " "  + st.sex
                + " " + st.age + " " + st.course + " " + st.avgGrade);

    }
    void printStudentsOverGrade (ArrayList<Student> aL, double avgGrade) {
        for (Student s: aL) {
            if(s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }
    void printStudentsUnderGrade (ArrayList<Student> aL, double avgGrade) {
        for (Student s: aL) {
            if(s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }
    void printStudentsOverAge (ArrayList<Student> aL, double age) {
        for (Student s: aL) {
            if(s.age > age) {
                printStudent(s);
            }
        }
    }
    void printStudentsUnderAge (ArrayList<Student> aL, double age) {
        for (Student s: aL) {
            if(s.age < age) {
                printStudent(s);
            }
        }
    }
    void printStudentsBySex (ArrayList<Student> aL, char sex) {
        for (Student s: aL) {
            if(s.sex == sex) {
                printStudent(s);
            }
        }
    }
    void printStudentsMixCondition (ArrayList<Student> aL,double avgGrade, double age, char sex) {
        for (Student s: aL) {
            if(s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan1",'m',22,1,1);
        Student st2 = new Student("Ivan2",'m',22,1,2);
        Student st3 = new Student("Ivan3",'m',22,1,3);
        Student st4 = new Student("Ivan4",'m',22,1,4);
        Student st5 = new Student("Ivan5",'m',22,1,5);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo s = new StudentInfo();
        s.printStudentsOverGrade(list,3);

    }

}