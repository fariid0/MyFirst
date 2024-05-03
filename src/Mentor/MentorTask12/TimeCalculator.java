package src.Mentor.MentorTask12;

public class TimeCalculator {
    public void calculateDifference(int hour1, int minute1, int hour2, int minute2){
        if (hour1 >= 0 && hour1 < 24 && hour2 >= 0 && hour2 < 24  && minute1 >= 0 && minute1 < 60 && minute2 >= 0 && minute2 < 60){
            System.out.println(hour1 + ":" + minute1);
            System.out.println(hour2 + ":" + minute2);

            int totalMinutes1 = hour1 * 60 + minute1;
            int totalMinutes2 = hour2 * 60 + minute2;

            int difference = Math.abs(totalMinutes1 - totalMinutes2);

            int hoursDifference = difference / 60;
            int minuteDifference = difference % 60;

            System.out.println("Ferq: " + hoursDifference + " saat " + minuteDifference + " deqiqe");

        } else System.out.println("Saat ve deqiqeni duzgun daxil edin");
    }
}
