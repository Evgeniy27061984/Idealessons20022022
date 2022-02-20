package CoursePackages.Course.Lesson27Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test4a {
    //необходимо ловить если файл начинает работать с чем то внешним
    public static void main(String[] args) {
        File f = new File("test10");//абстракция файла
        try {
            FileInputStream fil = new FileInputStream(f); //java.io.FileNotFoundException
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //java.io.FileNotFoundException: test10 (Нет такого файла или каталога)
        }
        catch (NullPointerException e) {
            e.printStackTrace();

        }


    }
}