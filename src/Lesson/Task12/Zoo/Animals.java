package src.Lesson.Task12.Zoo;

import java.util.Objects;

public class Animals {
    String name;
    int age;
    String song;

    public Animals(String name, int age, String song) {
        this.name = name;
        this.age = age;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(song, animals.song);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, song);
    }

    @Override
    public String toString() {
        return "Animals: " +
                "name: " + name +
                ", age: " + age +
                ", song: " + song;
    }
}
