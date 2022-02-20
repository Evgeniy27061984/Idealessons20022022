package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test7 {
    int a, b=3, c, d=b+5;
    int a2, b2=3, c2, d2=a2+5;
   // int a3, b3=3, d3=c3+5, c3; // нельзя с3 позже
    public static void main(String[] args) {
        Test7 t = new Test7();
        System.out.println(t.d2);//5
    }
}
