package CoursePackages.Course.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4d {
    void abc() throws FileNotFoundException {
        File f = new File("test10");//абстракция файла
        FileInputStream fil = new FileInputStream(f);

    }


    void def() throws Exception{ //наоборот нельзя

            abc();

    }

    public static void main(String[] args) throws FileNotFoundException {
        Test4d t = new Test4d();
        try {
            t.abc();
        }catch (FileNotFoundException e) {
           // e.printStackTrace();
//
//            java.io.FileNotFoundException: test10 (Нет такого файла или каталога)
//            at java.base/java.io.FileInputStream.open0(Native Method)
//            at java.base/java.io.FileInputStream.open(FileInputStream.java:211)
//            at java.base/java.io.FileInputStream.<init>(FileInputStream.java:153)
//            at CoursePackages.Course.Lesson27Exception.Test4c.abc(Test4c.java:10)
//            at CoursePackages.Course.Lesson27Exception.Test4d.main(Test4d.java:24)
            //System.out.println(e);
            //java.io.FileNotFoundException: test10 (Нет такого файла или каталога)
            System.out.println(e.getMessage());
            // test10 (Нет такого файла или каталога)
        }
    }

}
//Exception = IOException FileNotFoundException = checked обязательно
//LIFO = last in first out = последний метод который закончился должен первым закрыт