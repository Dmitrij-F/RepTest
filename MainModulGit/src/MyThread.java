/**
 * Created by Bro on 05.10.15.
 */
public class MyThread implements Runnable {
    private int x;
    private int y;

    @Override
    public void run() {
        for (; ; ) /* Line 13 */ {
            x++;
            y++;
            System.out.println("x = " + x + "y = " + y);
        }
    }
}
