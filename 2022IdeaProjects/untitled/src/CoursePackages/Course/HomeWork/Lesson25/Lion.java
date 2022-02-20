package CoursePackages.Course.HomeWork.Lesson25;

public class Lion extends Mammal{

    public Lion (String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps");
    }

    @Override
    public void run() {
        System.out.println("Lion runs");
    }
}
