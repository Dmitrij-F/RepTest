package Applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Bro on 04.09.15.
 */
public class SimpleApplet extends Applet{
    transient int h = 10;
    volatile int k = 10;

    public void paint(Graphics G){
        G.drawString("Applet ", 20, 20);
    }


}
