/**
 * Created by Bro on 04.09.15.
 */
public class A {
    int a = 77, b = 99;

    A(int i, int j) {
        a = i;
        b = j;
    }

    A(int i) {
        this(i, i);
    }

    A() {
        this(0);
    }


}
