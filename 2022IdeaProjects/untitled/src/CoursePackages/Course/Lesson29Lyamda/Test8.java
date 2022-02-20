package CoursePackages.Course.Lesson29Lyamda;



import java.util.ArrayList;
//import java.util.function.Predicate;

public class Test8 {

}
class Student4 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student4(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo4 {
    void printStudent(Student4 st) {
        System.out.println("Info " + st.name + " " + st.sex
                + " " + st.age + " " + st.course + " " + st.avgGrade);
    }



//    void testStudent4(ArrayList<Student4> aL, Predicate<Student4> t) {
//        //вместо StudentChecks можно вставить любой класс имплементирующий StudentChecks
//        for (Student4 s : aL) {
//            if (t.test(s)) {
//                printStudent(s);
//            }
//        }
//    }
// Predicate это уже есть в java

    public static void main(String[] args) {
        ArrayList<Student4> list = new ArrayList<Student4>();
        Student4 st1 = new Student4("Ivan1", 'm', 22, 1, 1);
        Student4 st2 = new Student4("Ivan2", 'm', 22, 1, 2);
        Student4 st3 = new Student4("Ivan3", 'm', 22, 1, 3);
        Student4 st4 = new Student4("Ivan4", 'm', 22, 1, 4);
        Student4 st5 = new Student4("Ivan5", 'm', 22, 1, 5);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        for (Student4 s: list) {
            System.out.println(s.name);
        }
            System.out.println("---------");
//            list.removeIf(x->x.name.endsWith("5"));

        for (Student4 s: list) {
            System.out.println(s.name);
        }

        StudentInfo4 si = new StudentInfo4();
//        si.testStudent4(list,(Student4 s) -> {return s.avgGrade >3;});
//лямбда выражения можно использовать только когда интерфейс используе
// только один метод
//        si.testStudent4(list,(Student4 s) -> {return s.sex =='m';});
//        si.testStudent4(list,s -> s.sex =='m');
//        si.testStudent4(list, s -> {int x = 5; return s.sex =='m';});
//        si.testStudent4(list,(Student4 s) -> s.sex =='m'); //слева полный справа короткий
    }
}


