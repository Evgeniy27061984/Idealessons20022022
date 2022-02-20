package CoursePackages.Lesson1.Lesson6;

public class EmployeeThis {
    int id;
    String surname;
    int age;
    double salary;
    String department;
    // модификаторы могут быть разные или одинаковые это не влияет на кострукторы
    public EmployeeThis (int id2, String surname2, int age2){
        this(id2,surname2,age2,0,null);
    }

    EmployeeThis (String surname3, int age3){
        this(0,surname3,age3,0,null);

    }
    EmployeeThis (int id4, String surname4, int age4,double salary4,
                  String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
}

class TestEmployeeThis {
    public static void main(String[] args) {
        EmployeeThis emp1 = new EmployeeThis(1, "Ivanov", 25);
        System.out.println(emp1.surname);
        EmployeeThis emp2 = new EmployeeThis("Petrov", 25);
        System.out.println(emp2.surname);
        EmployeeThis emp3 = new EmployeeThis(1, "Sidorov",
                25, 200.2, "IT");
        System.out.println(emp3.surname);
    }
}
