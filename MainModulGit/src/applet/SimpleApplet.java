package applet;

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {
    transient int h = 10;
    volatile int k = 10;

    public void paint(Graphics G) {
        G.drawString("applet ", 20, 20);
    }


}