package thebyteguru4.utils;

public class Time {
    // время Будет держать один long наносекунд от какой то даты
    public static final long SECOND = 1000000000L; //1 секунда в наносекундах
    public static long get() {
        return System.nanoTime(); // возвращает количество наносекунд
    }
}
