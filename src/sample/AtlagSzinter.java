package sample;
import javafx.scene.Parent;
import javafx.scene.Scene;




public class AtlagSzinter extends Scene{


    public AtlagSzinter(Parent parent, double v, double v1, String stilus) {
        super(parent, v, v1);

        parent.getStylesheets().add(stilus);


    }
}
