package FileWriter;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt", false);
        fw.write(72);
        fw.write("imanshu\nBhatt");
        fw.write('\n');
        char[] ch = {'a', 'b', 'c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();

        /*
        Disadvantage of FileWriter:
        we have to manually insert line separater \n else or data will be in one line.
        and it is difficult for programmers
         */


    }
}
