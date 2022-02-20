package CoursePackages.Course.HomeWork.Lesson24;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Penguin eat");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin sleep");
    }

    @Override
    public void speak() {
        System.out.println("Penguin speak");
    }

    @Override
    public void fly() {
        System.out.println("Penguin fly");
    }
}
