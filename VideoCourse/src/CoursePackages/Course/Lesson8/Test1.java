package CoursePackages.Course.Lesson8;

public class Test1 {
   // public final int a = 10;
    public final int a; // значение сразу присвоить если нет конструктора
    //public static final int b; нельзя
    public static final int b = 12;
    Test1 (){
        a = 11;
        //b = 12; нельзя
    }

    Test1 (boolean b){ //с помощью конструкторов можно задавать final
        a=12;
    }

    public void abc(final short s){
        final byte b;
        b = 10; // здесь можно присвоить потом
        System.out.println(b + a);
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        //t.a = 7; нельзя менять final
        System.out.println(t.a);
    }


}
