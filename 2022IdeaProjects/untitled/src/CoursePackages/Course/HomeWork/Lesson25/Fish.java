package CoursePackages.Course.HomeWork.Lesson25;

public abstract class Fish extends Animal{

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("sleep fish");
    }

    public abstract void swim();
}
