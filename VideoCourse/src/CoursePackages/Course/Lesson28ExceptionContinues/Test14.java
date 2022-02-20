package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9");//сработает
            System.out.println("yes");//сработает
                try {
                    fis2.close();////сработает NullPointException
                }
                catch (IOException e) {//не сработает
                    System.out.println("problem Stream fis2");
                }

        }catch (FileNotFoundException e) {
            System.out.println("no");
        }
        catch (NullPointerException e) {//сработает
        System.out.println("NullPointerException");
        }
    }
}
