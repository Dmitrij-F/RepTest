package generics;


import java.io.Serializable;

public class RestrectedGeneric<H extends Number & Serializable> {
    H argz[];

    public RestrectedGeneric(H o[]) {
        argz = o;
    }

    public double mid() {
        double sum = 0;
        try {
            for (int i = 0; i < argz.length; i++)
                sum += argz[i].doubleValue();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } finally {
            return sum / argz.length;
        }

    }

    public boolean samemid(RestrectedGeneric<? extends Number> o) {
        if (mid() == o.mid())
            return true;
        return false;
    }


}
