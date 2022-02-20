package CoursePackages.Course.Lesson24AbstractInterface;

public class Test3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.sleep();
        Help_able h = new Teacher(); // only methods Help_able
        h.help();
        h.fireExtinguishing("water");

    }

}
class Employee {
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

class Teacher extends Employee implements Help_able {
    int countStudents;
    void teach(){
        System.out.println("I teach");
    }

    @Override
    public void help() {

    }

    @Override
    public void fireExtinguishing(String subject) {

    }


}

class Driver extends Employee implements Swim_able, Help_able{
    String nameCar;

    void drive(){
        System.out.println("I drive");
    }

    @Override
    public void swim() {

    }

    @Override
    public void help() {
        System.out.println(a); // a изменить нельзя
    }

    @Override
    public void fireExtinguishing(String subject) {

    }


}

// interface need when additional method
// all methods in interface abstract and do not need write abstract
// methods of interface is public, means must public in classes
// first extends, second implements
// in interfaces only final variable
// ArrayList implements List (interface)
// do not write final
interface Help_able {
    public abstract void help(); // must do not write public abstract (default value)
    void fireExtinguishing(String subject);
    int a = 10; // always final static
}

abstract interface Swim_able { //abstract must do not write
    void swim();
}