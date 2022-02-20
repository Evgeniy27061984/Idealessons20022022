package CoursePackages.Course.Lesson7;

public class Employee {
    public double salary;

    public Employee(double salary2) {
        salary = salary2;
    }

    public void doubleSalary() {
        System.out.println("Зарплата " + salary * 2);
    }

}

class TestEmployee {
    public static void main(String[] args) {
            Employee emp = new Employee(2000);
            System.out.println(emp.salary);
            emp.doubleSalary();
    }
}

