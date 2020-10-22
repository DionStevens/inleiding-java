package ho8;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class op2 extends Applet {
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    int counter1;
    int counter2;
    int counter3;
    int counter4;


    public void init(){
        knop1 = new Button("manelijken Leerling");
        knop1.addActionListener( new Knoplistener () );
        knop2 = new Button("vrouwelijken Leerling");
        knop2.addActionListener( new Knoplistener () );
        knop3 = new Button("Man");
        //knop3.addActionListener( new KnopListener () );
        knop4 = new Button("Woman");
       // knop4.addActionListener( new KnopListener () );
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        counter4 = 0;

    }

    public void paint(Graphics g){
        g.drawString("male students " + counter1 ,50,60);
        g.drawString("female students "+ counter2,50,80);

    }


    class Knoplistener implements ActionListener{
        public void actionPerformed ( ActionEvent e ){
            counter1++;
            repaint();

        }

    }


    class knoplistener implements ActionListener{
        public void actionPerformed ( ActionEvent e){
            counter2++;
            repaint();
        }


    }



}
