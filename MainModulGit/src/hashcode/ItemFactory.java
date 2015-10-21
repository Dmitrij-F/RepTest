package hashcode;

/**
 * Created by Bro on 15.10.15.
 */
public class ItemFactory {
    public static Item createItemable() {
        int a;
        int b;
        int c;
        Item result = new Item();
            a = (int) Math.round(Math.random() * 1000);
            b = (int) Math.round(Math.random() * 1000);
            c = (int) Math.round(Math.random() * 1000);
        result.a = a;
        result.b = b;
        result.c = c;
        return result;
    }
}
