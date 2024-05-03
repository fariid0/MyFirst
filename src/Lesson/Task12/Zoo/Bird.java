package src.Lesson.Task12.Zoo;

import src.Lesson.Task12.Zoo.Animals;

public class Bird extends Animals {
    double wingSpan;

    public boolean fly(){
        return true;
    }

    public Bird(String name, int age, String song, double wingSpan) {
        super(name, age, song);
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Bird " +
                ", Name: " + name +
                ", Age: " + age +
                ", Song: " + song +
                ", WingSpan: " + wingSpan +
                " Can fly? " +fly();
    }
}
