package CoursePackages.Course.Lesson18ArrayException;

public class Test1 {
    public static void main(String[] args) {
        int [] array;
        String [] array2;
        double [][] array3;

        array = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];

        array2[0] ="Привет"; // статическое присваивание
        array2[1] ="Пока";
        array2[2] ="Ок";

        array3[0][0] = 3.14;

    }
}
