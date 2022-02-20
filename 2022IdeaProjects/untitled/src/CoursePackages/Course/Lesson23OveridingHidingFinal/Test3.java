package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class Test3 {
    // overriding только не статические методы
    public static void main(String[] args) {
        Employee2 em = new Employee2();
        em.eat();
        Teacher2 t = new Teacher2();
        t.eat();
    }
}
class Food {

}

class Fruit extends Food {

}


class Employee2 {
    double salary = 100;
    String name = "Evgeniy";
    int age;
    int expensive;
    private int grade; // нигде ни видна

    Food eat0(){ // modifier одинаковый должен и non-static
        System.out.println("Food eat employee");
        Food f = new Food();
        return f;
    }

    void eat(){ // если параметры должны быть одинаковые
        System.out.println("Eat employee");
    }
    void sleep(){
        System.out.println("I sleep");
    }
}

class Teacher2 extends Employee2 {
    int countStudents;

    Fruit eat0(){ //или Food т е extends Food
        System.out.println("Food eat teacher");
        Fruit f = new Fruit(); //или Food f = new Food();
        return f;
    }

    void eat(){
        System.out.println("Eat teacher");
    }
    void teach(){
        System.out.println("I teach");
    }
}

class A {
    Employee2 objectCreation() {
        System.out.println("Ok");
        return new Employee2();
    }
}

class B extends A  {
    Employee2 objectCreation() { // или Teacher2 т к extends
        System.out.println("Ok");
        return new Employee2();
    }
}