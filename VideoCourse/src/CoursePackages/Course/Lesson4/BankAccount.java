package CoursePackages.Course.Lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();


        MyAccount.id = 1;
        MyAccount.name = "Evgen";
        MyAccount.balance = 1000000;

        System.out.println(MyAccount.id);
        System.out.println(YourAccount.id);
    }
}
