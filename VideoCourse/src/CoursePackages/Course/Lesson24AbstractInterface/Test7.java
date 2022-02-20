package CoursePackages.Course.Lesson24AbstractInterface;

public class Test7 {
    Jump j1 = new Human();
    Jump j2 = new Animal();

}

class Human implements Jump {
// if extends Object then all classes can jump
    @Override
    public void jump() {
        System.out.println("Human");
    }
}

class Animal implements Jump{

    @Override
    public void jump() {
        System.out.println("Animal");
    }
}

interface Jump {
void jump();
}
interface Jump2 {
    void jump2();
}

interface X extends Jump,Jump2   {

}

abstract class F implements X,Jump {

}

