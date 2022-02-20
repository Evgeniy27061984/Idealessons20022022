package CoursePackages.Course.Lesson26equalstoString;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

    Car c1 = new Car("red", "V8");
    Car c2 = new Car("red", "V8");
    Car c3 = new Car("Black", "V8");
    Object c4 = new Car("red", "V8");
    Car c5 = new Car("Black", "V8");
    Car c6 = null;
        ArrayList <Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(c1.equals(c2)); //false а если equals то true
        System.out.println(list.contains(c5));//true
        System.out.println(c1.equals(null));//false
       // System.out.println(c6.equals(null)); //NullPointerException
        System.out.println(c3);
        //CoursePackages.Course.Lesson26equalstoString.Car@a09ee92
        //a09ee92 шестнадцатиричное
        // if overriding - Car color Black
        System.out.println(list); // метод переопределен




    }
}
class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return (color.equals(car.color) && engine.equals(car.engine));
        } else {
            return false;
        }

    }

// public boolean equals(Car c) { also correct but not overriding equals
// created overload
// return (color.equals(c.color) && engine.equals(c.engine));
//        }
//    }


// public boolean equals (Object obj) { так выглядит equals в классе Object
// return (this == obj); если текущая переменая объекта ссылается на объект Object obj
// }

    public String toString() {
        return "Car color " + color;
    }

}

