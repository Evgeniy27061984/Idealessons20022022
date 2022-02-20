package CoursePackages.Course.Lesson27Exception;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);//3
        System.out.println(an.b);//10
        an.abc();
        an.def();
    }
}
class Animal {
    int a = 3;
    static int b = 10;
    void abc() {System.out.println("Non - static is Animal");}
    static void def() {System.out.println("Static is Animal");}
}

class Tiger extends Animal{
    int a = 15; // hidden
    static int b = 11; //hidden
    void abc() {System.out.println("Non - static is Tiger");} //overriding
    static void def() {System.out.println("Static is Tiger");}//hidden
}