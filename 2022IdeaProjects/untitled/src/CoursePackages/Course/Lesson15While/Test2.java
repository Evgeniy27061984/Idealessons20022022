package CoursePackages.Course.Lesson15While;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;

        while (money > 0) {
            System.out.println("place bets");
            System.out.println("you lose");
            money -= 10;
            System.out.println("account balance:" + money);
        }
    }
}
