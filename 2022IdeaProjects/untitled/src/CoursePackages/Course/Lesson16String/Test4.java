package CoursePackages.Course.Lesson16String;

public class Test4 {


}
class Employee {
    double salary;
    boolean isManager;

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee(100.1, true);
        System.out.println("On manager? " + emp.isManager + " Зарплата " +emp.salary);
    }
}

