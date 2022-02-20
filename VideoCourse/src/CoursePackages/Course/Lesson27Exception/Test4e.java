package CoursePackages.Course.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4e {
    void abc() throws FileNotFoundException {
        File f = new File("test10");//абстракция файла
        FileInputStream fil = new FileInputStream(f);

    }


    void def() throws Exception { //наоборот нельзя

        abc();

    }

    public static void main(String[] args) throws FileNotFoundException {
        Test4c t = new Test4c();
        try {
            t.abc();
        } catch (FileNotFoundException e) {
            FileNotFoundException f = e;
            IOException i = e;
        }
    }
}

//throws FileNotFoundException если нет возможности обработать exception
//или нет информации