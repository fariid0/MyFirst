package src.Lesson.Task12.Zoo;

import src.Lesson.Task12.Zoo.Animals;

public class Aquatic extends Animals {
    double swimmingDepth;

    public boolean swim(){
        return true;
    }

    public Aquatic(String name, int age, String song, double swimmingDepth) {
        super(name, age, song);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Aquatic " +
                ", Name: " + name +
                ", Age: " + age +
                ", Song: " + song +
                ", SwimmingDepth: " + swimmingDepth +
                " Can swim? " + swim();
    }
}
