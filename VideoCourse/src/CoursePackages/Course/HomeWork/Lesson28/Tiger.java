package CoursePackages.Course.HomeWork.Lesson28;

public class Tiger {
    void eat(String s) {
        if (!s.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + s);
        }
        else {
            System.out.println("Tigr est myaso");
        }
    }
    void drink(String s) throws NeVodaException{
        if (!s.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + s);

        }
        else {
            System.out.println("Tigr pyet vodu");
        }
    }

}
