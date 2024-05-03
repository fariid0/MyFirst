package src.Mentor.MentorTask12;

public class Main {
    public static void main(String[] args) {

        TimeCalculator time = new TimeCalculator();

        time.calculateDifference(00,00,15,10);
        System.out.println(time);

        TimeCalculatorSt time2 = new TimeCalculatorSt();

        time2.calculateString("17:27","12:30");
        System.out.println(time2);

    }
}
