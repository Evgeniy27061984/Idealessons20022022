package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test8 implements inter1, inter2 {

    @Override
    public void abc() {
        System.out.println("Ok");
    }
    public static void main(String[] args) {
        Test8 t = new Test8();
        ((inter1)t).abc(); //Ok
            t.abc();//Ok
        //System.out.println(t.a); нельзя
        System.out.println(((inter1)t).a); //Ok
    }

}

interface inter1 {
    int a = 5;
    void abc();
}
interface inter2 {
    int a = 5;
    void abc();
}
