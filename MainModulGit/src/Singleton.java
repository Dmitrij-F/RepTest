/**
 * Created by Bro on 13.09.15.
 */
public class Singleton {
    private static Singleton os;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (os == null) {
            if (os == null)
                os = new Singleton();
        }
        return os;
    }

//    public static final Singleton os = new Singleton();
//    private Singleton() {
//
//    }

}
