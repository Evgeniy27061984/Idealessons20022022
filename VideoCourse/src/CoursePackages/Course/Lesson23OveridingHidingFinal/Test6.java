package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class Test6 {

}

class Animal1 {
    String showName() {
        return "some Animal";
    }

   void showInfo() {
       System.out.println("Name of animal "+ showName());
    }
}

class Mouse1 extends Animal1{
    String showName() {
        return "Mouse";
    }

    public static void main(String[] args) {
        Animal1 s = new Mouse1();
        //run time binding defines (определяет)
        s.showInfo(); // Name of animal Mouse

        }
}