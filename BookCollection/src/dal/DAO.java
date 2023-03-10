package dal;

import be.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAO {
    DataConnection dbc = new DataConnection();
    private void createBook(Book book) {
        String sql = "INSERT INTO Songs (title, author, genre, lastRead) VALUES (?,?,?,?,?)";
       String title = book.getTitle();
       int author = book.getAuthor();
       int genre = book.getGenre();
       String lastRead = book.getLastRead();

        try(Connection con = dbc.getConnection();) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,title);
            ps.setInt(2,author);
            ps.setInt(3,genre);
            ps.setString(4,lastRead);
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void deleteBook(Book book) {
        int id = book.getId();
        String sql ="DELETE FROM Songs WHERE id=?";

        try(Connection con = dbc.getConnection();) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void updateBook(Book book){
        int id = book.getId();
        String title = book.getTitle();
        int author = book.getAuthor();
        int genre = book.getGenre();
        String lastRead = book.getLastRead();


        String sql = "UPDATE Songs SET Title = ?, author = ?, genre = ?, lastRead = ? WHERE id = ?;";
        try(Connection con = dbc.getConnection();) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,title);
            ps.setInt(2,author);
            ps.setInt(3,genre);
            ps.setString(4,lastRead);
            ps.setInt(5,id);
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> getAllBooks(){
        Book book;
        List<Book> allBooks = new ArrayList<>();

        String sql = "SELECT * FROM Books";
        try(Connection connection = dbc.getConnection()) {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                int author = rs.getInt("author");
                int genre = rs.getInt("genre");
                String lastRead = rs.getString("lastRead");
                book = new Book(id, title, author, genre, lastRead);
                allBooks.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allBooks;
    }

    public static void main(String[] args) {
        DAO dao = new DAO();
        List<Book> books = dao.getAllBooks();
        for (Book b: books
             ) {
            System.out.println(b.getTitle());
        }
    }
}
