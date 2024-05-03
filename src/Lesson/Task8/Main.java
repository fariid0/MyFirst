package src.Lesson.Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Elxan Elatli", 1962);
        Book book1 = new Book("Eksperiment", author1, 2018);
        Book book2 = new Book("On dorduncu adam", author1, 2019);

        System.out.println(book1);
        System.out.println(book2);
    }
}
