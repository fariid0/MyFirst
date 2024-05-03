package src.Lesson.Task10;

public class BankMethod {
    static int totalAccounts;
    String name;
    String bank;
    double money;
    String currency;

    public BankMethod(String name, String bank, double money, String currency) {
        this.name = name;
        this.bank = bank;
        this.money = money;
        this.currency = currency;
        totalAccounts++;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                ", Bank: " + bank +
                ", Money: " + money +
                        " " + currency;
    }
}
