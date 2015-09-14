/**
 * Created by Bro on 13.09.15.
 */
public class TestNPE {
    String f;
    public static String handle(Formatter f, String s) {
//        this.f = null;
        if (s.equals("")) {
            return "(none)";
        }
        return f.format(s.trim());
    }
}
