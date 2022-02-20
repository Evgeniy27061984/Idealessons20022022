package CoursePackages.Lesson1.HomeWork.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee (int id2, String surname2, int age2, int salary2,String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }
    void plusSalary () {
        salary *= 2;
    }

}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee
                (1,"Alex",4,20000,"IT");
        Employee e2 = new Employee
                (1,"Max",12,25000,"IT");
        System.out.println(e1.salary);
        System.out.println(e2.salary);
        e1.plusSalary();
        e2.plusSalary();
        System.out.println(e1.salary);
        System.out.println(e2.salary);
    }
}
