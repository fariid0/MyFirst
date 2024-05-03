package src.Mentor.MentorTask9;

public class Main {
    public static void main(String[] args) {

        Bike bike1 = new Bike("Ferrari", "Blue");
        Bike bike2 = new Bike("Bmw", "Red");
        Bike bike3 = new Bike("Pilot", "White");
        Bike bike4 = new Bike("Bike","Red",3);

        System.out.println(bike1);

        int cem = Bike.totalSell;
        System.out.println(cem);

    }
}
