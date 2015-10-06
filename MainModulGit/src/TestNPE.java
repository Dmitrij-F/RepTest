import java.util.Comparator;

/**
 * Created by Bro on 13.09.15.
 */
public class TestNPE implements Comparator<String>{
    String f;
    public static String handle(Formatter f, String s) {
//        this.f = null;
        if (s.equals("")) {
            return "(none)";
        }
        return f.format(s.trim());
    }



    @Override
    public int compare(String o1, String o2) {
        return 0;
    }
}
