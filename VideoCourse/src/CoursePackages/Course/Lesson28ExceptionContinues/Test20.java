package CoursePackages.Course.Lesson28ExceptionContinues;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test20 {
    public static void main (String[] args) throws FileNotFoundException {
       Animal3 a = new Mouse2();
    }


}
class Animal3 {
   Animal3() throws FileNotFoundException {

   }
}
class Mouse2 extends Animal3 {
    Mouse2() throws FileNotFoundException{ //в теле возможен выброс Exception
    super();//обрабатывать нельзя будет противоречить super на первом месте
        //в конструкторах можно более обширный Exception наоборот никак методах
    }
}

class Human {
    String name;
    int age;
    Human(String name, int age) throws Exception{
        if(age < 0) {
            throw new Exception("не корректный возраст");
        }
        this.name = name;
        this.age = age;
    }

}

