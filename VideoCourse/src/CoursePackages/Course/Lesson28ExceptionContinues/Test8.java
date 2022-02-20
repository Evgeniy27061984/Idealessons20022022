package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.*;

public class Test8 {
    static int abc() {

        try {
            File f = new File("test19");
            FileInputStream fil = new FileInputStream(f);
            //System.exit(0); //не сработает finally
            return 5;
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception1");
            //System.exit(0);//не сработает finally
            return 6;
        }
        finally {
            System.out.println("finally");//первый срабатывает, потом return
        }
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
