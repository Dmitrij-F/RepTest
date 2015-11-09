package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI extends JFrame {

    JPanel p = new JPanel();
    JButton b = new JButton("Click 1st");
    JButton b2 = new JButton("Click 2nd");
    JTextField textField = new JTextField("DefaultValue", 40);

    TestGUI() {
        super("TestGUI");
        final int k;
        Dimension getResolution = Toolkit.getDefaultToolkit().getScreenSize();
        int screanWidth = getResolution.width;
        int screanHeigth = getResolution.height;

        setSize(screanWidth / 4, screanHeigth / 4);
        setResizable(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem item = new JMenuItem("fff");
//        item.addActionListener(Mouse);
        popupMenu.add(item);


        p.add(b);
        p.add(b2);
        p.add(textField);
        textField.setComponentPopupMenu(popupMenu);
        add(p);   //,BorderLayout.SOUTH
//        p.setLayout(new GridLayout(8,8));
//        pack();

        ColorTextField text1 = new ColorTextField("Helo!");
        b.addActionListener(text1);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Anonim class used");
            }
        });

//        Image img = new ImageIcon("icon.gif").getImage();
//        setIconImage(img);

        setVisible(true);
    }

    private class ColorTextField implements ActionListener {

        private String stringText;

        public ColorTextField(String s) {
            stringText = s;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            textField.setBackground(Color.RED);
            textField.setText(stringText);
        }
    }


    public static void main(String[] args) {

        new TestGUI();

    }


}
