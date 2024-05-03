package src.Mentor;

import java.util.Scanner;

public class ExerciseMentor1 {

    double length;
    double width;
    double area;

    public ExerciseMentor1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void sahe() {
        area = width*length;
    }


}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExerciseMentor1 salam = new ExerciseMentor1(7.8, 6.1);

        salam.sahe();
        //System.out.println(salam.sahe())

    }
}