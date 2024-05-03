package src.Dersde.MentorInterface;

public class Plane implements Flyable, Transport{
    public Plane() {
        super();
    }

    @Override
    public void takeOff() {
        System.out.println();
    }

    @Override
    public void land() {
        System.out.println();
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public String getDestination() {
        return null;
    }
}
