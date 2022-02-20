package CoursePackages.Course.Lesson8;

public class Student {
    String name;
    int course;
    static int count;

    public Student (String name2, int course2) {
        count++;
        name = name2;
        course = course2;
    }
    public static void showCount() {
        System.out.println("Кол-во " + count);
    }
    static void abc(){
        //course = 1; нельзя нестатические
        count++;
    }
    static void abcd(){
        Student st = new Student("Alex", 2);
        st.course = 1; // можно так как создался объект

    }
    void ab() {
        count++; // стфтические можно
    }


    public static void main(String[] args) {
        Student st = new Student("Ivan",1);
        Student st2 = new Student("Alex",1);
        Student st3 = new Student("Max",1);
        System.out.println(count);
        showCount();


    }


}

class TestStudent {
    public static void main(String[] args) {
        Student st = new Student("Ivan",1);
        Student st2 = new Student("Alex",1);
        Student st3 = new Student("Max",1);
        System.out.println(st3.count);
        Student.showCount();

    }


}
