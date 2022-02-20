package CoursePackages.Course.Lesson24AbstractInterface;

public class Test2 {
    public static void main(String[] args) {
        //Figure f1 = new Figure(); // object no creation of abstract method
        Figure f2 = new Square(4);
        System.out.println(f2.numberOfSides);
        f2.area();


    }

}
abstract class Figure { // abstract cannot final
    // here all methods overriding and hiding variable
    // класс знает что методы и переменные должны быть, но не знает что они делают
    Figure(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    int numberOfSides = 0; // переменные не могут быть абстракт
    abstract void perimeter();
    abstract void area();
    void showInfo() {
        System.out.println("It is figure");
    }


}
class Square extends Figure { //квадрат

    Square(int numberOfSides) {
        super(numberOfSides);
        this.numberOfSides = side1;
    }
    int side1 = 10;
    public void perimeter(){
        System.out.println("perimeter square " + side1*4);
    }
    public void area(){
        System.out.println("perimeter square"  + side1*side1);
    }



}

class Rectangle extends Figure { //прямоугольник
    Rectangle(int numberOfSides) {
        super(numberOfSides);
    }
    int side1 = 10;
    int side2 = 5;
    public void perimeter(){
        System.out.println("perimeter rectangle " + (side1+side2)*2);
    }
    public void area(){
        System.out.println("area rectangle " + side1*side2);
    }
}

class Circle extends Figure { // окружность
    Circle (int numberOfSides) {
        super(numberOfSides);
    }
    int radius = 4;
    public void perimeter(){
        System.out.println("perimeter circle " + 2*3.14*radius);
    }
    public void area(){
        System.out.println("area circle " +3.14*radius*radius);
    }
}

abstract class Quadrangle extends Figure {
    Quadrangle(int numberOfSides) {
        super(numberOfSides);
    }

    void def () {
        System.out.println("it is Quadrangle");
    }
}


