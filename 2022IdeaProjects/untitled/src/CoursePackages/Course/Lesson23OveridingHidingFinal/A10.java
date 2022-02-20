package CoursePackages.Course.Lesson23OveridingHidingFinal;

public class A10 {
    //super нельзя употреблять со static
    String s1 = "Hello";
    static double PI = 3.14;

    int summa(int...i){
        int result = 0;
        for (int a :i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }

}

class B10 extends A10 {
    String s2 = super.s1 + " friend"; // можно без super
    // обычно super когда hide
    //например
    String s1 = super.s1 + " friend2";// super() со скобками используются
    // когда обращаются к конструктору
    String s3 = this.s3 + " friend2";


    public static void main(String[] args) {
        B10 b10 = new B10();
        System.out.println(b10.s2);
    }
}
