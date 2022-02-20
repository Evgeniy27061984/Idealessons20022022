package CoursePackages.Course.Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info () {
        System.out.println(name +" " + car.color + " " + bA.balance);
    }

}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Alex";
        h.car = new Car3 ("blue", "v6");
        h.bA = new BankAccount(1, 400.6);
        h.info();

    }
}

class Car3 {
    Car3(String c,String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;

}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}