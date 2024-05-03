package src.Mentor.MentorTask15;

public class NumThread extends Thread {
    public static Object lock = new Object();
    static void oddNum (){
        for (int i = 1; i < 100; i+=2) {
            System.out.println("Tek eded: " + i);
        }
    }

    static void evenNum (){
        for (int i = 2; i < 100; i+=2) {
            System.out.println("Cut eded: " + i);
        }
    }
}
