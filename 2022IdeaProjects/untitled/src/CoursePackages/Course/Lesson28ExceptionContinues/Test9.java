package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    static void abc() throws FileNotFoundException{
        try {
            File f = new File("test9");
            FileInputStream fil = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception1");
            throw e;//вверху необходимо выбрасывать
        }
        finally {
            System.out.println("finally");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("abc processed");
        }
    }

    static void def() {//не обязательно выбрасывать exception тк RunTime Exception
        try {
            int [] array = {1,2,3};
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception1");
            throw e; // вверху не обязательно выбрасывать
        }
        finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        abc();
    }
}
