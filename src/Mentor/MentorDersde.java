package src.Mentor;

import java.util.Scanner;

public class MentorDersde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(" 3 eded daxil edin: ");
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//
//        if ((a == b) && b == c) {
//            System.out.println("Daxil etdiyiniz ededlerin hamisi eynidir");
//        } else if (a == b) {
//            System.out.println("Daxil etdiyiniz ededlerin ikisi eynidir");
//        } else if (a == c) {
//            System.out.println("Daxil etdiyiniz ededlerin ikisi eynidir");
//        } else if (b == c) {
//            System.out.println("Daxil etdiyiniz ededlerin ikisi eynidir");
//        } else {
//            System.out.println("Ededleriniz ferqlidir");
//        }

        System.out.println("Gun daxil edin: ");
        int hefte = sc.nextInt();

        switch (hefte){
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
             System.out.println("Cersenbe axsami");
             break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                break;
            case 7:
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Bele bir gun yoxdur!");
        }
    }
}
