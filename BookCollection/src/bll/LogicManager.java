package bll;

import be.Book;
import dal.DAO;

import java.util.List;

public class LogicManager {

    DAO dao = new DAO();

    public List<Book> getAllBooks(){
        return dao.getAllBooks();
    }
}
