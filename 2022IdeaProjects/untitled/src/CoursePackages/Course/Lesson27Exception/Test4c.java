package CoursePackages.Course.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4c {
    void abc() throws FileNotFoundException {
        File f = new File("test10");//абстракция файла
            FileInputStream fil = new FileInputStream(f);
            //java.io.FileNotFoundException
        }


    void def() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
       Test4c t = new Test4c();
       t.abc();
    }

}
