package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test1 {
    public static void main(String[] args) {
        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Teacher(), new Driver(), new Doctor()};
        Help_able [] array3 = {new Teacher(), new Driver(), new Doctor()};


        System.out.println("**********");

        for (Employee emp: array1) {
            emp.work();
        }


        // polymorphism
        Employee em1 = new Teacher();
        Employee em2 = new Driver();
        Employee em3 = new Doctor();
        Help_able h1 = new Teacher();
        String s2 = null;
        Object o = new Object();
        System.out.println(em1 instanceof Object); // true
        System.out.println(em1 instanceof Driver); // false
        System.out.println(em1 instanceof Employee); // true
        System.out.println(s2 instanceof String); // false
        //System.out.println(em1 instanceof Test1); // ошибка никак не связаны
        System.out.println(o instanceof Teacher); // false ни каждый Object, но
        // каждый Teacher - Object

        System.out.println("**********");
        h1.help();
        // h1.work(); no in Help_able
        em1.work();
        em2.work();
        em3.work();
        em1.help(); //if Employee implements Help_able


    }

}

abstract class Employee implements Help_able {
    void sleep() {
        System.out.println("Employee sleep");
    }
    abstract void work();
}

class Teacher extends Employee {
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher help");
    }
}

class Driver extends Employee {
    void work() {
        System.out.println("Driver works");
    }

    @Override
    public void help() {

    }
}

class Doctor extends Employee {
    void work() {
        System.out.println("Doctor works");
    }

    @Override
    public void help() {

    }
}

interface Help_able {
    void help();
}