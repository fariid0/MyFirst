package src.Lesson.Task22;

import java.util.function.DoubleFunction;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {

        IntPredicate positive = (int num) -> num > 0;

        IsPositive isPositive = (num) -> num > 0;


        System.out.println(positive.test(8));
        System.out.println(positive.test(-2));

        double[] numbers = {7.8, 5.5, 2.1, 9.9, 3.4};

        DoubleFunction<Integer> toInt = number -> (int) Math.round(number);

        for (double number : numbers) {
            System.out.println(toInt.apply(number));
        }



    }
}
