/**
 * Created by Bro on 13.09.15.
 */
public class Singleton {
    private static Singleton os;
    private Singleton(){}
    public static Singleton getInstance() {
       synchronized (Singleton.class) {
           if (os == null) {
               os = new Singleton();
           }
           return os;
       }
    }
}
