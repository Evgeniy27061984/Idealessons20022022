package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test3 {
    public static void main(String[] args) {
        Employee1 em1 = new Doctor1(); // auto casting upcasting
        //Driver1 -> Employee1 = upcasting auto casting
        //Employee1 -> Driver1  = down casting
        Employee1 em2 = new Teacher1();
        Employee1 em3 = new Driver1();
        Employee1 em4 = new Employee1();
        //Doctor1 d1 = em1; нельзя не любой доктор Employee1
        // это супер класс
        Doctor1 d1 = (Doctor1) em1;// поверь em1 ссылается на Doctor (Кастить)
        System.out.println(d1.specialization);
        System.out.println(((Doctor1) em1).specialization);
        d1.treat();
        ((Doctor1) em1).treat();
        //((Doctor1) em2).treat();
        // Exception in thread "main" java.lang.ClassCastException
        Help_able1 h = new Doctor1();
        h.help();
        System.out.println(((Doctor1) h).specialization);
        Employee1 e = new Employee1();
        Test3 t = new Test3();
        System.out.println(em1==e);
        //System.out.println(t==e); нельзя так делать
        // Так как объекты разные и ссылаются на разные объекты
        System.out.println(em1.equals(e));
        // equals можно использовать с любыми объектами
        Employee1 [] array = {em1, em2, em3, em4};


        for (Employee1 e2: array) {
            if (e2 instanceof Driver1) {
                System.out.println(((Driver1) e2).nameCar);
                ((Driver1) e2).drive();
            }
        }
    }

}

class Employee1 { //можно extends Object
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



class Doctor1 extends Employee1 implements Help_able1 {
    String specialization = "Хирург";
    void treat(){
        System.out.println("I treat");

    }

    @Override
    public void help() {
        System.out.println("Доктор оказывает помощь");
    }
}

class Teacher1 extends Employee1 {
    int countStudents;
    void teach(){
        System.out.println("I teach");
    }
}

class Driver1 extends Employee1 {
    String nameCar = "Mercedes";
    void drive(){
        System.out.println("I drive");
    }
}

interface Help_able1 {
    void help();
}