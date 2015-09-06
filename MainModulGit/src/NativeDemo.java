/**
 * Created by Bro on 05.09.15.
 */
public class NativeDemo {
    int i;

   static void methodN (){
        NativeDemo obn = new NativeDemo();
        obn.i = 15;
        System.out.println("i = "+obn.i);
        obn.test();
        System.out.println("i = "+obn.i);

    }

public  native void test();

    static {
        System.loadLibrary("NativeEx");
    }

}
