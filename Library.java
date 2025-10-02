import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    // Добавление книги
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена: " + book);
    }

    // Удаление книги
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Книга с ISBN " + isbn + " удалена.");
    }

    // Регистрация читателя
    public void registerReader(Reader reader) {
        readers.add(reader);
        System.out.println("Зарегистрирован читатель: " + reader);
    }

    // Удаление читателя
    public void removeReader(String readerId) {
        readers.removeIf(reader -> reader.getReaderId().equals(readerId));
        System.out.println("Читатель с ID " + readerId + " удален.");
    }

    // Выдача книги
    public void lendBook(String isbn, String readerId) {
        Book book = findBook(isbn);
        Reader reader = findReader(readerId);

        if (book != null && reader != null) {
            if (book.borrowBook()) {
                System.out.println("Книга \"" + book.getTitle() + "\" выдана читателю " + reader.getName());
            } else {
                System.out.println("Нет доступных экземпляров книги: " + book.getTitle());
            }
        } else {
            System.out.println("Ошибка: книга или читатель не найдены.");
        }
    }

    // Возврат книги
    public void returnBook(String isbn, String readerId) {
        Book book = findBook(isbn);
        Reader reader = findReader(readerId);

        if (book != null && reader != null) {
            book.returnBook();
            System.out.println("Читатель " + reader.getName() + " вернул книгу \"" + book.getTitle() + "\"");
        } else {
            System.out.println("Ошибка: книга или читатель не найдены.");
        }
    }

    private Book findBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private Reader findReader(String readerId) {
        for (Reader reader : readers) {
            if (reader.getReaderId().equals(readerId)) {
                return reader;
            }
        }
        return null;
    }
}
