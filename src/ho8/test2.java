package ho8;

import java.awt.*;
import java.applet.Applet;

public class test2 extends Applet {
    TextField tekstvak;



    public void init(){
        tekstvak = new TextField("klik op mij", 20);
        add(tekstvak);

    }

    public void paint(Graphics g){
        g.drawString("Type iets in het teksvakje",50,60);

    }


}
