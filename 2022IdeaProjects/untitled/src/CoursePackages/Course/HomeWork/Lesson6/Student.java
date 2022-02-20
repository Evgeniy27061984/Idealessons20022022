package CoursePackages.Lesson1.HomeWork.Lesson6;

public class Student {
    int numberTicketStudent;
    String name;
    String lastName;
    int yearStudy;
    double averageGradeMath;
    double averageGradeEconomy;
    double averageGradeLanguage;


    Student(int numberTicketStudent2, String name2,String lastName2,
            int yearStudy2,double averageGradeMath2,double averageGradeEconomy2,
            double averageGradeLanguage2) {
        numberTicketStudent = numberTicketStudent2;
        name = name2;
        lastName = lastName2;
        yearStudy = yearStudy2;
        averageGradeMath = averageGradeMath2;
        averageGradeEconomy = averageGradeEconomy2;
        averageGradeLanguage = averageGradeLanguage2;
    }

    Student (int numberTicketStudent2, String name2,String lastName2) {
        this(numberTicketStudent2, name2,lastName2,
        0,0,0, 0);
    }
    Student() {

    }
}
class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(1, "Max", "Naslov");
        System.out.println(s.name);
    }

}
