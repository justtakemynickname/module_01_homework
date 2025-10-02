public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Создание книг
        Book b1 = new Book("Война и мир", "Лев Толстой", "111", 3);
        Book b2 = new Book("Преступление и наказание", "Ф. Достоевский", "222", 2);
        Book b3 = new Book("Мастер и Маргарита", "М. Булгаков", "333", 1);

        // Добавление книг
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Создание читателей
        Reader r1 = new Reader("Иван Иванов", "R001");
        Reader r2 = new Reader("Анна Петрова", "R002");

        // Регистрация читателей
        library.registerReader(r1);
        library.registerReader(r2);

        // Выдача книг
        library.lendBook("111", "R001");
        library.lendBook("333", "R002");
        library.lendBook("333", "R001"); // должна быть ошибка - нет экземпляров

        // Возврат книги
        library.returnBook("333", "R002");

        // Удаление книги
        library.removeBook("222");

        // Удаление читателя
        library.removeReader("R002");
    }
}
