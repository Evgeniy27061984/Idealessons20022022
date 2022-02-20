package CoursePackages.Course.HomeWork.Lesson30;

import java.util.ArrayList;
//import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println(e.name + " " + e.department + " "
        + e.salary);

    }
//    void filterEmployee(ArrayList<Employee> l, Predicate<Employee> p) {
//        for (Employee e: l) {
//            if (p.test(e)) {
//                printEmployee(e);
//            }
//        }
   // }

    public static void main(String[] args) {
//        ArrayList<Employee> list = new ArrayList<Employee>();
//        Employee e1 = new Employee("Ivan", "IT", 150);
//        Employee e2 = new Employee("Nikolay", "Sales", 200);
//        Employee e3 = new Employee("Elena", "HR", 250);
//        Employee e4 = new Employee("Petr", "IT", 300);
//        Employee e5 = new Employee("Mariya", "IT", 350);
//        Employee e6 = new Employee("Alex", "HR", 400);
//        Employee e7 = new Employee("Ekaterina", "Sales", 450);
//        list.add(e1);
//        list.add(e2);
//        list.add(e3);
//        list.add(e4);
//        list.add(e5);
//        list.add(e6);
//        list.add(e7);
//
//        TestEmployee t = new TestEmployee();
//        t.filterEmployee(list, x -> x.department.equals("IT") && x.salary > 200);
    }
}