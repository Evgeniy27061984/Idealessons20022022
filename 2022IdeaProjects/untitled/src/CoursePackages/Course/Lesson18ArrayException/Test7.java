package CoursePackages.Course.Lesson18ArrayException;

public class Test7 {
    public static void maxMin(double [] array) {
        double max = array [0];
        double min = array [0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max = " + max +" min " + min);
    }
    public static void main(String[] args) {
        double arr[] = {1.0,24,3.3,-5.0};
        maxMin(arr);
    }
}
