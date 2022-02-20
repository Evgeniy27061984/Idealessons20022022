package CoursePackages.Course.Lesson28Localdate;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(1984, 6,27);
        LocalDate ld2 = LocalDate.of(1984, Month.JUNE,29);
        System.out.println(ld1.isBefore(ld2));//true ld1 до ld2
        System.out.println(ld1.isAfter(ld2));//false ld1 после ld2

        LocalTime lt1 = LocalTime.of(2, 3);
        LocalTime lt2 = LocalTime.of(2, 3,18,3000);
        //System.out.println(ld1.isAfter(lt2));//нельзя

        LocalDateTime ldt1 = LocalDateTime.of(1984, 6,2,14,32);
        LocalDateTime ldt2 = LocalDateTime.of(1984, 6,2,14,32,30,2000);
    }

}
