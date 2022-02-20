package CoursePackages.Course.Lesson26equalstoString;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //Wrapper Integer, Short, и т п
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        long l = 50l;
        int a = list.get(0); //Autoboxing
        Integer b = new Integer(5);
        int c = b;
        Number t = new Integer(5);
        int d = (int)b;//unboxing

        String s1 = "50";
        String s2 = "true";
        String s3 = "dfhdfh";
        String s4 = "1.23";


        int i1 = Integer.parseInt(s1);
        System.out.println(i1);
        boolean b1 = Boolean.parseBoolean(s2);//50
        System.out.println(b1); //true
        boolean b2 = Boolean.parseBoolean(s3);
        System.out.println(b2); //false
        double d2 = Double.parseDouble(s4);
        System.out.println(d2); //1.23

        Integer i2 = Integer.valueOf(10); // new Integer(10)
        System.out.println(i2); //10
        Double d3 = Double.valueOf(10); // new Integer(10)
        System.out.println(d3); //10.0
        Byte b3 = new Byte((byte)3);
        Integer i4 = new Integer(3);
        Byte b5 = Byte.valueOf((byte)3);

        //System.out.println(b3 == i4); нельзя разные типы
        System.out.println(b3.equals(i4)); //false разные типы







    }

}
