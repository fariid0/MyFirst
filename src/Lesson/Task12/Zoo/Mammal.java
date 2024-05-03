package src.Lesson.Task12.Zoo;

import src.Lesson.Task12.Zoo.Animals;

public class Mammal extends Animals {
    String furColor;

    public boolean giveBirth(){
        return true;
    }
    public Mammal(String name, int age, String song, String furColor) {
        super(name, age, song);
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Mammal " +
                ", Name: " + name +
                ", Age: " + age +
                ", Song: " + song +
                ", FurColor: " + furColor +
                " Birsey mirsey var? " + giveBirth();
    }
}
