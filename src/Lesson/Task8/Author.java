package src.Lesson.Task8;

import java.util.Scanner;

public class Author {
    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    String name;

    int birthYear;

    @Override
    public String toString() {
        return
                name +
                ", Dogum tarixi: " + birthYear;
    }
}
