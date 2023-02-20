package dal;

import be.Book;


import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.*;
import java.util.ArrayList;


import static java.nio.file.StandardOpenOption.APPEND;


public class DAO {
    private static final String BOOK_SOURCE = "Resources/books.txt";
    private Book createBook(String title, String auther, int isbn,String genre,String lastRead) {
        int id = getNextId();
        try {
            Files.writeString(Path.of(BOOK_SOURCE), id + ","  + title + auther + ","  + isbn + ","  + genre + ","  + lastRead +"/n", APPEND );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Book(id, title, auther, isbn,genre,lastRead);
    }
    private void deleteBook(Book book) {
        try {
            List<Book> books = null;
            try {
                books = getAllBooks();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String booksString = "";
            for (Book b : books) {
                if (b.getId() != book.getId()) {
                    b = book;
                }
                booksString += b.getId() + "," + "," + b.getTitle() + "n/";
                try {
                    Files.writeString(Path.of(BOOK_SOURCE), booksString);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
    private int getNextId() {
        int biggestID;
        try {
            List<Book> books = getAllBooks();
            biggestID = 0;
            for (Book m : books) {
                if (biggestID < m.getId())
                    biggestID = m.getId();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return biggestID + 1;
    }
    public List<Book> getAllBooks() throws FileNotFoundException, IOException {
        List<Book> allBooks = new ArrayList<>();
        File file = new File(BOOK_SOURCE);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Book book = stringArrayToBooks(line);
                    allBooks.add(book);
                } catch (Exception ex) {

                }
            }
        }
        return allBooks;
    }
    private Book stringArrayToBooks(String t) {
        String[] arrBook = t.split(",");

        int id = Integer.parseInt(arrBook[0]);

        String title = arrBook[1];
        if (arrBook.length > 3) {
            for (int i = 3; i < arrBook.length; i++) {
                title += "," + arrBook[i];
            }
        }
        String auther = (arrBook[2]);
        int isbn = Integer.parseInt((arrBook[3]));
        String genre = (arrBook[4]);
        String lastRead =(arrBook[5]);
        Book book = new Book(id, title, auther, isbn,genre,lastRead);
        return book;
    }
}
