package src.Dersde.MentorLibrary;

import java.util.Arrays;
import java.util.Objects;

public class User {
    String fullName;
    int id;
    static int lastId = 1000;
    Book[] borrowedBooks = new Book[0];

    public User(String fullName) {
        this.fullName = fullName;
        id = ++lastId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(fullName, user.fullName) && Arrays.equals(borrowedBooks, user.borrowedBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fullName, id);
        result = 31 * result + Arrays.hashCode(borrowedBooks);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder("Borrowed books:\n");
        for (Book b : borrowedBooks) {
            list.append(b.toString().indent(4));
        }
        return "FullName: " + fullName +
                ", Id: " + id + "\n" + list;
    }

    void borrowBook(Book book) throws ExistsException {
        for (Book borrowedBook : borrowedBooks) {
            if (borrowedBook.equals(book)){
                throw new ExistsException("Bu kitab alinib");
            }
        }
        Book [] newBorrowedBooks = Arrays.copyOf(borrowedBooks, borrowedBooks.length + 1);
        newBorrowedBooks[newBorrowedBooks.length - 1] = book;
        borrowedBooks = newBorrowedBooks;
    }

    public void printBrowwedBooks(){
        System.out.println("new borrowed books");
        for (Book book : borrowedBooks) {
            System.out.println(book.toString());
        }
    }
}
