package CoursePackages.Course.Lesson24AbstractInterface;

public class Test8 {

}

interface I1 {
    void abc();
    default void def(){
        System.out.println("def");// if default that need body
        // if need no for all classes

    }
    public default void defi(){ //default no access modifier
        System.out.println("def");// if default that need body
        // if need no for all classes

    }
    static void abcd() {
        System.out.println("static");
    }
}




class Z extends W implements I1 {

    @Override
    public void abc() {

    }



//    Z methods() {
//        return new Z();
//    }


//    W methods() {
//        return new Z();
//    }

    I1 methods() {
        return new Z();
    }

    static I2 methods(I2 i) {
        return new D();
    }


    public static void main(String[] args) {

        Z z = new Z();
        z.def();
        I1.abcd(); // не наследуются поэтому только черезе интерфейс вызвать
        // вызвать можно даже если не имплементируется
        I2 i = new D ();
        methods(i);
    }


}
interface I2{

}
class D implements I2 {

}
abstract class W {

}