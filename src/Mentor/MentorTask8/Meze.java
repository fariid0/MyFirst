package src.Mentor.MentorTask8;

public class Meze {
    String name1;
    String name2;
    String name3;
    double price1;
    double price2;
    double price3;

    public String getName1(){
      return this.name1;
    }
    public double getPrice1(){
        return this.price1;
    }
    public String getName2(){
        return this.name2;
    }
    public double getPrice2(){
        return this.price2;
    }
    public String getName3(){
        return this.name3;
    }
    public double getPrice3(){
        return this.price3;
    }


    public Meze(String name1, double price1, String name2, double price2, String name3, double price3) {
        this.name1 = name1;
        this.price1 = price1;
        this.name2 = name2;
        this.price2 = price2;
        this.name3 = name3;
        this.price3 = price3;
    }

    @Override
    public String toString() {
        return "\n" +"Mezeler: " + "\n"
                + name1 +
                ", price: " + price1 + "\n"
                + name2 + ", price: " + price2 + "\n"
                +name3 + ", price: " + price3;
    }
}
