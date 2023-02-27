package be;

public class Book {
    private int id;
    private String title;
    private int author;
    private int genre;
    private String lastRead;

    public Book(int id, String title, int author, int genre, String lastRead){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.lastRead = lastRead;
    }
    public Book(String title, String author, String genre, String lastRead){

        this.title = title;
        this.author = Integer.parseInt(author);
        this.genre = Integer.parseInt(genre);
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

    public int getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = Integer.parseInt(author);
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = Integer.parseInt(genre);
    }

    public String getLastRead() {
        return lastRead;
    }

    public void setLastRead(String lastRead) {
        this.lastRead = lastRead;
    }
}
