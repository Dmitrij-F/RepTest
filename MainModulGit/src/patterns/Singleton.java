package patterns;

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


}
