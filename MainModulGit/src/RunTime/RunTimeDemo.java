package runtime;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * System, Runtime and Desktop usage
 */
public class RunTimeDemo {

    public static void main(String[] args) {

        try {
            Desktop.getDesktop().browse(new URI("asd"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        System.out.println(Runtime.getRuntime().totalMemory());

        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Runtime.getRuntime().exec("notepad").destroy();

        long start = System.currentTimeMillis();

        ProcessBuilder pr = new ProcessBuilder("notepad", "testy");
        try {
            pr.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        long end = System.currentTimeMillis();
//        System.out.println("main time = "+(end-start));

        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());
        System.out.println(System.getProperty("java.vm.name"));

    }


}
