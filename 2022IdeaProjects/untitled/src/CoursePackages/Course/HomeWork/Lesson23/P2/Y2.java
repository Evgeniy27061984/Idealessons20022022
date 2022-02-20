package CoursePackages.Course.HomeWork.Lesson23.P2;

import CoursePackages.Course.HomeWork.Lesson23.X2;

class Y2 extends X2 {
private String s = "fh";
    @Override
    public void abc() {
        System.out.println("Y");
    }

    public void def() {
        Y2 y = new Y2();
        y.abc();
    }

    public void ghi() {
        X2 x = new Y2(); //only methods and variables of object X2
        //x.abc(); не работает так в пакете P2 protected
        //protected is default only allows inherited

    }

    public static void main(String[] args) {
        Y2 a = new Y2();
        a.abc();
        a.def();
        a.ghi();
        System.out.println(a.s);
    }
}

