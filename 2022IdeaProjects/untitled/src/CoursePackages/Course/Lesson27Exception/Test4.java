package CoursePackages.Course.Lesson27Exception;

public class Test4 {
    public static void main(String[] args) {
        int [] array = {4,8,1};
        System.out.println("у нас есть массив");
        try {
            System.out.println(array[5]);
            System.out.println("Пока");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймана исключение " + e);
        }
        finally {
            System.out.println("finally"); // всегда выводится
        }
            System.out.println("За блоком" ); // выводится если поймали exception
    }
}
    //у нас есть массив
    //Поймана исключение
    // За блоком
    //ArrayIndexOutOfBoundsException e обычно не ловится кривой код
    //FileNotFoundException необходимо ловить