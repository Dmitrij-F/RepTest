import Generics.GenericDemo;
import Generics.RestrectedGeneric;
import org.xml.sax.SAXException;

import javax.smartcardio.Card;
import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.regex.Pattern;

import static java.lang.Math.*;

/**
 * @author Bro
 * @version 1.1
 */
public class MainGit extends AbsractClass implements Serializable, CheckGeneric, Check,Runnable {

    /**
     * @param dd
     * @return
     */



    @Override
    public int someM(double dd) {
        return 0;
    }

    Thread ot1 = new Thread();

    @Override
    public void run() {
        synchronized (ot1){}
        ot1.start();

    }

    class A1{
        String str = "s1";
//        new MainGit();
        A1(){
            strinfo();
        }

        void strinfo() {
            System.out.println(str+" - "+str.length());
        }
    }
    class B1 extends A1{
        String str = "s23";
        void strinfo() {
            System.out.println(str+" - "+str.length());
        }
    }


    int c = 1;
    transient char tc = 'h';
    volatile float ff = 7;


//    <Y extends String> MainGit(Y m) {
//        String s = m.toString();
//        System.out.println(s);
//    }

    static <F, V extends F> void genMethod(F x, V a[]) {
        System.out.println(x.getClass() + a.toString());

    }


    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        int[] ii = new int[12];

        long start, end;

        //new MainGit("gogogo").absM();
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
        List<String> al = new ArrayList<>();
       // al.ensureCapacity(55);
        System.out.println("Size of al = " + al.size());
        al.add("1st string");
        al.add("2d string");
        al.add(String.valueOf("3d string".charAt(5)));
        al.add(2, "insert");

        System.out.println("Size of al = " + al.size() + "\n" + al);
        al.remove(1);
       if (al.contains("2st string")) System.out.println("contain");
        else System.out.println("not contain");
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
        ll.add(88.5);
        ll.add(11.5);
        ll.add(3.5);
        ll.addLast(55.5);
        ll.addFirst(0.5);
        ll.set(2, 54.1);
        System.out.println("get index 4 = "+ll.get(4));
        ll.set(3, ll.get(3) + 60.5);
        System.out.println("LinkedList = " + ll);
        Collections.sort(ll);
        System.out.println("LinkedList sort = " + ll);
        int ki = Collections.binarySearch(ll,111.5);
        if (ki > 0) System.out.println(ll.get(ki));
        else {
            System.out.println(ki);
            ll.add(-ki-1,111.5);
            System.out.println("ll + ki = "+ll);
        }
        System.out.println("Max ll = " + Collections.max(ll));
        Collections.shuffle(ll);
        System.out.println("Shuffle ll = "+ll);
        List<Double> sub = ll.subList(1,2);
        System.out.println(sub);





        //HashSet
        HashSet<String> hs = new HashSet<>();
//        hs.add("C");
//        hs.add("D");
//        hs.add("B");
//        hs.add("A");
//        System.out.println(hs.hashCode());
//        System.out.println("HashSet = " + hs);
//        for (String el : hs){
//           if (el.equals("Bg")) System.out.println(el);;
//        }
//        System.out.println("HashSet = " + hs);

//        Iterator<String> ihs = hs.iterator();
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String word = in.next();
//            hs.add(word);
//        }
//        System.out.println(hs);


        char[] cc = "jk".toCharArray();
        System.out.println("String to char = "+cc[0]+" "+cc[1]);
//
//ArrayList<String> la = new ArrayList<>(hs);
//        System.out.println("HashSet to ArrayList = "+la);


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

        //TreeSet example with own class and Comparator
SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("ololo",11));
        parts.add(new Item("kokoko",100500));
        parts.add(new Item("hehehe",42));
        System.out.println("Item = "+parts);
SortedSet<Item> srtbydesc = new TreeSet<>(new Comparator<Item>() {
    public int compare(Item a, Item b) {
        String deskA = a.getDescription();
        String deskB = b.getDescription();
        return deskA.compareTo(deskB);
    }
});
        srtbydesc.addAll(parts);
        System.out.println("Item with Comparator = "+srtbydesc);

        //ArrayDeque
        ArrayDeque<Boolean> ad = new ArrayDeque<>(250);
        ad.add(true);
        ad.add(true);
        ad.add(true);
        ad.add(false);
        System.out.println("ArrayDeque = " + ad);
        while (ad.peek() != null)
            System.out.println(ad.pop());

        //Prioruty Queue
        PriorityQueue<GregorianCalendar> pq = new PriorityQueue<>();
        pq.add(new GregorianCalendar(1983,Calendar.DECEMBER,20)); // My date
        pq.add(new GregorianCalendar(1989,Calendar.FEBRUARY,16)); // Ded
        pq.add(new GregorianCalendar(2002,Calendar.JUNE,14)); // Kentik
        for (GregorianCalendar date : pq){
            System.out.println("Prioruty Queue = "+date.get(Calendar.YEAR));
        }
        while (!pq.isEmpty()){
            System.out.println("Prioruty Queue = "+pq.remove().get(Calendar.YEAR));
        }
