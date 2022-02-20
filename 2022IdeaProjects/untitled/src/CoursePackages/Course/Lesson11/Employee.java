package CoursePackages.Course.Lesson11;

import javax.swing.plaf.PanelUI;

public class Employee {
    public String name;
    public double salary;

    public Employee (String name,double salary) {
       this.name = name;
       this.salary = salary;
    }

    public double increase (double a) {
        a *= 2;
        this.salary = a;
        return a;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Ivan", 200.2);
        double d = emp.increase(emp.salary);
        System.out.println(d);
        System.out.println(emp.salary);

    }
}
