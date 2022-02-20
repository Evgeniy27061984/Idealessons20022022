package CoursePackages.Course.Lesson27Exception;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test19");
            System.out.println("object created");
            FileInputStream fil = new FileInputStream(f);
            System.out.println("Stream created");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fil.read() + " ");
                System.out.println("information read");
                if (counter == 6) {
                    fil.close();
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception1");//если нет файла
           // e.printStackTrace();//выводит стэк трейс
        }
        catch(IOException e) {
            System.out.println("Exception2");//если поток закрыт и пытается прочитать файл
            //e.printStackTrace();//выводит стэк трейс
        }
        finally {
            System.out.println("finally");//используют для подчищения с помощью метода close()
        }
        System.out.println(result);//97 -1 -1
    }

}
