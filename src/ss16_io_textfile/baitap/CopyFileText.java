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
        try {
            File file = new File(filepath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            for(String line : str) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> str = copyFileText.readSrcFile("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\ss16_io_textfile\\baitap\\CopyTestFile.txt");
        copyFileText.copySrcFile("CopySrcFile",str);
    }
}
