package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8a {
    static int abc() {
        int a = 5;
        try {
            File f = new File("test19");
            FileInputStream fil = new FileInputStream(f);
            //System.exit(0); //не сработает finally
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception1");
            System.out.println("a = " + a);
            //System.exit(0);//не сработает finally
            return a; //finally не влияет на аутпут создается копия 5
            //в finally 10 а в аутпуту 5
        }
        finally {
            a = 10;
            System.out.println("finally");//первый срабатывает, потом return
            System.out.println("a = " + a);
           // return 7; //если есть в finally то в других необязательно
        }
        return a; // если в finally нет return в finally
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
}
