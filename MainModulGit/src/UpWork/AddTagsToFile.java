package UpWork;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * Created by Bro on 21.10.15.
 */
public class AddTagsToFile {


    public static void main(String[] args) throws IOException {

        Path path = new File("SetAtrFile.txt").toPath();
        UserDefinedFileAttributeView view = Files
            .getFileAttributeView(path, UserDefinedFileAttributeView.class);
        System.out.println(view.list());
        view.write("creator",
            Charset.defaultCharset().encode("hhhh"));



//        Path path = new File("SetAtrFile.txt").toPath();
//
//        try{
//
//            Files.setAttribute(path, "acl:owner");
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        try{
//            System.out.println(Files.getAttribute(path, "encryption used"));
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }


    }
}
