package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawFigure extends JComponent {

    @Override
    protected void paintComponent(java.awt.Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 400);
        g2.draw(rect);
        Ellipse2D ellipse = new Ellipse2D.Double(100, 100, 200, 400);
//        g2.draw(ellipse);
        g2.setPaint(new Color(150, 150, 150));
        g2.fill(ellipse);
        g2.drawString("Yo!", 1, 1);

    }

    public static void main(String[] args) {
        new DrawFrame();
    }

}
