package ho8;

import java.awt.*;
import java.applet.Applet;

public class test2 extends Applet {
    TextField tekstvak;
    Label label;



    public void init(){
        tekstvak = new TextField("klik op mij", 20);
        label = new Label("Type iets in het tekstvakje");
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g){


    }


}
