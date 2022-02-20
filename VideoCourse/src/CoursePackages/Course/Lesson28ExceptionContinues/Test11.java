package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
    FileInputStream fis1, fis2;
    public void abc() {
        try {
            fis1 = new FileInputStream("test9");
                try {
                   fis2 = new FileInputStream("test10");
                }
                catch (FileNotFoundException e) {
                    System.out.println("test10 no find");
                }
        }
        catch (FileNotFoundException e) {
            System.out.println("test9 no find");
        }
        finally {
            System.out.println("внешний finally");
            try {
                fis1.close();
                fis2.close();
               
            }
            catch (IOException e) {
                System.out.println("find Exception");
            }

        }

    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}
