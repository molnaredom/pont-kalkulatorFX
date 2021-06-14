package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import sample.GridKeszito;

public class Ferfi {


    public static Scene ferfitCsinal() {


        VBox layoutFFI = new VBox();
        AtlagSzinter ferfi = new AtlagSzinter(layoutFFI,700,700,"stilusok/ferfigomb.css");

        layoutFFI.getChildren().addAll(fejlec(),GridKeszito.gridmaker(true));//ffi = 0



        return ferfi;
    }

    /**
     * @return   A felső vonalba kiírja melyik kalkulátorról van szó
     */
    private static GridPane fejlec() {

        Label folabel = new Label("Férfi pontozás kalkulátora");
        folabel.getStyleClass().add("label-fo");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: #2a3354");

        grid.setMinSize(15,100);

        grid.getChildren().addAll(folabel);
        return grid;
    }

}
