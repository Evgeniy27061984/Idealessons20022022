package CoursePackages.Course.Lesson22Repeat;

public class Test4 {

}

class Human2 {
    public String name = "Jon";
    public String surname = "surJon";

    public Human2 (String name)  {
        this(name,null);
        System.out.println(name);
    }
    public Human2 (String name,String surname)  {
        this.name = name;
        this.surname = surname;
    }

}

class Student2 extends Human2{
    Student2() {
        // вызывается даже если нет super, только default конструктор
        //необходимо чтобы был default конструктор у родителя
        // this и super не может вместе быть в конструкторе
        super("Jony");
        System.out.println("Jony2");
    }

    Student2(int i) {
        this();
        System.out.println("Jon3");
    }
//    public static void main(String[] args) {
//        //Student2 st1 = new Student2(); //вызывается конструктор Student2,
//        // а в кострукторе Student2 вызывается конструктор Human2 и
//        // так до вверха до самого Object
//        // только на первой строке
//        Student2 st2 = new Student2(5);
//    }
}

class Student3 extends Human2{
    int course;
    Student3(String name,String surname,int course) {
        super(name,surname);
        this.course = course;
        System.out.println("Jony210");
    }


    public static void main(String[] args) {

        Student3 st3 = new Student3("Привет","Пока", 5);
    }
}

