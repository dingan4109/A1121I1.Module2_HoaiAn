package ss16_io_textfile.baitap;

import java.io.*;
import java.util.*;

public class CopyFileText {
    public List<String> readSrcFile(String filepath) {
        List<String> str = new ArrayList<>();
        try{
            File file = new File(filepath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;

            while((line = br.readLine()) != null) {
                str.add(line);
            }

            br.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return str;
    }

    public void copySrcFile(String filepath, List<String> str) {
        File file = null;
        BufferedWriter bw = null;
        try {
            file = new File(filepath);
            bw = new BufferedWriter(new FileWriter(file));

            int sum = 0;

            for(String line : str) {
                sum += line.length(); //exclude \n
                bw.write(line);
                bw.newLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> str = copyFileText.readSrcFile("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\ss16_io_textfile\\baitap\\CopyTestFile.txt");
        copyFileText.copySrcFile("CopySrcFile",str);
    }
}
