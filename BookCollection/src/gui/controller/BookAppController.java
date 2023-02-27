package gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class BookAppController implements Initializable {

    @FXML
    private TableColumn tableColumnTitle, tableColumnAuthor, tableColumnGenre, tableColumnLastRead;
    @FXML
    private Label labelAlert;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        tableColumnAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        tableColumnGenre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        tableColumnLastRead.setCellValueFactory(new PropertyValueFactory<>("lastread"));

    }

    public void clickAddBook(ActionEvent actionEvent) {
    }

    public void clickDeleteBook(ActionEvent actionEvent) {
    }

    public void clickEditBook(ActionEvent actionEvent) {
    }
}
