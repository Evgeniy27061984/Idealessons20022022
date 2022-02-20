package CoursePackages.Course.Lesson28Localdate;

import java.time.*;


public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 14, 34);
        LocalTime lt = LocalTime.of(16,40);

        System.out.println(ld.getDayOfWeek()); //THURSDAY
        System.out.println(ldt.getDayOfWeek()); //THURSDAY
        System.out.println(ld.getDayOfMonth()); //1
        System.out.println(ldt.getDayOfMonth()); //1
        System.out.println(ldt.getDayOfYear()); //245
        System.out.println(ldt.getMonth()); //SEPTEMBER
        System.out.println(ldt.getMonthValue()); //9
        System.out.println(ldt.getYear()); //2016
        System.out.println(lt.getNano()); //0

    }
}
