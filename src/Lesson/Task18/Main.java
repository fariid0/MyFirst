package src.Lesson.Task18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Month[] summer = {Month.JUNE, Month.JULY, Month.AUGUST};
        for (Month yay :summer){
            System.out.println(yay);
        }

        System.out.println("Eded daxil edin: ");
        int num = sc.nextInt();
        Integer number = num*2;
        System.out.println(number);

        Integer a = 5;
        int b = a;
        int c = 6;
        Integer d = c;

        System.out.println("Yasinizi daxil edin: ");
        String ageStr = sc.next();

        int age = Integer.parseInt(ageStr);
        if (age <= 0) {
            System.out.println("Yasinizi duzgun daxil etmediniz.");
        } else if (age > 18){
            System.out.println("18 yasindan boyukdur.");
        } else {
            int qaliq = 18 - age;
            System.out.println("18 yasina " + qaliq + " il var.");
        }

        String text = "Salam, necesen Selimxan?";

        Pattern pattern = Pattern.compile("\\bS\\w*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println("Found: " + matcher.group());
        }

    }
}
