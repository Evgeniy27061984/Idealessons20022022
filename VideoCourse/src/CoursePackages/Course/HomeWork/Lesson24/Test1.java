package CoursePackages.Course.HomeWork.Lesson24;

public class Test1 {
    public static void main(String[] args) {
        GoldFish g = new GoldFish("Beautiful gold fish");
        System.out.println(g.name);
        g.eat();
        g.swim();
        g.sleep();

        System.out.println("************");

        Speakable s = new Penguin("Name is Penguin");
        s.speak();

        System.out.println("************");

        Animal a = new Lion("Name is Lion");
        System.out.println(a.name);
        a.eat();
        a.sleep();

        System.out.println("************");

        Mammal m = new Lion("Name is Lion");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.run();
        m.speak();

    }
}
