package src.LeetCode.RomanToInteger;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }


    public int romanToInt(String s) {

        char[] a = s.toCharArray();
        ArrayList<Integer> eded = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (a[i] == 'I'){
                eded.add(1);
            } if (a[i] == 'V'){
                eded.add(5);
            } if (a[i] == 'X'){
                eded.add(10);
            } if (a[i] == 'L'){
                eded.add(50);
            } if (a[i] == 'C'){
                eded.add(100);
            } if (a[i] == 'D'){
                eded.add(500);
            } if (a[i] == 'M'){
                eded.add(1000);
            }
        }


        return 0;
    }

}
