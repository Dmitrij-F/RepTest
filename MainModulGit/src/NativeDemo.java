/**
 * Created by Bro on 05.09.15.
 */
public class NativeDemo extends AbsractClass {
    int i;

    static void methodN() {
        NativeDemo obn = new NativeDemo();
        obn.i = 15;
        System.out.println("i = " + obn.i);
        obn.test();
        System.out.println("i = " + obn.i);

    }

    @Deprecated
    public native void test();

//     {
//        System.loadLibrary("NativeEx");
//    }

    @Override
    void absM() {
        System.out.println("NativeDemo override absM");
    }
}
