package hashcode;

/**
 * Created by Bro on 15.10.15.
 */
public class Item implements Comparable<Itemable>, Itemable {
    int a;
    int b;
    int c;

    @Override
    public int getA() {
        return a;
    }

    Item() {
        a = (int) Math.round(Math.random() * 1000);
        b = (int) Math.round(Math.random() * 1000);
        c = (int) Math.round(Math.random() * 1000);
    }

    @Override
    public String toString() {
        return String.format("[a=%d b=%d c=%d]", a, b, c);
    }

    @Override
    public int hashCode() {
//        return 1;
//        return super.hashCode();
        return a * b * c;
    }

    @Override
    public int compareTo(Itemable o) {
        return (int) Math.signum(a - o.getA());
    }

//    @Override
//    public boolean equals(Object obj) {
//        Item item = (Item) obj;
//        return a * b * c == item.a * item.b * item.c;
//    }
}
