package src.Mentor.MentorTask12;

public class TimeCalculatorSt {
    public void calculateString(String time1, String time2){
        String saat1 = time1.substring(0,2);
        String saat2 = time2.substring(0,2);
        int a = Integer.parseInt(saat1);
        int b = Integer.parseInt(saat2);

        if (a >= 0 && a < 24 && b >= 0 && b < 24) {


            int umumiDeqiqe1 = a * 60;
            int umumiDeqiqe2 = b * 60;

            int ferq = Math.abs(umumiDeqiqe1 - umumiDeqiqe2);

            int saatFerqi = ferq / 60;
            int deqiqeFerqi = ferq % 60;

            System.out.println("Ferq: " + saatFerqi + " Saat " + deqiqeFerqi + " deqiqe.");

        }else System.out.println("Saat ve deqiqeni duzgun daxil edin");
    }
}
