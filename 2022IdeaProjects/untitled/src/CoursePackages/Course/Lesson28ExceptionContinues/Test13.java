package CoursePackages.Course.Lesson28ExceptionContinues;

public class Test13 {
    static String abc() {
        String s1 = "";
        String s2 = null;
        try {
            try{
                s1="1";//1
                s2.charAt(3);  //NullPointerException
                s1+="2";//не доходит
            }
            catch (NullPointerException e) {
                s1+="3";//13
                throw new RuntimeException();//не ловится
            }
            finally {
                s1+= "4";//134
                throw new Exception();//Exception
            }
        }
        catch (Exception e) {
            s1+="5";//1345
        }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(abc());//1345
    }
}
