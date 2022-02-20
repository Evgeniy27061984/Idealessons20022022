package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class Test2 {
    //любой объект
    //не путать overloading(перегруженные методы)
    // и overriding(перезаписанные методы унаследованные)
    public Object abc1(){
        return new StringBuilder();
    }
    public Object abc2(){
        return new String();
    }

    public Employee abc3(){
        return new Doctor();
    }

    public Object abc4(){
        return new int[]{2,3,4};
    }

    public static void main(String[] args) {
        // Doctor is Employee Доктор это Люди
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee em1 = new Doctor();
        Employee em2 = new Teacher();
        Employee em3 = new Driver();
        Employee em4 = new Surgeon();
        Doctor em5 = new Surgeon();

        System.out.println(em1.salary);
        //System.out.println(em1.specialization); не работает так как в Employee нет этого
        // тип должен совпадать
       // System.out.println(em1.grade); не видна private
    }

}
class Employee {
    double salary = 100;
    String name = "Evgeniy";
    int age;
    int expensive;
    private int grade; // нигде ни видна
    void eat(){
        System.out.println("I eat");
    }
    void sleep(){
        System.out.println("I sleep");
    }
}

class Doctor extends Employee {
    String specialization;
    void treat(){
        System.out.println("I treat");
    }
}
class Surgeon extends Doctor {
    String scalpel;
    void operation(){

    }
}

class Teacher extends Employee {
    int countStudents;
    void teach(){
        System.out.println("I teach");
    }
}

class Driver extends Employee {
    String nameCar;
    void drive(){
        System.out.println("I drive");
    }
}