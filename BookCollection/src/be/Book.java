package be;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Book {
    private IntegerProperty id= new SimpleIntegerProperty();
    private StringProperty title = new SimpleStringProperty();
    private IntegerProperty author = new SimpleIntegerProperty();
    private IntegerProperty genre = new SimpleIntegerProperty();
    private StringProperty lastRead = new SimpleStringProperty();

    public Book(int id, String title, int author, int genre, String lastRead){
        setId(id);
        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setLastRead(lastRead);

    }
    public Book(String title, int  author, int  genre, String lastRead){

        setTitle(title);
        setAuthor(author);
        setGenre(genre);
        setLastRead(lastRead);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public int getAuthor() {
        return author.get();
    }

    public IntegerProperty authorProperty() {
        return author;
    }

    public void setAuthor(int author) {
        this.author.set(author);
    }

    public int getGenre() {
        return genre.get();
    }

    public IntegerProperty genreProperty() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre.set(genre);
    }

    public String getLastRead() {
        return lastRead.get();
    }

    public StringProperty lastReadProperty() {
        return lastRead;
    }

    public void setLastRead(String lastRead) {
        this.lastRead.set(lastRead);
    }
}
