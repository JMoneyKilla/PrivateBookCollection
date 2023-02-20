package gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BookAppController {
    @FXML
    private Button btnNew, btnEdit, btnDelete;

    public void clickNew(ActionEvent actionEvent) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/NewBookPopup.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("New Book");
        stage.show();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }

    public void clickEdit(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/view/EditBookPopup.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Edit Book");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickDelete(ActionEvent actionEvent) {
    }
}
