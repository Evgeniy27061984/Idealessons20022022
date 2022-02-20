package CoursePackages.Course.HomeWork.Lesson4;

public class Student {
    int numberTicketStudent;
    String name;
    String lastName;
    int yearStudy;
    double averageGradeMath;
    double averageGradeEconomy;
    double averageGradeLanguage;


    public void infoStudent() {
        System.out.println
                (name + " " + lastName + " " + "средняя оценка - "
                        + (averageGradeMath + averageGradeEconomy + averageGradeLanguage)/3);
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.numberTicketStudent = 1;
        student1.name = "Alexandr";
        student1.lastName = "Obanin";
        student1.yearStudy = 2020;
        student1.averageGradeEconomy = 4.9;
        student1.averageGradeMath = 4.9;
        student1.averageGradeLanguage= 4.9;

        Student student2 = new Student();
        student2.numberTicketStudent = 1;
        student2.name = "Alina";
        student2.lastName = "Obanin";
        student2.yearStudy = 2020;
        student2.averageGradeEconomy = 5.0;
        student2.averageGradeMath = 5.0;
        student2.averageGradeLanguage= 4.8;

        Student student3 = new Student();
        student3.numberTicketStudent = 1;
        student3.name = "Maxim";
        student3.lastName = "Maslov";
        student3.yearStudy = 2020;
        student3.averageGradeEconomy = 5.0;
        student3.averageGradeMath = 4.9;
        student3.averageGradeLanguage= 4.9;

        System.out.println(student1.averageGradeLanguage);
        student1.infoStudent();
        student2.infoStudent();
        student3.infoStudent();
    }

}