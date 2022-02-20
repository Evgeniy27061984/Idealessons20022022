package CoursePackages.Course.Lesson29Lyamda;

import java.util.ArrayList;

public class Test3 {

}
    class Student3 {
        String name;
        char sex;
        int age;
        int course;
        double avgGrade;

        public Student3(String name, char sex, int age, int course, double avgGrade) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.course = course;
            this.avgGrade = avgGrade;
        }
    }

    class StudentInfo3 {
        void printStudent(Student3 st) {
            System.out.println("Info " + st.name + " " + st.sex
                    + " " + st.age + " " + st.course + " " + st.avgGrade);
        }

        void testStudent3(ArrayList<Student3> aL, StudentChecks3 sc1) {
            //вместо StudentChecks можно вставить любой класс имплементирующий StudentChecks
            for (Student3 s : aL) {
                if (sc1.test(s)) {
                    printStudent(s);
                }
            }
        }


        public static void main(String[] args) {
            ArrayList<Student3> list = new ArrayList<Student3>();
            Student3 st1 = new Student3("Ivan1", 'm', 22, 1, 1);
            Student3 st2 = new Student3("Ivan2", 'm', 22, 1, 2);
            Student3 st3 = new Student3("Ivan3", 'm', 22, 1, 3);
            Student3 st4 = new Student3("Ivan4", 'm', 22, 1, 4);
            Student3 st5 = new Student3("Ivan5", 'm', 22, 1, 5);
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);
            StudentInfo3 si = new StudentInfo3();
//            si.testStudent3(list,(Student3 s) -> {return s.avgGrade >3;});
//            //лямда выражения можно использовать только когда интерфейс использует
//            // только один метод
//            si.testStudent3(list,(Student3 s) -> {return s.sex =='m';});
//            si.testStudent3(list,s -> s.sex =='m');
//            si.testStudent3(list, s -> {int x = 5; return s.sex =='m';});
//            si.testStudent3(list,(Student3 s) -> s.sex =='m'); //слева полный справа короткий
    }
}


    interface StudentChecks3 {
        boolean test(Student3 s);
        //boolean test2(Student3 s); нельзя а то лямда не получится
    }




