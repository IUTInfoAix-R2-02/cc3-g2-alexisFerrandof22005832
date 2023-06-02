package fr.amu.iut.cc3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    TextField T1;

    @FXML
    TextField T2;

    @FXML
    TextField T3;

    @FXML
    TextField T4;

    @FXML
    TextField T5;

    @FXML
    TextField T6;

    @FXML
    Label Error;

    @FXML
    Button Tracer = new Button();

    @FXML
    Button Vider = new Button();

    String Competence1 = T1.getText();
    String Competence2 = T2.getText();
    String Competence3 = T3.getText();
    String Competence4 = T4.getText();
    String Competence5 = T5.getText();
    String Competence6 = T6.getText();

    String MsgError = Error.getText();


    int Note1 = Integer.parseInt(Competence1);
    int Note2 = Integer.parseInt(Competence2);
    int Note3 = Integer.parseInt(Competence3);
    int Note4 = Integer.parseInt(Competence4);
    int Note5 = Integer.parseInt(Competence5);
    int Note6 = Integer.parseInt(Competence6);

    @FXML
    private void TacerCliked(){
        getXRadarChart(0,6);
        getYRadarChart(0,6);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        getXRadarChart(Note1,1);
        getXRadarChart(Note1,1);
        getXRadarChart(Note2,2);
        getXRadarChart(Note2,2);
        getXRadarChart(Note3,3);
        getXRadarChart(Note3,3);
        getXRadarChart(Note4,4);
        getXRadarChart(Note4,4);
        getXRadarChart(Note5,5);
        getXRadarChart(Note5,5);
        getXRadarChart(Note6,6);
        getXRadarChart(Note6,6);
    }


    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
    




}
