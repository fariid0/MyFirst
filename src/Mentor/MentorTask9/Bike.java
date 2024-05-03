package src.Mentor.MentorTask9;

public class Bike {
    String name;
    String color;
    int numberOfWheels;
    static int totalSell;

    public Bike(String name, String color) {
        this.name = name;
        this.color = color;
        this.numberOfWheels = 2;
        totalSell ++;
    }
    public Bike(String name, String color, int numberOfWheels) {
        this.name = name;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        totalSell ++;
    }


    @Override
    public String toString() {
        return
                "Name: " + name +
                ", Color: " + color +
                ", NumberOfWheels: " + numberOfWheels;
    }
}
