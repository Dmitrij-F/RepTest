import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Bro on 05.10.15.
 */
public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("Beep + date"+now);
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args) {
        new TimePrinter().actionPerformed((ActionEvent) new Object());
    }


}
