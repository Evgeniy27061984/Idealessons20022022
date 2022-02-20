package CoursePackages.Course.Lesson28ExceptionContinues;

public class Test12 {
    void abc() {
        int [] array = {1,2,3};
        try {
            System.out.println(array[7]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println(s.length()); // неловится тк не в try
            //работаем с exception который выбросился в последний раз
        }
        catch (NullPointerException e) {
            System.out.println("catch NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
    }
}
