package src.Mentor.MentorTask18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();


        for (int i = 0; i <= 100; i++) {
            int random = (int) (Math.random() * 6 + 5);
            nums.add(random);
        }
        //System.out.println(nums);

        HashSet<Integer> hash = new HashSet<>(nums);

        for (Integer ad : hash){
            System.out.print(ad + ", ");
        }


    }
}
