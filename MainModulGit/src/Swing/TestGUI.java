package Swing;


import javax.swing.*;

public class TestGUI extends JFrame {

    JPanel p = new JPanel();
    JButton b = new JButton("ClickMe");

    TestGUI() {
        super("TestGUI");
        setSize(200, 200);
        setResizable(true);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.add(b);
        add(p);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TestGUI();
    }


}
