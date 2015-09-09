import Generics.GenericDemo;
import Generics.RestrectedGeneric;

import java.awt.*;
import java.awt.geom.RectangularShape;
import java.io.*;
import java.util.Locale;

import static java.lang.Math.*;

public class  MainGit<G extends Comparable> implements CheckGeneric{



    public G heh() {
        return null;
    }

    int c = 1;
    transient char tc = 'h';
    volatile float ff = 7;



    <Y extends String> MainGit(Y m) {
       String s = m.toString();
       System.out.println(s);
   }

  static <F, V extends F> void genMethod(F x, V a[]){
       System.out.println(x.getClass()+a.toString());

    }


    public static void main(String[] args) {

        new MainGit("gogogo");
        Integer arg[] = {1,2,3,4};
        MainGit.genMethod(2,arg);

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
           if (ar[j] instanceof A) System.out.println(ar[j]+" instanceof A");
           else System.out.println(ar[j]+" not instanceof A");

           assert (ar[j] instanceof A) : ar[j]+" not instanceof A";
       }

double x = random();
       System.out.println(x + " " + sqrt(x));
        A t1 = new A(3,7);
        A t2 = new A(9);
        A t3= new A();
        System.out.println("A(3,7) = "+t1.a+" "+t1.b+" A(9) = "+t2.a+" "+t2.b+" A() = "+t3.a+" "+t3.b);

        System.out.println();

/** Generics demo */
        GenericDemo<Byte> obb = new GenericDemo<Byte>((byte) 127);
        obb.ShowG();
        byte v = obb.getObg();
        System.out.println("v = "+v);

        GenericDemo<Character> obc = new GenericDemo('X');
        obc.ShowG();
        char vc = obc.getObg();
        System.out.println("vc = "+vc+"\n");

        Byte barr[] = {5,5,5};
        RestrectedGeneric<Byte> bob = new RestrectedGeneric<Byte>(barr);
        System.out.println("Average = " + bob.mid());
        Integer iarr[] = {5,5,5};
        RestrectedGeneric<Integer> iob = new RestrectedGeneric<Integer>(iarr);
        System.out.println("Average = " + iob.mid());
        Double darr[] = {5.7,5.9,5.3};
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





   }

    static {
        byte ids = 8;
    }



}
