package CoursePackages.Course.Lesson27Exception;
import java.io.*;
public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test9");//абстракция файла

        FileInputStream fil = new FileInputStream(f); //java.io.FileNotFoundException
        fil.read();//читать
        FileOutputStream fol = new FileOutputStream(f);
        fol.write(100); //писать порядковый номер символа
        // read() write(100) могут выбрасывать IOException при резком выключении или срыва
        // IOException super class -> FileNotFoundException

                                                //Object
                                                //Throwable

        //Exception    ->  //RuntimeException                    //Error
        //IOException -> //FileNotFoundException
        //RuntimeException(unchecked не обязательно проверять ) -> ArrayIndexOutOfBoundsException
        //RuntimeException -> NullPointException
    }
}
