package CoursePackages.Course.Lesson6ThisOverLoad;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;
    // модификаторы могут быть разные или одинаковые это не влияет на кострукторы
    Employee (int id2, String surname2, int age2){
        id = id2;
        surname = surname2;
        age = age2;
    }

    public Employee (String surname2, int age2){
        surname = surname2;
        age = age2;
    }

    Employee (int id2, String surname2, int age2,double salary2, String department2){
        id = id2;
        surname = surname2;
        age = age2;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Petrov", 25);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(1, "Sidorov",
                25, 200.2, "IT");
        System.out.println(emp3.surname);
    }
}
