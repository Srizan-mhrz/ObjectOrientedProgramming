class Book {
    protected String title;
    protected String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class FictionBook extends Book {
    public FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    public NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    public TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class Books {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Hobbit", "J.R.R. Tolkien");
        NonFictionBook nonFiction = new NonFictionBook("Homo Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Kite Runner", "Khaled Hosseini");

        fiction.displayDetails();
        System.out.println();

        nonFiction.displayDetails();
        System.out.println();

        technical.displayDetails();
    }
}