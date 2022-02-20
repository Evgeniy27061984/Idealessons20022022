package CoursePackages.Course.Lesson22Repeat;

public class Human {
    public String name = "Jon";
    protected static int salary = 100; // как default только еще виден у наследников

    private void work() {
        System.out.println("To work");
    }
    static void rest() { // default виден в том же пакете в классах других пакете
        System.out.println("To rest");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
       // s.work(); private
        rest(); // виден потому что  втом же пакете
    }
}
