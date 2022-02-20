package CoursePackages.Course.Lesson28ExceptionContinues;

public class Test16aError {
    //LinkageError
    // RuntimeException
    //наследникExceptionInInitializerError все что связано со статиком
//    static {
//        int a = Integer.parseInt("12e"); //java.lang.ExceptionInInitializerError
//        //Caused by: java.lang.NumberFormatException: For input string: "12e"
//    }
//    static String s = null;
//    static int i = s.length();//java.lang.ExceptionInInitializerError
    //Caused by: java.lang.NullPointerException

    static String s =  abc(); //Exception in thread "main" java.lang.ExceptionInInitializerError
    //Caused by: java.lang.ArrayIndexOutOfBoundsException:

    static String abc() {
        String [] array = {"1","2"};
        return array[100];
    }

    //StackOverflowError наследник VirtualMachineError

    //OutOfMemoryError когда памяти не хватает

    //NoClassDefFoundError не может найти класс RunTime во время запуска программы

    public static void main(String[] args) {

    }
}
