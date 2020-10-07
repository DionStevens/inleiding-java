package ho8;

import java.awt.*;
import java.applet.Applet;

public class test extends Applet {
    Button knop;





    public void init (){
        knop = new Button();
        knop.setLabel("klik op mij");
        add(knop);

    }

    public void paint (Graphics g){
        g.drawString("Doet deze knop wel iets?",50,60);





    }











}
