package CoursePackages.Course.Lesson28Localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6c {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2014, Month.MARCH, 10, 15, 20,30,5555);
        LocalTime lt = LocalTime.of(3,40);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");//сентября 01, 2016, 04:40
        System.out.println(ldt.format(f));
       // System.out.println(lt.format(f)); //java.time.temporal.UnsupportedTemporalTypeException

        //   "Y"-2014 "YY"-14 "YYYY"-2014 год
        //  "M"-3 MM"-03 "MMM"-мар "MMMM"-марта месяц
        // "w"-11 "ww"-11  неделя года
        // "d"-10 "dd"-10  день
        // "h"-3 "hh-03  часы
        // "m"-20 "mm"-20 минуты
        // "s"-3 "ss"-30  секунды
        // "n"-5555 "nnnnn"-05555 наносекунды

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate ld = LocalDate.parse("01 02 2003", f2);
        System.out.println(ld); // 2003-01-02
        LocalDate ld2 = LocalDate.parse("2003-01-02");
        System.out.println(ld2); // 2003-01-02
    }
}
