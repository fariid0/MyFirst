package src.Lesson;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("fd'ni daxil edin");
        double fd = sc.nextDouble();
        System.out.println("as'i daxil edin");
        double as = sc.nextDouble();
        System.out.println("operation'u daxil edin: + 1, - 2, * 3, / 4 ");
        int operation = sc.nextInt();

        double result = 0;
        if (operation==1) {
            result = topla(fd, as);
        } else if (operation==2) {
            result = cix(fd,as);
        } else if (operation==3) {
            result = vur(fd,as);
        } else if (operation==4) {
            result = bol(fd,as);
        } else System.out.println("operation is not valid");
        System.out.println("result="+result);
    }
    public static double topla(double a, double b) {
        return a+b;
    }
    public static double cix(double a, double b) {
        return a-b;
    }
    public static double vur(double a, double b) {
        return a*b;
    }
    public static double bol(double a, double b) {
        return a/b;
    }
}
