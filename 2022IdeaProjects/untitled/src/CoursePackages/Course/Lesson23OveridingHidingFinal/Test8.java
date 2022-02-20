package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class Test8 {
    public static void main(String[] args) {
        A1 c1 = new C1();
        c1.abc(new B()); //C только parent methods
    }
}
class A1{
    void abc(A a){
        System.out.println("A");
    }
}
class B1 extends A1{

    void abc(B b){
        System.out.println("B"); //не перезаписан
    }
}
class C1 extends B1{
    @Override
    void abc(B b2){ // перезаписан
        System.out.println("C");
    }
}

