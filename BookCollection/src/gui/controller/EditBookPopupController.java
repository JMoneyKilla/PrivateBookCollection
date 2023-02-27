package gui.controller;

import gui.model.BookAppModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EditBookPopupController {
    private BookAppModel model;
    @FXML
    private Button btnSave, btnCancel;

    public void setModel(BookAppModel model){
        this.model = model;
    }
    public void clickSave(ActionEvent actionEvent) {
    }

    public void clickCancel(ActionEvent actionEvent) {
    }
}
