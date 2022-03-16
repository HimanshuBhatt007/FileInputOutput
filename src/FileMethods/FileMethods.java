package FileMethods;

import java.io.File;

public class FileMethods {
    public static void main(String[] args) {

    /*
    to check whether file or directory exist
    -->f.exist();  boolean

    to create a new file
    -->f.createNewFile(); boolean

    to create a new directory
    -->f.mkdir(); boolean

    to check if a file represent a physical file or not
    -->f.isFile();  boolean

    to check if a file represent a physical directory or not
    -->f.isDirectory();  boolean

    to check how many files are there in a directory
    -->String[] s = f.list(); return a string array

    how to many characters are there in a file
    -->long l = f.length();

    to delete a file
    -->f.delete();  boolean

     */

        // to display names of files and directories present in a specific folder
        File f = new File("Hello");
        String[] s = f.list();
        int count = 0;
//        for (String s1 : s) {
//            count++;
//            System.out.println(s1);
//        }

        // to display all files name present in a specific directory
        for(String s1:s){
            File f1 = new File(f, s1);
            if(f1.isFile()){
                count++;
                System.out.println(s1);
            }

        }

        // to display all files name present in a specific directory
        for(String s1:s){
            File f1 = new File(f, s1);
            if(f1.isDirectory()){
                count++;
                System.out.println(s1);
            }

        }





    }
}