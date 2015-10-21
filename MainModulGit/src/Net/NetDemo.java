package Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Bro on 24.09.15.
 */
public class NetDemo {

    public static void connectToHost() throws IOException {
        try (Socket s = new Socket("127.0.0.1", 445)) {
            s.setSoTimeout(3000);
            InputStream instream = s.getInputStream();
            Scanner in = new Scanner(instream);

//          System.out.println( instream.read());
            while (in.hasNextLine())
                System.out.println(in.nextLine());
        }

    }


    public static void connectToServer() throws IOException {

        try (ServerSocket s = new ServerSocket(777)) {
            try (Socket income = s.accept()) {
                InputStream instream = income.getInputStream();
                OutputStream outstream = income.getOutputStream();
                try (Scanner in = new Scanner(instream)) {
                    PrintWriter out = new PrintWriter(outstream, true);
                    out.println("Hi! Press 'bb' to exit");
                    boolean done = false;
                    while (!done && in.hasNextLine()) {
                        String line = in.nextLine();
                        out.println("Echo " + line);
                        if (line.trim().equals("bb")) done = true;
                    }


                }

            }

        }

    }

    public static void URLConnect() throws IOException {
        URLConnection connection = new URL("http://habrahabr.ru/").openConnection();
        connection.connect();
        Map<String, List<String>> headers = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            for (String val : entry.getValue())
                System.out.println(key + " : " + val);
        }
        System.out.println();
        System.out.println("Content type = " + connection.getContentType());
        System.out.println("Content Encoding = " + connection.getContentEncoding());
        System.out.println("Content Length = " + connection.getContentLength());
        System.out.println("Content type = " + connection.getExpiration());
        System.out.println("Content type = " + connection.getLastModified());
    }


    public static void main(String[] args) throws IOException {
        NetDemo.URLConnect();
//        NetDemo.connectToServer();
    }

}
