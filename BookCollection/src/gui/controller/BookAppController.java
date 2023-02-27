package gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookAppController implements Initializable {
    @FXML
    private Button btnNew, btnEdit, btnDelete;

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
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/EditBookPopup.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Edit Book");
            stage.show();
            EditBookPopupController controller =loader.getController();

            //controller.setModel();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickDeleteBook(ActionEvent actionEvent) {
    }

    public void clickEditBook(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/EditBookPopup.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Edit Book");
            stage.show();
            EditBookPopupController controller =loader.getController();

            //controller.setModel();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
