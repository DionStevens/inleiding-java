package ho8;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class test extends Applet {
    Button knop;
    String schermtekst;





    public void init (){
        schermtekst = "Doet deze knop wel iets?";
        knop = new Button("Klik op mij");
        KnopListener k1 = new KnopListener();
        knop.addActionListener( k1 );
        add(knop);

    }

    public void paint (Graphics g){
        g.drawString(schermtekst,50,60);

    }


    class KnopListener implements ActionListener {
        public void actionPerformed ( ActionEvent e ){
            schermtekst = "Ja, deze knop doet wel iets";
            repaint();

        }

    }

}
