package CoursePackages.Course.HomeWork.Lesson25;

public class GoldFish extends Fish {

    public GoldFish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Goldfish eat");
    }

    @Override
    public void swim() {
        System.out.println("Goldfish swim");
    }
}
