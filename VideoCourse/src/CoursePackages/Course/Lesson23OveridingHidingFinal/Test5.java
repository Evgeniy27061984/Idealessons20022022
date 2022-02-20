package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class Test5 {
    // all methods except (кроме) private, static, final overriding
    //private, static, final  methods no overriding
    //private не наследуются значит и не overriding и не hiding
    //final не наследуются значит и не overriding и не hiding
    //overriding and polymorphism related to object creation (связаны с созданием объекта)
    // final class cannot have descendants (не может быть потомков) no extends
    // final performance
    // final cannot constructor
    public static void main(String[] args) {
        Teacher3 e = new Teacher3();
        e.sleep(); //public
        Employee3 em = new Teacher3();
        em.sleep(); //не наследован значит не виден
    }
}

class Food3 {}

class Fruit3 extends Food3{}

class Employee3 {
    double salary = 100;
    String name = "Evgeniy";

    Food3 eat0(){ // modifier одинаковый должен и non-static
        System.out.println("Food eat employee");
        Food3 f = new Food3();
        return f;
    }

    void eat(){ // если параметры должны быть одинаковые
        System.out.println("Eat employee");
    }

    static void sleep(){
        System.out.println("sleep employee");
    }
}

class Teacher3 extends Employee3 {
    int countStudents;

    double salary = 200; // переменная не перезаписана она закрыла ее hiding

    @Override // метод проверяет что метод перезаписан
    Fruit3 eat0(){ //или Food т е extends Food
        System.out.println("Food eat teacher");
        Fruit3 f = new Fruit3(); //или Food3 f = new Food3();
        return f;
    }

    void eat(){
        System.out.println("Eat teacher");
    }
    void teach(){
        System.out.println("I teach");
    }

    static void sleep(){ // новый sleep
        System.out.println("sleep teacher");
    }
}

class A3 {
    Employee3 objectCreation() {
        System.out.println("Ok");
        return new Employee3();
    }
}

class B3 extends A3  {
    Employee3 objectCreation() { // или Teacher2 т к extends
        System.out.println("Ok");
        return new Employee3();
    }
}

final class T { }
// class R extends T {} нельзя