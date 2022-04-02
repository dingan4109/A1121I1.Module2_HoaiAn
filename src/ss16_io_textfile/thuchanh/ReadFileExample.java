package ss16_io_textfile.thuchanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void readFileText(String filePath){
       try{
           File file = new File(filePath);

           if(!file.exists()) {
               throw new FileNotFoundException();
           }

           FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           //OR BufferedReader bufferedReader = new FileReader(file);

           String line = null;
           int sum = 0;
           while((line = bufferedReader.readLine()) != null) {
               sum += Integer.parseInt(line);
           }
           bufferedReader.close();
           System.out.println("Total: " + sum);
       }catch(Exception e) {
           System.out.println("File error!");
       }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input  file path");
        String filePath = input.nextLine();

        readFileText(filePath);
    }
}
