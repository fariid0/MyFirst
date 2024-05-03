package src.Dersde.MentorInterface;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.getName();
        bird.makeVoid();
        bird.land();
        bird.takeOff();

        System.out.println(bird);
    }
}
