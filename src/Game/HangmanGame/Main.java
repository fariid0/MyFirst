package src.Game.HangmanGame;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Hangman GAME.");

        String[] words = {"elephant", "horse", "octopus", "rabbit", "cheetah", "hippopotamus", "raccoon", "hfedgehog"};
        int randomIndex = (int) (Math.random() * words.length);
        String randomWord = words[randomIndex];
        char[] charWord = new char[randomWord.length()];

        for (int i = 0; i < randomWord.length(); i++) {
            charWord[i] = '_';
        }

        //boolean[] test = new boolean[randomWord.length()];

        int guessCount = 3;
        int sans = 0;

        while (guessCount > 0) {
            System.out.println(charWord);
            System.out.println("Herf daxil edin:");
            char herf = sc.next().charAt(0);

            boolean duzHerf = false;

            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == herf) {
                    charWord[i] = herf;
                    duzHerf = true;
                }
            }

            if (duzHerf) {
                System.out.println("Dogrudur");
            } else{
                System.out.println("Yalnis texmin");
                sans++;
            }

            hangmanPrint(sans);

            if (wordGussed(charWord)){
                System.out.println("Tebrikler!!" +"\n"+ randomWord);
                break;
            }

            if (sans == 6){
                hangmanPrint(sans);
                System.out.println("Tapmadiniz duzgun soz: " +"\n"+ randomWord);
            }
        }
    }

    private static void hangmanPrint(int guessCount){
                if (guessCount == 1){
                    String a = "|\n|";
            System.out.println(a);
        } else if (guessCount == 2) {
            String a = "|\n|\n|\n|";
            System.out.println(a);
        } else if (guessCount == 3) {
            String a = "|----\n|\n|\n|";
            System.out.println(a);
        } else if (guessCount == 4) {
            String a = "|----±\n|    o\n|\n|";
            System.out.println(a);
        } else if (guessCount == 5) {
            String a = "|----±\n|    o\n|   /|\\\n|   ";
            System.out.println(a);
        } else if (guessCount == 6) {
            String a = "|----±\n|    o\n|   /|\\\n|   / \\";
            String b = "GAME OVER";
            System.out.println(a +"\n" + b);
        }
    }

    private static boolean wordGussed (char[] gussedWord) {
        for (char letter : gussedWord){
            if (letter == '_'){
                return false;
            }
        }
        return true;
    }
}


//        int index = 0;
//
//        if (index == 1){
//                    String a = "|\n|";
//            System.out.println(a);
//        } else if (index == 2) {
//            String a = "|\n|\n|\n|";
//            System.out.println(a);
//        } else if (index == 3) {
//            String a = "|----\n|\n|\n|";
//            System.out.println(a);
//        } else if (index == 4) {
//            String a = "|----±\n|    o\n|\n|";
//            System.out.println(a);
//        } else if (index == 5) {
//            String a = "|----±\n|    o\n|   /|\\\n|   ";
//            System.out.println(a);
//        } else if (index == 6) {
//            String a = "|----±\n|    o\n|   /|\\\n|   / \\";
//            String b = "GAME OVER";
//            System.out.println(a +"\n" + b);
//        }





//        String[] letters = randomWord.split("");
//        for (String letter : letters) {
//            System.out.print("_");
//        }
//        boolean letterFound = false;

//        for (int j = 0; j < letters.length; j++) {
//            System.out.println("\n" + "Herf daxil edin: ");
//            String herf = sc.next();
//
//            while (!letterFound) {
//                System.out.println("\n" + "Herf daxil edin: ");
//                String herf = sc.next();
//
//                for (int i = 0; i < letters.length; i++) {
//                    if (herf.equalsIgnoreCase(letters[i])){
//                        letterFound = true;
//                        for (String letter : letters) {
//                            System.out.print("_");
//                        }
//                    }
//                }
//            }


//            for (int i = 0; i < letters.length; i++) {
//                if (herf.equals(letters[i])) {
//                    System.out.print(herf);
//                } else System.out.print("_");





