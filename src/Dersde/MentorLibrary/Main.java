package src.Dersde.MentorLibrary;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Poter", "J.K.ROWLING");
        Book book2 = new Book("The Adventures of Tom Sawyer","MARK TWAIN");
        Book book3 = new Book("Heidi","JOHANNA SPYRI");

        User user1 = new User("Inal Mollayev");
        User user2 = new User("Kenan Zalov");

        user1.borrowedBooks = new Book[] {book1, book2};

        System.out.println(user1);

        Library library = new Library("Kitabxana");
        library.books = new Book[] {book1, book3};
        library.users = new  User[] {user1};
        try {
            user1.borrowBook(book2);
        } catch (ExistsException e) {
            System.out.println(e.getMessage());
        }
        user1.printBrowwedBooks();
//        library.addBook(book2);
//        library.printNewBook();
//        library.addUser(user2);
//        library.printNewUser();
//
//        try {
//            library.addBook(book1);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        library.addBook(book1);
//        library.printNewBook();

    }
}
