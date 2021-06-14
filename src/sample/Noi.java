package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Noi {
    public static Scene noi;

    public static Scene notcsinal() {

        VBox layoutNOI = new VBox(20);
        noi = new Scene(layoutNOI, 700, 700);
        noi.getStylesheets().add("stilusok/noigomb.css");
        layoutNOI.getChildren().addAll(fejlec(),GridKeszito.gridmaker(false));//no=false

        return noi;

    }
    private static GridPane fejlec() {

        Label folabel = new Label("Női pontozás kalkulátora");
        folabel.getStyleClass().add("label-fo");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: #6b2e38");

        grid.setMinSize(15,100);

        grid.getChildren().addAll(folabel);
        return grid;
    }


}
