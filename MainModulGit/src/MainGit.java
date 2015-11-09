import generics.GenericDemo;
import generics.RestrectedGeneric;
import org.xml.sax.SAXException;
import patterns.Singleton;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;

/**
 * @author Bro
 * @version 1.1
 */
public class MainGit implements Serializable, CheckGeneric, Check, Cloneable {

    private int y = 2;

    MainGit(int y) {
        this.y = y;
    }

    MainGit() {

    }


    protected boolean bb() {
        return true;
    }

    static {

        byte ids = 8;
    }

    static {
        System.out.println("Hi Static!");
        //System.exit(10);
    }

    Thread ot1 = new Thread();
    int c = 1;
    transient char tc = 'h';
    volatile float ff = 7;
    private String callme = "Catch it";

    static <F, V extends F> void genMethod(F x, V a[]) {
        System.out.println(x.getClass() + a.toString());

    }

    public static void main(final String[] args) throws IOException, ParserConfigurationException, SAXException, CloneNotSupportedException {

        new MainGit();
        int[] ii = new int[12];
        final int k;
        final int[] jk = new int[0];

        long start, end;


        new Object().getClass().getEnclosingClass();

        class TestLocal {
            void t() {
                args[0] = "12";
                System.out.println("ffffffffffffffff");
            }
        }

        CloneTest original = new CloneTest();
        CloneTest copy = (CloneTest) original.clone();


//        Timer t = new Timer("3000",listener);
//        JOptionPane.showMessageDialog(null,"Exit now?");
//        System.exit(0);


        //new MainGit("gogogo").absM();
        Integer arg[] = {1, 2, 3, 4};
        MainGit.genMethod(2, arg);

        int c = 12;

        float f = 13.2f;

//       Integer ass;
//       MainGit oc = new MainGit();
//       oc.c <<= 2;
//       System.out.println("hi Git! " + oc.c);

        c = 'a';
        System.out.write(c);
        System.out.write('\n');

        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println(c);


/** File IO demo*/
//       int i;
//       // FileInputStream fin = null;
//       f = 0.3f + 0.4f;
//       System.out.println("f = "+f);
//
//       if (args.length != 1) {
//           System.out.println("ShowFile");
//           return;
//       }

//       Desktop des = new Desktop();
//       try {
//           System.out.println("try open");
//           des.open(new File("text"));
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//       catch (NullPointerException n){
//           System.out.println(n);
//       }

//       try (FileInputStream fin = new FileInputStream(args[0])) {
//
//           do {
//               i = fin.read();
//               if (i != -1) System.out.print((char) i);
//           }
//           while (i != -1);
//       } catch (IOException e) {
//           System.out.println("IOException = " + e.getMessage());
//       }


      /*  finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } */


/** instanceof */
        A a = new A();
        B b = new B();
        C c1 = new C();
        D d = new D();
//        d = a.clone();
//       c1 = (C) a;
        //d.;

        Object ar[] = {a, b, c1, d};
        for (int j = 0; j <= 3; j++) {
            if (ar[j] instanceof A) System.out.println(ar[j] + " instanceof A");
            else System.out.println(ar[j] + " not instanceof A");

            assert (ar[j] instanceof A) : ar[j] + " not instanceof A";
        }

        double x = random();
        System.out.println(x + " " + sqrt(x));
        A t1 = new A(3, 7);
        A t2 = new A(9);
        A t3 = new A();
        System.out.println("A(3,7) = " + t1.a + " " + t1.b + " A(9) = " + t2.a + " " + t2.b + " A() = " + t3.a + " " + t3.b);

        System.out.println();

/** generics  */
        GenericDemo<Byte> obb = new GenericDemo<Byte>((byte) 127);
        obb.ShowG();
        byte v = obb.getObg();
        System.out.println("v = " + v);

        GenericDemo<Character> obc = new GenericDemo('X');
        obc.ShowG();
        char vc = obc.getObg();
        System.out.println("vc = " + vc + "\n");

        Byte barr[] = {5, 5, 5};
        RestrectedGeneric<Byte> bob = new RestrectedGeneric<Byte>(barr);
        System.out.println("Average = " + bob.mid());
        Integer iarr[] = {5, 5, 5};
        RestrectedGeneric<Integer> iob = new RestrectedGeneric<Integer>(iarr);
        System.out.println("Average = " + iob.mid());
        Double darr[] = {5.7, 5.9, 5.3};
        RestrectedGeneric<Integer> dob = new RestrectedGeneric(darr);
        System.out.println("Average = " + dob.mid());

        System.out.println("Average value of bob and iob");
        if (bob.samemid(iob))
            System.out.println("Equal");
        else System.out.println("Not equal");
        System.out.println("Average value of iob and dob");
        if (iob.samemid(dob))
            System.out.println("Equal");
        else System.out.println("Not equal");


/**
 * Quizful test
 */

        java.util.Date dutil = new java.util.Date();
        System.out.println(dutil.toString());


        Boolean bb = new Boolean("true");
        System.out.println(bb);

        NativeDemo no = new NativeDemo();
        no.absM();
//        no.da;
        NativeEx neo = new NativeEx();
        neo.absM();
        // if (no instanceof(Integer))

        AbsractClass ao;

        try {
            System.out.println(new TestNPE().handle(new Formatter(), null));
        } catch (NullPointerException e) {
            System.out.println(e);
        }


        try {
            MainGit.sqr5(67.6);
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        int a1 = 0xFF0;
        int b1 = 0xF0F;
        int c2 = 0x0FF;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println(a1 | b1);
        c2 = a1 = (a1 ^ b1 | a1 & b1) ^ c2;
        System.out.println((c2 | a1) ^ (c2 & a1));

        String s[] = {"a", "b", "c", "d"};
        List<String> strList = Arrays.asList(s);
        System.out.println(strList);
        String[] ss = (String[]) strList.toArray();
        System.out.println(ss);

        int[] mass = {1, 2};
        List<String> list = new ArrayList(10);
        list.add("03");
        list.add("04");

        //  "." change value
        System.out.println("." + mass.length + list.size());

        System.out.println(((CheckGeneric) new MainGit()).text);


        try {
            new MainGit().new B1();
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            new MainGit().new A1();
        }

        //reflection power!
        MainGit nullReferenceTest = null;
        System.out.println(MainGit.class.getName().replaceAll("MainGit", "Hello, World from reflections!"));

        if (System.out.printf("Hello world\n".intern()) == null) {
        }

//        Set<String> set = new HashSet<>();
//        set.add("A");
//        set.add("B");
//        // Преобразование.
//        List<String> list = new ArrayList<>(set);

        System.out.println(3.45 % 1.24);

        Double dh1 = Double.MAX_VALUE;
        Double dh2 = Double.MAX_VALUE;
        System.out.println(dh1.hashCode());
        dh2 = dh2 + 100000000000000000000000000.1;
        System.out.println(dh2.hashCode());
        System.out.println(dh2.equals(dh1));
        System.out.println(dh1.hashCode() == dh2.hashCode());

        int i = 5;
        i = i++ + ++i;
        System.out.println(i);

        int v1 = 1;
        long v2 = 2;
        v1 = (int) (v1 + v2);
//        int v1=1; long v2=2; v1+=v2;

        System.out.println(Float.NaN == Float.NaN);
        double valueOne = -0.0;
        double valueTwo = 0.0;
//        System.out.println(Double.compare(valueOne,valueTwo));
        System.out.println(Double.valueOf(valueOne).equals(valueTwo));

        double sh = .4;
        System.out.println(.6);

        MainGitImpl exx = new MainGitImpl() {
            @Override
            public int kk(int k) {
                super.kk(k);
                return this.k;
            }
        };
        System.out.println(exx.kk(7));


        MainGit omg = new MainGit();
        //omg.equals()

        new EmployeeExt().testGetSet();

        System.out.println(MainGit.hashcode());

        System.err.println(44);

        int u = 33;
        double u2 = 0;
        u = (int) (u2 + 3);
        System.out.println(u);

        Singleton.getInstance();

// Reflections POWER!!! Access to private fields
        try {
            EmployeeExt oemp = new EmployeeExt();
            Field ref = EmployeeExt.class.getDeclaredField("jj".toString());
            ref.setAccessible(true);
            String refval = (String) ref.get(oemp);
            System.out.println(refval);


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

//        Observable;

        long lo = 13L;
        int int1 = 13;
        float flo = 13;

        String s1 = "test.".toUpperCase()
            .toLowerCase()
            .concat("+str1")
            .toUpperCase();
        System.out.println(s1);


        BigInteger abig = BigInteger.valueOf(100);


//        try {
//            return;
//        } finally {
//            System.out.println("finally");
//        }

        System.out.println();

//        MyThread mt = new MyThread();
//        (new Thread(mt)).start();
//        (new Thread(mt)).start();

        Integer xxx = new Integer("25");
        int xx = 25;
        if (xxx.equals(xx)) System.out.println(" 25 !!!!");

        MainGit.TestInnerClass inner = new MainGit().new TestInnerClass("HAHAHA");
        System.out.println(inner);

        char sss = 0;
        String fg = null;


        /**
         * Proxy test
         */
        Object[] elements = new Object[1000];
        for (int j = 0; j < elements.length; j++) {
            Integer value = j + 1;
            InvocationHandler handler = new TraceHandler(value);

//                MainGit opa = (MainGit) Proxy.newProxyInstance(MainGit.class.getClassLoader(),
//                new Class<?>[] { MainGit.class },
//                handler);

        }


    }

    public static void main() {
        Boolean bb = new Boolean("/true");
        System.out.println(bb);
    }


//    <Y extends String> MainGit(Y m) {
//        String s = m.toString();
//        System.out.println(s);
//    }

    public static double sqr1(double arg) {
        return arg;
    }

    //    public static double sqr2(double arg) {
//        while (true);
//    }
    public static double sqr3(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;
        }
        return arg;
    }

    public static double sqr5(double arg) {
        throw new RuntimeException();
    }

    static public int hashcode() {
        return 1;
    }

    @Override
    public int someM(double dd) {
        return 0;
    }

    public double sqr4(double arg) {
        int k = 1;
        return k;
    }

    void absM() {
        System.out.println("MainGit override absM");
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!super.equals(obj)) return true;
        if (this.getClass() != obj.getClass()) return true;
        return (boolean) obj;
    }

    void ReleaseTestInnerClass() {
        new TestInnerClass("Opa");
    }

    class A1 {
        String str = "s1";

        //        new MainGit();
        A1() {
            strinfo();
        }

        void strinfo() {
            System.out.println(str + " - " + str.length());
        }
    }

    class B1 extends A1 {
        String str = "s23";

        void strinfo() {
            System.out.println(str + " - " + str.length());
        }
    }

    public class TestInnerClass {
        TestInnerClass(String s) {
            s = callme;
            System.out.println(s);
        }
    }


}
