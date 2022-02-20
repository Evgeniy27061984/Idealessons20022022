package CoursePackages.Course.Lesson27Exception;

import java.io.*;


public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test10");
            FileInputStream fil = new FileInputStream(f);
        }
        catch(FileNotFoundException e) { //RuntimeException e

        }
        catch(NullPointerException e) {

        }
        catch(IOException e) {

        }
        catch(RuntimeException e) {//Exception

        }
        catch(Exception e) {//Throwable

        }
        catch(Throwable e) {

        }

    }
}
