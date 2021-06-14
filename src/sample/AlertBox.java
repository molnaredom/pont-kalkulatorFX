package sample;
import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.stage.*;
import  javafx.scene.layout.*;

public class AlertBox {

    private static void display(String  title, String  message) {
        Stage window = new Stage();
        //az alert box mogotti feluletre nem enged kattintani
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(500);

        Label label = new Label(message);
        Button closeButton = new Button("Értettem");
        closeButton.setOnAction(e-> window.close());

        VBox layout = new VBox(30);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();// var es nem zarodik be magatol

    }

    public static void hasznalatiAlert(){
        display("Használati utasítás",

                "\nMásodperc megadása 12,2 helyett, 12.2 alakban legyen, azaz a tized másodperc '.' -tal legyen elválasztva " +
                        "\nsdfd" +
                        "\ndfsdf" +
                        "sfs" +
                        "\ndfsdf" +
                        "\ndfsdf" +
                        "\nKészítette Molnár Ádám 2021 februar" +
                        "" +
                        "" +
                        "" +
                        ""






                );
    }


}
