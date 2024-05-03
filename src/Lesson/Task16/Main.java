package src.Lesson.Task16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ThreadMethod thread1 = new ThreadMethod();
//        thread1.start();

        Thread t1 = new Thread(()->{
            synchronized (ThreadMethod.lock) {
                for (int i = 1; i < 1000; i += 2) {
                    System.out.println("Tek eded: " + i);
                    ThreadMethod.lock.notifyAll();
                    try {
                        ThreadMethod.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (ThreadMethod.lock) {
                for (int i = 2; i < 1000; i += 2) {
                    System.out.println("Cut eded: " + i);
                    ThreadMethod.lock.notifyAll();
                    try {
                        ThreadMethod.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        //t1.start();
        //t2.start();

        Thread t3 = new Thread(() -> {
            synchronized (ThreadMethod.lock) {
                String[] a = {"Getdim", " bir", " 2", " kor", " yırtıq", " var."};
                int index = 0;
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[index]);
                    index++;
                    ThreadMethod.lock.notifyAll();
                    try {
                        ThreadMethod.lock.wait();
                    } catch (InterruptedException e){
                        throw  new RuntimeException(e);
                    }
                }

            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (ThreadMethod.lock) {
                String[] b = {" gördüm", " dərədə", " kar", " kürkü", " kirpi"};
                int index = 0;
                for (int i = 0; i < b.length; i++) {
                    System.out.print(b[index]);
                    index++;
                    ThreadMethod.lock.notifyAll();
                    try {
                        ThreadMethod.lock.wait();
                    } catch (InterruptedException e){
                        throw  new RuntimeException(e);
                    }
                }

            }
        });

        t3.start();
        t4.start();

    }
}
