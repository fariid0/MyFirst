package src.Dersde.MentorLibrary;

import java.util.Arrays;

public class Library {
    String name;
    Book[] books;
    User[] users;

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) throws Exception{
        for (Book existingBook : books) {
            if (existingBook.equals(book)){
                throw new Exception("Bu kitab elave olunub.");
            } else {
                Book [] newBooks = Arrays.copyOf(books, books.length + 1);
                newBooks [newBooks.length - 1] = book;
                books = newBooks;
            }
        }
    }

    public void addUser(User user) throws Exception{
        for (User existingUser : users) {
            if (existingUser.equals(user)) {
                throw new Exception("Bu user daxil olunub.");
            } else {
                User [] newUsers = Arrays.copyOf(users, users.length + 1);
                newUsers [newUsers.length - 1] = user;
                users = newUsers;
            }
        }
    }

    public void printNewBook(){
        System.out.println("New Books: ");
        for (Book book : books){
            System.out.println(book.toString());
        }
    }

    public void printNewUser() {
        System.out.println("New Users: ");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
