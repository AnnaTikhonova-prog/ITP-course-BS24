import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateBookQty(String bookName, int qty) {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                book.setQty(qty);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jk.rowling@example.com", 'F');
        Book book1 = new Book("Harry Potter", author1, 29.99, 10);
        Book book2 = new Book("Fantastic Beasts", author1, 19.99);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.updateBookQty("Harry Potter", 15);
        library.displayBooks();
    }
}
