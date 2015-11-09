package streamio;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Bro on 13.10.15.
 */
public class SearchDir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File f;
        String path, file;
        boolean result = false;
        System.out.println("f:\\log\\");
        path = input.nextLine();
        f = new File(path + ".");
        System.out.println("trace");
        file = input.nextLine();
        File[] files = f.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].toString().equals(path + ".\\" + file) && files[i].isFile()) {
                result = true;
                break;
            }
        }
        if (result == true)
            System.out.println("File located in the folder");
        else System.out.println("File was not found ");
    }
}
