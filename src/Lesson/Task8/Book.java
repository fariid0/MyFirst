package src.Lesson.Task8;

public class Book {

    Author author;

    String title;


    int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return
                "Yazici: " + author  +
                ", Kitab: " + title  +
                ", Buraxilis tarixi: " + publicationYear ;
    }

}
