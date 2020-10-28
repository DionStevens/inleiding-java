package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s,tekst;
    int cijfer;

    public void init(){
        tekstvak = new TextField("",20);
        label = new Label("Type hier het maandnumber in");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);

    }



    public void paint(Graphics g){
        g.drawString(tekst,50,60);


    }


    class TekstvakListener implements  ActionListener {
        public void actionPerformed (ActionEvent e){
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s);
            switch (cijfer){
                case 1:
                    tekst = "slecht";
                case 2:
                    tekst = "slecht";
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                    tekst = "voldoende";
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "goed";
                case 9:
                    tekst = "goed";
                case 10:
                    tekst = "goed";
                    break;
                default:
                    tekst ="je hebt een ongeldig nummber ingevoerd";

            }
            repaint();




        }





    }










}
