package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8b {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Hello");
        try {
            File f = new File("test9");
            FileInputStream fil = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception1");
            System.out.println("a = " + a);
            return a;

        }
        finally {
            a.append("!");
            System.out.println("finally");
            System.out.println("a = " + a);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}

