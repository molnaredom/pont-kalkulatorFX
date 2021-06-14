package sample;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage window;

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Pont kalkulátor");



        window.setScene(EloSzinter.eloSzintertKeszit(window));

        window.show();

    }


    public static void main(String[] args) {
        launch(args);

    }

}
