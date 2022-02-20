package CoursePackages.Course.Lesson17StringBuilder;
class Car {
}
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(50);
        //вместимость 50 символов Начальная вместимость 16
        StringBuilder sb3 = new StringBuilder(sb1);

        System.out.println(sb1.length());
        System.out.println(sb1.charAt(2));
        System.out.println(sb1.indexOf("e"));
        System.out.println(sb1.indexOf("e", 1));
        System.out.println(sb1.substring(1));
        System.out.println(sb1.substring(1,3));
        System.out.println(sb1.subSequence(0,4)); //CharSequence

        sb1.append(" my friend");
        System.out.println(sb1);
        sb1.append("dsf").append("yes");
        System.out.println(sb1);
        sb1.append(50);
        System.out.println(sb1);
        sb1.append(new Car());
        System.out.println(sb1);

        StringBuilder sb7 = new StringBuilder("Hello boy");

        sb7.insert(1, "Hi");
        System.out.println(sb7);
        sb7.delete(1, 3);
        System.out.println(sb7);
        sb7.deleteCharAt(0);
        System.out.println(sb7);
        sb7.reverse();
        System.out.println(sb7);
        sb7.replace(0,3,"Boy");
        System.out.println(sb7);
        System.out.println(sb7.capacity());
        System.out.println(sb.capacity()); //16
        StringBuilder sb10 = new StringBuilder();
        sb10.append("12345678901234567");
        System.out.println(sb10.capacity()); //34 сколько все мест в массиве




    }
}
