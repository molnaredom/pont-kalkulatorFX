package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.IllegalFormatCodePointException;

public class Addsor extends GridPane {

    String mozgas;
    TextField percInput = new TextField();
    TextField mpInput = new TextField();
    TextField darabInput = new TextField();

    GridPane grid= new GridPane();

    Label label = new Label();

    public Addsor(String mozgas,int ittDbLesz) {
        this.mozgas = mozgas;

        grid.setVgap(8);
        grid.setHgap(10);
        //name label-1
        Label label = new Label(mozgas);
        GridPane.setConstraints(label, 0, 0); // a griden belul hova tegyuk

        //perc input-2

        darabInput.setPromptText("darab");
        GridPane.setConstraints(darabInput, 1, 0);


        grid.getChildren().addAll(label, darabInput);

    }


    public Addsor(String mozgas) {//, GridPane grid, TextField percInput, TextField mpInput
        this.mozgas = mozgas;

        grid.setVgap(8);
        grid.setHgap(10);


        //name label-1
        Label label = new Label(mozgas);
        GridPane.setConstraints(label, 0, 0); // a griden belul hova tegyuk

        //perc input-2
        percInput.setPromptText("perc");
        GridPane.setConstraints(percInput, 1, 0);

        //mp input-3
        mpInput.setPromptText("mp");
        GridPane.setConstraints(mpInput, 2, 0);




        grid.getChildren().addAll(label, mpInput, percInput);



    }

    /**
     * @return Darabbal tér vissza--> amit a textfieldból beolvasott.és ellenőrzött
     */
    int db() {
        return inputellenorzo(darabInput);
    }

    double lebegoPontos() {
        return  inputellenorzoDouble(darabInput);
    }

    int ido() {
        /*GridPane.setConstraints(label,5,0);
        if (inputellenorzo(percInput)==-1 || inputellenorzo(mpInput)==-1)
        {label.setText("Hibásan írtad be a szöveget");}*/

        return inputellenorzo(percInput) * 60 + inputellenorzo(mpInput);

    }

    public GridPane getGrid() {
        return grid;
    }







    public static int inputellenorzo(TextField input) {
        try {
            if (input.getText().equals("")) {
                return -1;
            }
            return Integer.parseInt(input.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static double inputellenorzoDouble(TextField input) {
        try {
            if (input.getText().equals("")) {
                return -1;
            }
            return Double.parseDouble(input.getText());
        } catch (NumberFormatException e) {
            return -1;
        }
    }



}