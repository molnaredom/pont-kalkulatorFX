package sample;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridKeszito {

    /**
     *
     * @param nem Férfi(true) vagy Nőről(false)  van szó?
     * @return griddel tér vissza ami a Férfi színtérben lesz megjelenítve
     */
    public static GridPane gridmaker(boolean nem) { //false for women, true for men

Label label = new Label(),label1 = new Label(),label2= new Label(),label3= new Label(),label4= new Label(),label5= new Label(),label6= new Label(),label7= new Label(),label8= new Label()
    ,label9= new Label(),label10= new Label(),label11= new Label(),label12= new Label(),label13= new Label();

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));//padding
        grid.setVgap(5);
        grid.setHgap(15);

        Button valto= new Button();


        if (nem){
            valto.setText("Váltás nőire");
            valto.setStyle("-fx-background-color:  linear-gradient(#ff80d5,#522222)");
            valto.setOnAction(e-> Main.window.setScene(Noi.notcsinal()));

        } else {
            valto.setText("Váltás férfire");
            valto.setStyle("-fx-background-color: linear-gradient(#4da6ff,#004080)");
            valto.setOnAction(e-> Main.window.setScene(Ferfi.ferfitCsinal()));
        }



        //GridPane grid1 = new GridPane();
        Addsor futas400= new Addsor(  "Futás 400m        ",0);
        Addsor futas3200= new Addsor( "Futás 3200m         ");
        Addsor uszas2000 = new Addsor("Úszás 200m      ");
        Addsor gy2000 = new Addsor(   "Gyakorló 2000m ");
        Addsor huzodszk = new Addsor( "Húzódzkodás    ",0);
        Addsor fugg= new Addsor(      "Függ/Kötél        ",0);
        Addsor buvar= new Addsor(     "Búvárkodás       ",0);
        Addsor akp = new Addsor(      "Akadálypálya     ");
        Addsor f3200 = new Addsor(    "Fegyver 3200m   ");
        Addsor gy3200= new Addsor(    "Gyakorló 3200m");
        Addsor kezigranat= new Addsor("Kézigránát          ",0);
        Addsor fekvo = new Addsor(    "Fekvőtámasz       ",0);
        Addsor felules = new Addsor(  "Felülés                 ",0);
        Addsor f2000 = new Addsor(    "Fegyver 2000m    ");



        Addsor[] adsorok = {futas400,futas3200,uszas2000,gy2000,huzodszk,fugg,buvar,akp,f3200,gy3200 ,kezigranat, felules, fekvo,f2000};
        int iterable = 0;


        //pozicio beallitas
        for (Addsor adsor :adsorok) {
            GridPane.setConstraints(adsor.getGrid(),0,iterable);
            iterable++;
        }


        Button button = new Button("Számítás");
        GridPane.setConstraints(button,0,iterable);
        GridPane.setConstraints(valto,1,iterable);
        //Button valtas =


        Label kiiras = new Label();
        button.setOnAction(e->{

            label.setText(Mozgáspontok.futas400(futas400.lebegoPontos(), nem) +" pont");
            label1.setText(Mozgáspontok.futas3200(futas3200.ido(), nem) +" pont");
            label2.setText(Mozgáspontok.uszas2000(uszas2000.ido(), nem) +" pont");
            label3.setText(Mozgáspontok.gy2000(gy2000.ido(), nem) +" pont");
            label4.setText(Mozgáspontok.huzodszk(huzodszk.db()) +" pont");
            label5.setText(Mozgáspontok.fugg(fugg.lebegoPontos(), nem) +" pont");
            label6.setText(Mozgáspontok.buvar(buvar.lebegoPontos(), nem) +" pont");
            label7.setText(Mozgáspontok.akp(akp.ido(), nem) +" pont");
            label8.setText(Mozgáspontok.f3200(f3200.ido(), nem) +" pont");
            label9.setText(Mozgáspontok.gy3200(gy3200.ido(), nem) +" pont");
            label10.setText(Mozgáspontok.kezigranat(kezigranat.lebegoPontos(), nem) +" pont");
            label11.setText(Mozgáspontok.fekvo(fekvo.db(), nem) +" pont");
            label12.setText(Mozgáspontok.felules(felules.db(), nem) +" pont");
            label13.setText(Mozgáspontok.f2000(f2000.ido(), nem) +" pont");

        });

        List<Label> labels = new ArrayList<>(Arrays.asList(label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label12,label11,label13));


        for (int i = 0; i < labels.size(); i++) {
            GridPane.setConstraints(labels.get(i),1,i);
        }
        GridPane.setConstraints(kiiras,2,0);

        /*
        *   hozzaadja  a gridhez a labeleket egyesevel
        */

        labels.forEach(x->grid.getChildren().add(x));



        grid.getChildren().addAll(futas400.getGrid(),futas3200.getGrid(),uszas2000.getGrid(),gy2000.getGrid(),
                huzodszk.getGrid(),fugg.getGrid(),buvar.getGrid(),akp.getGrid(),f3200.getGrid(), button,kiiras,
                gy3200.getGrid(), kezigranat.getGrid(), felules.getGrid(), fekvo.getGrid(), f2000.getGrid(),valto);





        return grid;
    }




}
