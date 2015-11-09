package gui;


import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    public DrawFrame() throws HeadlessException {
        add(new DrawFigure());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationByPlatform(true);
        setVisible(true);

    }
}

