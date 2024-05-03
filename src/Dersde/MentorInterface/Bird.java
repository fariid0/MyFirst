package src.Dersde.MentorInterface;

public class Bird implements Animal, Flyable  {
    public Bird() {
        System.out.println("Bulbul");;
    }

    @Override
    public void getName() {
        System.out.println("Inal");
    }

    @Override
    public void makeVoid() {
        System.out.println("Mellim asan dersdi??");
    }

    @Override
    public void takeOff() {
        System.out.println("");
    }

    @Override
    public void land() {
        System.out.println("Razin");
    }
}
