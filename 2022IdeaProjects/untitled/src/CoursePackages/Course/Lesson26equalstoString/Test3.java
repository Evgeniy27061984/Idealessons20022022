package CoursePackages.Course.Lesson26equalstoString;

public class Test3 {
    //void abc(int i) { System.out.println("int");}
    void abc(byte i) { System.out.println("byte"); }
    void abc(long i) { System.out.println("long");  }

    void def(Object o) { System.out.println("object"); }
    void def(String s) { System.out.println("string"); }

   // void ghi(int a, int b) {System.out.println("1");}
   // void ghi(long a, long b) {System.out.println("2");}
    //void ghi(Integer a, Integer b) {System.out.println("3");}
    void ghi(int ... a) {System.out.println("4");}


    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5); // int, long
        t.def("Hello"); //string, object
        t.def(new StringBuilder("Hello")); //object
        t.ghi(1,2);//1,2,3,4
    }
}
