package CoursePackages.Course.HomeWork.Lesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    Employee(double salary2) {
        salary = salary2;
    }

   private Employee(String surname2) {
        surname = surname2;
    }

    public Employee(int id2) {
        id = id2;
    }

    public void showSalary (double salary2) {
        salary = salary2;
        System.out.println(salary);
    }

    public void showString (String surname2) {
        surname = surname2;
        System.out.println(surname);
    }

    public void showId (int id2) {
        id = id2;
        System.out.println(id);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(2000);
        //Employee emp = new Employee("Petrov"); не вызывается так как приват
        Employee emp2 = new Employee(20.2);
        emp.showSalary(200);
        emp.showString("Sidorov");
        emp.showId (45);
    }
}
