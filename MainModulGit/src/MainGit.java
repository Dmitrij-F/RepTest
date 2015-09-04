import java.io.*;

public class MainGit {
   int c = 1;
    public static void main(String[] args) {
        int c;
        MainGit oc = new MainGit();
        oc.c<<=2;
        System.out.println("hi Git! "+oc.c);
/*
        Console br = new Console();
        try {
            br.readSymbol();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
c='a';
        System.out.write(c);
        System.out.write('\n');

        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println(c);

/** File IO demo*/
        int i;
       // FileInputStream fin = null;

if (args.length!=1){
    System.out.println("ShowFile");
    return;
}
        try (FileInputStream fin = new FileInputStream(File.createTempFile("str1","str2"))){

            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }
            while (i != -1);
        }
        catch (IOException e) {
            System.out.println("IOException = " + e.getMessage());
        }

      /*  finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } */

    }


    static {
        byte ids = 8;
    }


}
