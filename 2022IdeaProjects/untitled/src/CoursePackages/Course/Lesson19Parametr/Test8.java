package CoursePackages.Course.Lesson19Parametr;

public class Test8 {
    public static void main(String[] args) {
        // референс данные
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Ok");
        StringBuilder sb3 = new StringBuilder("Bye");

        StringBuilder[] array = {sb1, sb2, sb3};


        for (StringBuilder sb : array) {
            sb = new StringBuilder("замена");

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // не меняет Hello Ok Bye
        }

        System.out.println();

        for (StringBuilder sb : array) {
            sb.append("Java");

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //  меняет HelloJava OkJava ByeJava
        }
        //можем менять сам объект
        // традишион мы работаем с самим обеъктом А foreach с переменной

    }
}




