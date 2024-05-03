package src.LeetCode.Sudoku;

//public class Main {
//    public static void main(String[] args) {String[] sira = {" 1", "   2", "   3", "   4", "   5", "   6", "   7", "   8", "   9"};
//        for (String sira1 : sira){
//            System.out.print(sira1);
//        }
//        System.out.println();
//
//        String[] A = {"[ ]", "[ ]", "[ ]", "[6]", "[9]", "[3]", "[ ]", "[5]", "[7]", "1"};
//        String[] B = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "2"};
//        String[] C = {"[4]", "[ ]", "[ ]", "[7]", "[5]", "[1]", "[3]", "[ ]", "[ ]", "3"};
//        String[] D = {"[ ]", "[ ]", "[1]", "[2]", "[7]", "[ ]", "[ ]", "[4]", "[ ]", "4"};
//        String[] E = {"[6]", "[ ]", "[9]", "[1]", "[ ]", "[ ]", "[ ]", "[7]", "[ ]", "5"};
//        String[] F = {"[ ]", "[ ]", "[ ]", "[ ]", "[4]", "[5]", "[1]", "[3]", "[ ]", "6"};
//        String[] G = {"[ ]", "[7]", "[ ]", "[ ]", "[2]", "[ ]", "[ ]", "[ ]", "[ ]", "7"};
//        String[] H = {"[ ]", "[8]", "[5]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "8"};
//        String[] X = {"[ ]", "[ ]", "[2]", "[5]", "[1]", "[ ]", "[ ]", "[ ]", "[3]", "9"};
//
//        String [][] sudoku = {A, B, C, D, E, F, G, H, X};
//
//
//
//
//
//        private static boolean isValidPlacement(String[][] sudoku, int number, int setr, int sutun){
//            int boxSize = 9;
//             for (int i = 0; i < boxSize; i++) {
//                if (sudoku[setr][i].equals("[" + number + "]")){
//
//                }
//            }
//
//            for (int i = 0; i < boxSize; i++) {
//                if (sudoku[i][sutun].equals("[" + number + "]")){
//
//                }
//            }
//
//            int localBoxSetr = setr - setr % 3;
//            int localBoxSutun = sutun - sutun % 3;
//
//            for (int i = localBoxSetr; i < localBoxSetr + 3; i++) {
//                for (int j = localBoxSutun; j < localBoxSutun + 3; j++) {
//                    if (sudoku[i][j].equals("[" + number + "]")) {
//
//                    }
//                }
//            }
//
//
//
//        }
//    }
//}
