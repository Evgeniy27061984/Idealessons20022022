package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.IOException;
import java.net.PortUnreachableException;

public class Test21 {
    void abc() throws Exception{
        System.out.println("f");//можно
    }
    static void abc2() {
        System.out.println("f");
    }
    static int abc3() throws Exception{
        throw new Exception();

       // return; нельзя после выброса исключений return(Unreachable statements)
        //после выброса не будет дальше код идти
    }

    public static void main(String[] args) {

//        try {
//            abc2();
//        } catch (IOException e) { нельзя unchecked Exception, checked можно
//            e.printStackTrace();
//        }

    }
}
