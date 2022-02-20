package CoursePackages.Course.Lesson25PolymorphismInstanceof;

public class Test4 {
    public static void main(String[] args) {
        String [] array1 = {"hello", "buy"};
        Object [] array2 = array1;
        System.out.println(array2[0]);
        String [] array3 = (String[]) array2;
        //array3[0] = new StringBuilder("ок"); нельзя так как array3 String
        array2[0] = new StringBuilder("ок");//можно так как  array2 Object
        // пропустит но Exception тк array2 ссылается на array1, но он
        // является String
        System.out.println(array2[0]); // Exception




    }
}
