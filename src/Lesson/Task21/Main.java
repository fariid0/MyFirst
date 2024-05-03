package src.Lesson.Task21;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Title1", "Author1", 7);
        Book book2 = new Book("Title2", "Author2", 20);
        Book book3 = new Book("Title3", "Author3", 15);
        Book[] books = {book1, book2, book3};

        Arrays.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }

        book1.compareTo(book2);
        System.out.println(book1.compareTo(book2));


        Student student1 = new Student("student1", 20, "Java3");
        Student student2 = new Student("student2", 30, "Java4");
        Student student3 = new Student("student3", 40, "Java5");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);


    }
}
