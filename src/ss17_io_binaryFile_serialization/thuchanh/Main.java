package ss17_io_binaryFile_serialization.thuchanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream input = null;
        OutputStream output = null;
        try{
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            /*That is called buffering and ,each time you overwrite the contents of the buffer each time you go through the loop.
            Simply reading file in chunks, instead of allocating memory for the file content at a time.
            Reason behind this to do is you will become a clear victim of OutOfMemoryException if file is too large.
            And coming to the specific question, That is need not to be 1024, even you can do with 500. But a minimum 1024 is a common usage.*/
            int length;

            while((length = input.read(buffer)) > 0 /*OR != -1*/) {
                output.write(buffer,0,length);
            }
        }finally {
            input.close();
            output.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String source = scanner.nextLine();

        System.out.print("Enter destination file: ");
        String dest = scanner.nextLine();

        File sourceFile = new File(source);
        File destFile = new File(dest);

        try{
//            copyFileUsingJava7Files(sourceFile, destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy completed");
        }catch (IOException e) {
            System.out.println("Can't copy file");
            System.out.println(e.getMessage());
        }
    }
}
