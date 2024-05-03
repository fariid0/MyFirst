package src.Mentor;
import java.util.Scanner;

public class MentorTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("*");
//        }

//        for (int i = 1; i < 7; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

        String[] array1 = {"[ ]", "[ ]", "[ ]"};
        String[] array2 = {"[ ]", "[ ]", "[ ]"};
        String[] array3 = {"[ ]", "[ ]", "[ ]"};

        String[][] esas = {array1, array2, array3};

        for (String[] xana : esas) {
            for (String xanalar : xana){
                System.out.print(xanalar + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < 8; i++) {
            System.out.println("Daxil edeceyiniz setr'i secin: " );
            int setr = sc.nextInt();

            System.out.println("Daxil edeceyiniz sutun'u secin: ");
            int sutun = sc.nextInt();

            if (setr >= 0 && setr < esas.length && sutun >= 0 && sutun < esas.length){
                System.out.println("Simvol daxil edin: ");
                String simvol = sc.next();
                esas[setr][sutun] = simvol;
            } else System.out.println("Xais olunur 0-2 arasinda setr ve sutun daxil edin! ");


            for (String[] xana : esas) {
                for (String xanalar : xana){
                    System.out.print(xanalar + " ");
                }
                System.out.println();
            }
        }



    }
}
