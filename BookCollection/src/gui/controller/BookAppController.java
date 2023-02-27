package gui.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class BookAppController implements Initializable {

    @FXML
    private TableColumn tableColumnTitle, tableColumnAuthor, tableColumnGenre, tableColumnLastRead;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableColumnTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        tableColumnAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        tableColumnGenre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        tableColumnLastRead.setCellValueFactory(new PropertyValueFactory<>("lastread"));

    }
}
