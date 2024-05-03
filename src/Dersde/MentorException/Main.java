package src.Dersde.MentorException;

import src.Lesson.Task16.ThreadMethod;

import java.util.LinkedList;

public class Main {
    private static Object lock = new Object();
    public static void main(String[] args) {
        LinkedList<Character> lowAlphabet = new LinkedList<>();
        LinkedList<Character> uppercaseAlphabet = new LinkedList<>();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (char j = 'A'; j <= 'Z'; j++) {
                    uppercaseAlphabet.add(j);
                    System.out.print(j);
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //System.out.print(uppercaseAlphabet);
                //lock.notifyAll();

            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (char i = 'a'; i <= 'z'; i++) {
                    lowAlphabet.add(i);
                    System.out.print(i + ", ");
                    lock.notifyAll();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //System.out.print(lowAlphabet);
                //lock.notifyAll();

            }
        });

        t1.start();
        t2.start();
    }
}