//        System.out.println(pq);



//        //HashMap
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Middle", 1000.10);
        hm.put("Junior", 500.5);
        hm.put("Senior", 2000.20);
//        Set<String> sk = new hm.keySet();
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (HashMap.Entry<String, Double> mm : set) {
            System.out.print(mm.getKey() + " : ");
            System.out.println(mm.getValue());
        }
        double upmid = hm.get("Middle");
        hm.put("Middle", upmid + 200);
        System.out.println("Middle new value = " + hm.get("Middle"));

        Map<String, String> staff = new HashMap<>();
        staff.put("00-111", "Vasja");
        staff.put("00-112", "Kolja");
        staff.put("00-113", "Ivan");
        System.out.println("Emplyers = " + staff);
        staff.remove("00-111");
        staff.put("00-113", "Sanja");
        System.out.println("Kolja = "+staff.get("00-112"));
        for (Map.Entry<String, String> entry : staff.entrySet())
            System.out.println("key = "+entry.getKey()+"value = "+entry.getValue());



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

        //Iterator
//        int aa[] = {1, 2, 3, 4};
//        List<Integer> intList = aa[];
//        Iterator<Integer> itr = intList.iterator();
//        System.out.println("ITERATOR");
//        while (itr.hasNext())
//            System.out.println(itr.next());

        //ListIterator
        ListIterator<Double> ill = ll.listIterator();
        System.out.println("ListIterator");
        while (ill.hasNext()) {
            ill.next();
            //colle.remove();
        }
        while (ill.hasNext())
            System.out.print(+ill.next() + " ");

        System.out.println();

        //For-each with collections
        double sumd = 0;
        System.out.println("For-each");
        for (double dd : ll){
            sumd += dd;
        }
        System.out.print(sumd + " ");
        System.out.println();


        String[] ca = new String[5];
        List<String> names = Arrays.asList("Jo","Jon","Kate");
        List<String> settings = Collections.nCopies(55, "Cop");

        Hashtable<String, String> hi;


/**
 * XML demo
 */
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        File ff = new File("");
//
//
//            DocumentBuilder builder = factory.newDocumentBuilder();
//            Document doc = builder.parse(ff);
//
//
//        Element root = doc.getDocumentElement();
//        NodeList children = root.getChildNodes();

/**
 * Regex demo
 */










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


//        Map map = new Map();
//        for(Object o: map.keySet()){
//            System.out.println(o);
//        }


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
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            new MainGit().new A1();
        }

        //reflection power!
        MainGit nullReferenceTest = null;
        System.out.println(MainGit.class.getName().replaceAll("MainGit", "Hello, World from reflections!"));

        if(System.out.printf("Hello world\n".intern()) == null){}

//        Set<String> set = new HashSet<>();
//        set.add("A");
//        set.add("B");
//        // Преобразование.
//        List<String> list = new ArrayList<>(set);

        System.out.println(3.45 % 1.24);

        Double dh1 = Double.MAX_VALUE;
        Double dh2 = Double.MAX_VALUE;
        System.out.println(dh1.hashCode());
        dh2 = dh2 +100000000000000000000000000.1;
        System.out.println(dh2.hashCode());
        System.out.println(dh2.equals(dh1));
        System.out.println(dh1.hashCode() == dh2.hashCode());

        int i = 5;
        i = i++ + ++i;
        System.out.println(i);

        int v1=1; long v2=2; v1= (int) (v1+v2);
//        int v1=1; long v2=2; v1+=v2;

        System.out.println(Float.NaN==Float.NaN);
        double valueOne = -0.0;
        double valueTwo = 0.0;
//        System.out.println(Double.compare(valueOne,valueTwo));
        System.out.println(Double.valueOf(valueOne).equals(valueTwo));

double sh = .4;
        System.out.println(.6);

MainGitImpl exx = new MainGitImpl() {
    @Override
    int kk(int k) {
        super.kk(k);
        return this.k;
    }
};
        System.out.println(exx.kk(7));





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


    static {
        System.out.println("Hi Static!");
        //System.exit(10);
    }


    void CheckColl(JMenu mm, Collection<JMenuItem> items){

    }




}
