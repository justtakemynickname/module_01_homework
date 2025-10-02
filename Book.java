public class Book {
    private String title;
    private String author;
    private String isbn;
    private int copies; // количество экземпляров

    public Book(String title, String author, String isbn, int copies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopies() {
        return copies;
    }

    public void addCopies(int amount) {
        this.copies += amount;
    }

    public boolean borrowBook() {
        if (copies > 0) {
            copies--;
            return true;
        }
        return false;
    }

    public void returnBook() {
        copies++;
    }

    @Override
    public String toString() {
        return title + " (" + author + "), ISBN: " + isbn + ", Copies: " + copies;
    }
}
