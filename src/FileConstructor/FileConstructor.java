package FileConstructor;
import java.io.File;
import java.io.IOException;

public class FileConstructor {
    public static void main(String[] args) throws IOException {

        // code to create a file named hello.txt in current working directory.
        File f = new File("hello.txt");
        f.createNewFile();

        // code to create a directory named with himanshu in current working directory and create a file named abc.txt in that directory.
        File f1 = new File("himanshu");
        f1.mkdir();
        //File f2 = new File("himanshu", "abc.txt"); OR
        File f2 = new File(f1, "abc.txt");
        f2.createNewFile();

        // code to create a file named with demo.txt in My Files folder
        File f3 = new File("Hello", "demo.txt");
        f3.createNewFile();


    }
}
