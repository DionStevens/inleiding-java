package h10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class op4 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label1;
    Label label2;
    String s,tekst,a;
    int maand;
    int jaar;

    public void init(){
        tekstvak1 = new TextField("",20);
        label1 = new Label("Type hier het maandnumber in");
        tekstvak1.addActionListener( new TekstvakListener() );
        tekstvak2 = new TextField("",20);
        label2 = new Label("Type hier het jaartal in");
        tekst = "";
        add(label1);
        add(label2);
        add(tekstvak1);
        add(tekstvak2);

    }



    public void paint(Graphics g){
        g.drawString(tekst,50,75);


    }


    class TekstvakListener implements  ActionListener {
        public void actionPerformed (ActionEvent e){
            s = tekstvak1.getText();
            a = tekstvak2.getText();
            maand = Integer.parseInt( s);
            jaar = Integer.parseInt( a);
            switch (maand){
                case 1:
                    tekst = "Januari 31";
                    break;
                case 2:
                    if((jaar % 4 == 0 && !(jaar % 100 == 0))  ||
                            jaar % 400 == 0) {
                        tekst = "Februari 29";
                        }
                    else {
                        tekst ="Februari 28";
                }
                    break;
                case 3:
                    tekst = "Maart 31";
                    break;
                case 4:
                    tekst = "April 30";
                    break;
                case 5:
                    tekst = "Mei 31";
                    break;
                case 6:
                    tekst = "Juni 30";
                    break;
                case 7:
                    tekst = "Juli 31";
                    break;
                case 8:
                    tekst = "Augustus 31";
                    break;
                case 9:
                    tekst = "September 30";
                    break;
                case 10:
                    tekst = "Oktober 31";
                    break;
                case 11:
                    tekst = "November 30";
                    break;
                case 12:
                    tekst = "December 31";
                    break;

            }
            repaint();




        }





    }










}
