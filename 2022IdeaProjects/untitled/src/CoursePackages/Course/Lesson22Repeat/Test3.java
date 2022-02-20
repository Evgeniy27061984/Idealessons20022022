package CoursePackages.Course.Lesson22Repeat;

public class Test3 {
    void increaseSalary(Employee e){
        e.salary += 100;
    }

    public static void main(String[] args) {
        //inheritance
        Doctor doc = new Doctor();
        String name = doc.name = "Jon";
        System.out.println(name);
        doc.treat();

        Surgeon serg = new Surgeon();
        System.out.println(serg.name);

    }
}
class Employee extends java.lang.Object{ //можно extends Object
    // это необязательно, все делается автоматически
    double salary = 100;
    String name = "Evgeniy";
    int age;
    int expensive;
    void eat(){
        System.out.println("I eat");
    }
    void sleep(){
        System.out.println("I sleep");
    }
}



class Doctor extends Employee{
    String specialization;
    void treat(){
        System.out.println("I treat");
    }
}


class Surgeon extends Doctor{
    String scalpel;
    void operation(){

    }
}

class Dentist extends Doctor {

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