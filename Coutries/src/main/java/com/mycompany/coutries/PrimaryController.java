package com.mycompany.coutries;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PrimaryController {
  @FXML
    private Button ItalyButton;

    @FXML
    private Rectangle ThirdRec;

    @FXML
    private Button ChadButton;

    @FXML
    private Rectangle secondRec;

    @FXML
    private Rectangle firstRec;

    @FXML
    private Button MaliButton;

    @FXML
    private Button ClearButton;

    @FXML
    private Button IrelandButton;
    
    @FXML
    private Label show;

    @FXML
    private Button RomaniaButton;

    @FXML
    void ShowChad(ActionEvent event) {
        show.setText("CHAD");
        firstRec.setFill(Color.DARKBLUE);
        secondRec.setFill(Color.YELLOW);
        ThirdRec.setFill(Color.RED);
    }

    @FXML
    void ShowMali(ActionEvent event) {
        show.setText("MALI");
        firstRec.setFill(Color.LIGHTGREEN);
        secondRec.setFill(Color.YELLOW);
        ThirdRec.setFill(Color.RED);
    }

    @FXML
    void showIreland(ActionEvent event) {
        show.setText("IRELAND");
        firstRec.setFill(Color.LIGHTGREEN);
        secondRec.setFill(Color.WHITE);
        ThirdRec.setFill(Color.ORANGE);
    }

    @FXML
    void ShowItaly(ActionEvent event) {
        show.setText("ITALY");
        firstRec.setFill(Color.LIGHTGREEN);
        secondRec.setFill(Color.WHITE);
        ThirdRec.setFill(Color.RED);
    }

    @FXML
    void showRomania(ActionEvent event) {
        show.setText("ROMANIA");
        firstRec.setFill(Color.BLUE);
        secondRec.setFill(Color.YELLOW);
        ThirdRec.setFill(Color.RED);
    }

    @FXML
    void Clear(ActionEvent event) {
        show.setText("NAME");
         firstRec.setFill(Color.WHITE);
        secondRec.setFill(Color.WHITE);
        ThirdRec.setFill(Color.WHITE);
    }

}
