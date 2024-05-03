package src.Mentor.MentorTask13;

public class Meat implements Product{
    String name;
    String unitprice;
    String amount;

    public Meat(String name, String unitprice, String amount) {
        this.name = name;
        this.unitprice = unitprice;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Meat: " + "\n" +
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
        return getUnitPrice() * getAmount();
    }

}
