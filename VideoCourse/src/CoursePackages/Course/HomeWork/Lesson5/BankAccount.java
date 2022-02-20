package CoursePackages.Lesson1.HomeWork.Lesson5;

public class BankAccount {
    int id;
    double balance;

    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    void plusBalance (double plus) {
        balance += plus;
    }
    void minusBalance (double minus) {
        balance -= minus;
    }

    void info () {
        System.out.println(id + " " + balance );

    }

}

class testBankAccount  {
    public static void main(String[] args) {
        BankAccount n = new BankAccount(1, 100);
        n.plusBalance(2.2);
        n.info();
        n.minusBalance(10.2);
        n.info();
    }
}
