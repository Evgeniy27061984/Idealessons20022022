package CoursePackages.Course.HomeWork.Lesson28;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger t  = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally");
        }
    }
}
