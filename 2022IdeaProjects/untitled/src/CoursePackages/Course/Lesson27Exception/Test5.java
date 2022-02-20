package CoursePackages.Course.Lesson27Exception;

public class Test5 {
    static void abc() {
        System.out.println("work method abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc(); // рекурсия
        }catch (StackOverflowError e) {
            System.out.println("Error");
            //не надо обрабатывать - это ведь ошибка в коде
            //лучше код исправить
            //error - unchecked не надо проверять
        }

    }
}
