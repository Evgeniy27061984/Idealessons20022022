package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class Test4 {
    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an = new Mouse();// тип Animal
        Mouse m = new Mouse();
        t.abc(an);
        t.abc(m);
        an.getName(); //Mouse
        m.getName(); //Mouse

    }
}

//////
class Animal {
    void getName(){
        System.out.println("Animal");
    }
}

/////
class Mouse extends Animal {
    void getName(){
        System.out.println("Mouse");
    }
}
