package CoursePackages.Course.Lesson28ExceptionContinues;

import java.util.ArrayList;

public class Test16 {
   // public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        System.out.println(list.get(2));
        //java.lang.IndexOutOfBoundsException ее наследником является ArrayIndexOutOfBoundsException

        //System.out.println(1/0);//java.lang.ArithmeticException

//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Employee [] array = {d,t};
//        Teacher t2 = (Teacher)array[0];
        //java.lang.ClassCastException
        //класс бросает exception
        //createdPWD("3");//java.lang.IllegalArgumentException

    //}

    public static void createdPWD(String pwd){
        if(pwd.length() < 6) {
            throw new IllegalArgumentException("length is small");
        }
        System.out.println("пароль принят");

    }
}

class Employee { }
class Doctor extends Employee {}
class Teacher extends Employee {}

class Airplane  {
    String state1 = "in wait";
    public void fly(){
        state1 = "fly";
        System.out.println("airplane fly");
    }
    public void inWaiting(){
       if (state1.equals("fly")) {
           throw new IllegalStateException ("airplane in fly");
       }
       state1 = "wait";
        System.out.println("wait");
    }
    public void cancelFly(){
        if (state1.equals("fly")) {
            throw new IllegalStateException ("airplane in fly");
        }
        state1 = "cancel Fly";
        System.out.println("cancel Fly");
    }

    public static void main(String[] args) {
        Doctor [] array = new Doctor[4];
        Airplane a = new Airplane();
        a.inWaiting();
        a.fly();
        //a.cancelFly();//java.lang.IllegalStateException
        //состояние Exception
        //System.out.println(array[0].toString());
        //Integer.parseInt("44p");//java.lang.NumberFormatException
        Integer.parseInt("44ab",16);//работает шестнадцатиричная система исчисления

        // NullPointerException равен null не определен
        // NumberFormatException наследник IllegalStateException

    }
}