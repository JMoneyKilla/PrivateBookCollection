package be;

public class Book {
    private int id;
    private String title;
    private String author;
    private int isbn;
    private String genre;
    private String lastRead;

    public Book(int id, String title, String author, int isbn, String genre, String lastRead){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.lastRead = lastRead;
    }
    public Book(String title, String author, int isbn, String genre, String lastRead){

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.lastRead = lastRead;
    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLastRead() {
        return lastRead;
    }

    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }
}
