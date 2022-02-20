package CoursePackages.Course;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
            a.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
class Animal2 {
    void run() throws IOException {
        System.out.println("Animal runs");
            }
}
class Mouse extends Animal2 {
    @Override
    void run() throws IOException{ // это overriding
        //Exception нельзя Можно только subclass
        //for example FileNotFoundException, и
        // RunTimeException (ArrayIndexOutOfBoundsException,NullPointerException )
        // то любые uncheck exceptions   или не бросать Exception
        System.out.println("Mouse runs");
    }
    void run(int a) throws Exception{ //так можно это overload

        System.out.println("Mouse runs");
    }
}
