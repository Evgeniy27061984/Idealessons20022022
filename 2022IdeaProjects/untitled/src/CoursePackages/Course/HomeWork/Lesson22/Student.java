package CoursePackages.Course.HomeWork.Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName () {
        StringBuilder nameClone = new StringBuilder(name);
        return nameClone;
    }
    public  void setName (StringBuilder name) {
        if (name.length() > 2) {
            this.name = name;
        }

    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        if(course > 0 && course < 11) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if(grade > 0 && grade < 5) {
            this.course = course;
        }
    }

    public void showInfo() {
        System.out.println("name - " + getName());
        System.out.println("course - " + getCourse());
        System.out.println("grade - " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        StringBuilder sb1 = new StringBuilder("Jon");
        st1.setName(sb1);
        st1.setCourse(2);
        st1.setGrade(10);

        st1.showInfo();
        System.out.println(st1.getName().append("!"));
        System.out.println(st1.getName());
    }
}
