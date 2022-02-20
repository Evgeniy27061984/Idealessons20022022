package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test5 {

}
//переменные не overriding (не оверайдуются)
class Test10 {
    int a = 10;
    void abc() {
    System.out.println("Ok1");
    }
}
class Test20 extends Test10 {
    int a = 20;
    void abc() {
        System.out.println("Ok2");
    }
}

class Test30 extends Test20 {
    int a = 30;
    void abc() {
        super.abc();//Test20
        //super.super.abc(); нельзя так вызвать Test30
        System.out.println("Ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a);
        ((Test10)t).abc();//все равно Ок3, потому что тип Test30
        ((Test20)t).abc();//все равно Ок3, потому что тип Test30


    }

}