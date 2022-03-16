package FileDemo;

import java.io.File;
import java.io.IOException;

public class FileBasic {
    public static void main(String[] args) throws IOException {

        File f = new File("abc.txt"); // here f references to abc.txt if it exits
        System.out.println(f.exists()); // returns boolean value regardless if file is present or not
        f.createNewFile(); // this line will create a file
        System.out.println(f.exists());
        File f1 = new File("Hello");
        System.out.println(f1.exists());
        f1.mkdir(); // this will create a directory.
        System.out.println(f1.exists());

    }
}
