package CoursePackages.Course.HomeWork.Lesson22;

public class Animal {
    int eyes;

    public Animal() {
        System.out.println("I am animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    String name;
    int tail = 1; //хвост
    int paw = 4; // лап

    public Pet() {

        System.out.println("I am pet");
        eyes = 2;
    }

    public void run() {
        System.out.println("Pets run");
    }

    public void jump() {
        System.out.println("Pets jumps");
    }
}

class Dog extends Pet {

    public Dog(String name) {
        //this.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    public void play() {
        System.out.println("Dogs plays");
    }
}

class Cat extends Pet {

    public Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog d = new Dog ("Tuzik");
        System.out.println(d.paw);
        Cat c = new Cat ("Gray");
        c.sleep();
    }
}