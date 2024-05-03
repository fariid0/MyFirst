package src.Mentor.MentorTask15;

public class Main {
    public static void main(String[] args) {


        Thread t1 = new Thread(()-> {
            synchronized (NumThread.lock){

                NumThread.oddNum();
            } try {
                NumThread.lock.wait();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(()-> {
            synchronized (NumThread.lock) {
                NumThread.evenNum();
            } try {
                NumThread.lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

//        t1.start();
//        t2.start();

        Thread t3 = new Thread(()-> {
            synchronized (NumThread.lock) {
                for (int i = 1; i < 100; i += 2) {
                    System.out.println("Tek eded: " + i);
                    NumThread.lock.notifyAll();
                    try {
                        NumThread.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
        Thread t4 = new Thread(()-> {
            synchronized (NumThread.lock) {
                for (int i = 2; i < 100; i += 2) {
                    System.out.println("Cut eded: " + i);
                    NumThread.lock.notifyAll();
                    try {
                        NumThread.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });

        //t3.start();
        //t4.start();

        Thread t5 = new Thread(()-> {
            for (int i = 1; i < 100; i+=2) {
                System.out.println("Tek eded: " + i);
            }
        });

        Thread t6 = new Thread(()-> {
            for (int i = 2; i < 100; i+=2) {
                System.out.println("Cut eded: " + i);
            }
        });

        t5.start();
        t6.start();

    }
}
