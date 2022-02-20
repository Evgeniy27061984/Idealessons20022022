package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class Test7 {

}
// polymorphism ability to take different forms (способность принимать разные формы)
class Animal2 {
    static String showName() {
        return "some Animal";
    }

    void showInfo() {
        System.out.println("Name of animal "+ showName());
    }
}

class Mouse2 extends Animal2{
    static String showName() {
        return "Mouse";
    }

    public static void main(String[] args) {
        Animal2 s = new Mouse2();
        //compile time binding defines (определяет)
        s.showInfo(); // Name of animal some Animal

    }
}