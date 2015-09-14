import Generics.GenericDemo;
import Generics.RestrectedGeneric;
import org.omg.SendingContext.RunTime;

import java.awt.*;
import java.awt.geom.RectangularShape;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import static java.lang.Math.*;

/**
 * @author Bro
 * @version 1.1
 */
public class MainGit extends AbsractClass implements Serializable {




    int c = 1;
    transient char tc = 'h';
    volatile float ff = 7;


    <Y extends String> MainGit(Y m) {
        String s = m.toString();
        System.out.println(s);
    }

    static <F, V extends F> void genMethod(F x, V a[]) {
        System.out.println(x.getClass() + a.toString());

    }


    public static void main(String[] args) throws IOException {

        long start, end;


        new MainGit("gogogo").absM();
        Integer arg[] = {1, 2, 3, 4};
        MainGit.genMethod(2, arg);

        int c = 12;

        float f = 13.2f;

//       Integer ass;
//       MainGit oc = new MainGit();
//       oc.c <<= 2;
//       System.out.println("hi Git! " + oc.c);
/*
        Console br = new Console();
        try {
            br.readSymbol();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
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


/** instanceof demo*/
        A a = new A();
        B b = new B();
        C c1 = new C();
        D d = new D();
//       c1 = (C) a;

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

/** Generics demo */
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

/** Collections Demo */
        //ArrayList
        ArrayList<String> al = new ArrayList<>();
        al.ensureCapacity(55);
        System.out.println("Size of al = " + al.size());
        al.add("1st string");
        al.add("2d string");
        al.add(String.valueOf("3d string".charAt(5)));
        al.add(2, "insert");
        System.out.println("Size of al = " + al.size() + "\n" + al);
        al.remove(1);
        System.out.println(al);

        String os[] = new String[al.size()];
        os = al.toArray(os);
        System.out.println(os);
        String sum = null;
        for (String i : os)
            sum += i;
        System.out.println(sum);

        //LinkedList
        LinkedList<Double> ll = new LinkedList<>();
        ll.add(8.5);
        ll.add(11.5);
        ll.add(3.5);
        ll.addLast(55.5);
        ll.addFirst(0.5);
        System.out.println(ll);
        ll.set(3, ll.get(3) + 60.5);
        System.out.println("LinkedList = " + ll);

        //HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("B");
        hs.add("D");
        hs.add("C");
        hs.add("D");
        System.out.println("HashSet = " + hs);

        //LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("B");
        lhs.add("D");
        lhs.add("C");
        lhs.add("D");
        System.out.println("LinkedHashSet = " + lhs);

        //TreeSet
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('z');
        ts.add('x');
        ts.add('a');
        ts.add('Z');
        System.out.println("TreeSet = " + ts);
        System.out.println("TreeSet = " + ts.subSet('a', 'z'));

        //ArrayDeque
        ArrayDeque<Boolean> ad = new ArrayDeque<>(250);
        ad.add(true);
        ad.add(true);
        ad.add(true);
        ad.add(false);
        System.out.println("ArrayDeque = " + ad);

        while (ad.peek() != null)
            System.out.println(ad.pop());

        //Iterator with collections
        ListIterator<Double> ill = ll.listIterator();
        while (ill.hasNext())
            System.out.print(+ill.next() + " ");
        System.out.println();

        //For-each with collections
        double sumd = 0;
        for (double dd : ll)
            sumd += dd;
        System.out.print(sumd + " ");
        System.out.println();

//        //HashMap
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Middle", 1000.10);
        hm.put("Junior", 500.5);
        hm.put("Senior", 2000.20);

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> mm : set) {
            System.out.print(mm.getKey() + " : ");
            System.out.println(mm.getValue());
        }
        double upmid = hm.get("Middle");
        hm.put("Middle", upmid + 200);

        System.out.println("Middle new value = " + hm.get("Middle"));

        //TreeMap
        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("Middle", 1000.10);
        tm.put("Junior", 5000.5);
        tm.put("Senior", 2000.20);

        Set<Map.Entry<String, Double>> sett = tm.entrySet();
        for (Map.Entry<String, Double> mm : sett) {
            System.out.print(mm.getKey() + " : ");
            System.out.println(mm.getValue());
        }


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
            System.out.println(new TestNPE().handle(new Formatter(),null));
        }
        catch (NullPointerException e){
            System.out.println(e);
        }


try {
    MainGit.sqr5(67.6);
}
catch (RuntimeException e){
    System.out.println(e);
}


        //Map map = new Map();
        for(Object o: map.keySet()){
            System.out.println(o);
        }



        int a = 0xFF0;
        int b = 0xF0F;
        int c = 0x0FF;

        c = a = (a ^ b | a & b) ^ c;
        System.out.println((c | a) ^ (c & a));





/**
 * System, Runtime and Desktop usage
 */

//        try {
//            Desktop.getDesktop().browse(new URI("asd"));
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }


//        finally {System.out.println("Finally");}


//        System.out.println(Runtime.getRuntime().totalMemory());

//        try {
//            Runtime.getRuntime().exec("notepad");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Runtime.getRuntime().exec("notepad").destroy();
//
//        start = System.currentTimeMillis();
//
//        ProcessBuilder pr = new ProcessBuilder("notepad","testy");
//        pr.start();
//
//        end = System.currentTimeMillis();
////        System.out.println("main time = "+(end-start));
//
//        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());

//        System.out.println(System.getProperty("java.vm.name"));

        //MainGit mg = new MainGit();



    }

    public static void main() {
        Boolean bb = new Boolean("/true");
        System.out.println(bb);
    }

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
    public double sqr4(double arg) {
        int k = 1;
        return k;
    }
    public static double sqr5(double arg) {
        throw new RuntimeException();
    }


    static {
        byte ids = 8;
    }


    @Override
    void absM() {
        System.out.println("MainGit override absM");
    }



}
