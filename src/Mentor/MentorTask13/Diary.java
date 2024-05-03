package src.Mentor.MentorTask13;

public class Diary implements Product{
    String name;
    String unitprice;
    String amount;

    public Diary(String name, String unitprice, String amount) {
        this.name = name;
        this.unitprice = unitprice;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Diary: " + "\n" +
                "Name: " + name +
                ", Unitprice: " + unitprice +
                ", Amount: " + amount;
    }
    @Override
    public double getUnitPrice() {
        return 0;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public double getCost() {
        return 0;
    }


}
