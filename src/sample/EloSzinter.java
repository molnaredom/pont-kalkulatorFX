package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EloSzinter {
    private static final Button ferfigomb = new Button("Férfi");
    private static final Button noigomb = new Button("Nő");
    private static final Label label1= new Label("Pont kalkulátor");
    private static final Button buttonAlert =new Button("Használat");


    public static Scene eloSzintertKeszit(Stage window){


        VBox eloLayout = new VBox(10);

        ferfigomb.setStyle("-fx-background-color: linear-gradient(#4da6ff,#004080)");

        noigomb.setStyle("-fx-background-color:  linear-gradient(#ff80d5,#522222)");


        //layout n button1

        buttonAlert.setOnAction(e-> AlertBox.hasznalatiAlert());

        eloLayout.getChildren().addAll(label1,ferfigomb,noigomb,buttonAlert);


        AtlagSzinter wellcome = new AtlagSzinter(eloLayout,500,700,"stilusok/welcomeScene.css");

        ferfigomb.setOnAction(e-> window.setScene(Ferfi.ferfitCsinal()));
        noigomb.setOnAction(e-> window.setScene(Noi.notcsinal()));


        return wellcome;
    }


}
