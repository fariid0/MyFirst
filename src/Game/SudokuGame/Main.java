package src.Game.SudokuGame;

import java.util.Scanner;

public class Main {

    private static int boxSize = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sira = {" 1", "   2", "   3", "   4", "   5", "   6", "   7", "   8", "   9"};
        for (String sira1 : sira){
            System.out.print(sira1);
        }
        System.out.println();

        String[] A = {"[ ]", "[ ]", "[ ]", "[6]", "[9]", "[3]", "[ ]", "[5]", "[7]", "1"};
        String[] B = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "2"};
        String[] C = {"[4]", "[ ]", "[ ]", "[7]", "[5]", "[1]", "[3]", "[ ]", "[ ]", "3"};
        String[] D = {"[ ]", "[ ]", "[1]", "[2]", "[7]", "[ ]", "[ ]", "[4]", "[ ]", "4"};
        String[] E = {"[6]", "[ ]", "[9]", "[1]", "[ ]", "[ ]", "[ ]", "[7]", "[ ]", "5"};
        String[] F = {"[ ]", "[ ]", "[ ]", "[ ]", "[4]", "[5]", "[1]", "[3]", "[ ]", "6"};
        String[] G = {"[ ]", "[7]", "[ ]", "[ ]", "[2]", "[ ]", "[ ]", "[ ]", "[ ]", "7"};
        String[] H = {"[ ]", "[8]", "[5]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "8"};
        String[] X = {"[ ]", "[ ]", "[2]", "[5]", "[1]", "[ ]", "[ ]", "[ ]", "[3]", "9"};

        String [][] sudoku = {A, B, C, D, E, F, G, H, X};

        for (String[] cedvel : sudoku){
            for (String map : cedvel){
                System.out.print(map + " ");
            }
            System.out.println();
        }
        System.out.println("SUDOKU oyununuz basladi! ");


        for (int i = 0; i < 100; i++) {
            System.out.println("Reqem daxil edeceyiniz sira ve sutun daxil edin (1-9): ");
            int setr = sc.nextInt() -1;
            int sutun = sc.nextInt() -1;
            System.out.println("Ededi daxil edin: ");
            int num = sc.nextInt();

            if (isValidPlacement(sudoku, num, setr, sutun)) {
                sudoku[setr][sutun]= String.valueOf("["+ num + "]");
                for (String[] cedvel : sudoku){
                    for (String map : cedvel){
                        System.out.print(map + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Daxil etdiyiniz eded setr, sutunda ve ya qutuda var. Basqa eded daxil edin.");
            }

            if (isSudokuComplete(sudoku)){
                System.out.println("Tebrikler, oyun tamamlandi!");
                break;
            }
        }


        for (String[] cedvel : sudoku){
            for (String map : cedvel){
                System.out.print(map + " ");
            }
            System.out.println();
        }

    }

    private static boolean numberInSetr(String[][] sudoku, int number, int setr){
        for (int i = 0; i < boxSize; i++) {
            if (sudoku[setr][i].equals("[" + number + "]")){
                return true;
            }
        }
        return false;
    }
    private static boolean numberInSutun(String[][] sudoku, int number, int sutun){
        for (int i = 0; i < boxSize; i++) {
            if (sudoku[i][sutun].equals("[" + number + "]")){
                return true;
            }
        }
        return false;
    }

    private static boolean numberInBox(String[][] sudoku, int number, int setr, int sutun){
        int localBoxSetr = setr - setr % 3;
        int localBoxSutun = sutun - sutun % 3;

        for (int i = localBoxSetr; i < localBoxSetr + 3; i++) {
            for (int j = localBoxSutun; j < localBoxSutun + 3; j++) {
                if (sudoku[i][j].equals("[" + number + "]")) {
                    return true;
                }
            }
        }
        return false;
    }



    private static boolean isValidPlacement(String[][] sudoku, int number, int setr, int sutun){
        return !numberInSetr(sudoku, number, setr) &&
                !numberInSutun(sudoku, number, sutun) &&
                !numberInBox(sudoku, number, setr, sutun);
    }

    private static boolean isSudokuComplete(String[][] sudoku){
        for (int i = 0; i < boxSize; i++) {
            for (int j = 0; j < boxSize; j++) {
                if (sudoku[i][j].equals("[ ]")){
                    return false;
                }
            }
        }
        return true;
    }
}
