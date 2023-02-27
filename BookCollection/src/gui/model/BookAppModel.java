package gui.model;

import be.Book;
import bll.LogicManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookAppModel {
    LogicManager logicManager = new LogicManager();
    private final ObservableList<Book> obsBooks = FXCollections.observableArrayList();



    public void loadData(){
        obsBooks.clear();
        obsBooks.addAll(logicManager.getAllBooks());
    }
}
