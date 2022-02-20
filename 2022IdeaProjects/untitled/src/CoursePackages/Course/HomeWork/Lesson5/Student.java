package CoursePackages.Lesson1.HomeWork.Lesson5;

public class Student {
    int numberTicketStudent;
    String name;
    String lastName;
    int yearStudy;
    double averageGradeMath;
    double averageGradeEconomy;
    double averageGradeLanguage;
}

class StudentTest {

    public void infoAverageStudent(Student st) {
        System.out.println
                (st.name + " " + st.lastName + " " + "средняя оценка - "
                        + (st.averageGradeMath + st.averageGradeEconomy
                            + st.averageGradeLanguage)/3);
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.numberTicketStudent = 1;
        student1.name = "Alexandr";
        student1.lastName = "Obanin";
        student1.yearStudy = 2020;
        student1.averageGradeEconomy = 4.9;
        student1.averageGradeMath = 4.9;
        student1.averageGradeLanguage= 4.9;

       StudentTest studentTest = new StudentTest();
       studentTest.infoAverageStudent(student1);
    }

}

