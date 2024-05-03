package src.Mentor.MentorTask8;

public class Icki {
    String name1;
    String name2;
    String name3;
    double price1;
    double price2;
    double price3;



    public Icki(String name1, double price1, String name2, double price2, String name3, double price3) {
        this.name1 = name1;
        this.price1 = price1;
        this.name2 = name2;
        this.price2 = price2;
        this.name3 = name3;
        this.price3 = price3;
    }

    @Override
    public String toString() {
        return  "\n" + "Ickiler: " + "\n"
                + name1 +
                ", price: " + price1 + "\n"
                + name2 + ", price: " + price2 + "\n"
                +name3 + ", price: " + price3;
    }

    public String getName1() {
        return name1;
    }

    public double getPrice1() {
        return price1;
    }
    public String getName2() {
        return name2;
    }
    public double getPrice2() {
        return price2;
    }
    public String getName3() {
        return name3;
    }
    public double getPrice3() {
        return price3;
    }

}
