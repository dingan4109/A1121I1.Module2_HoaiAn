package ss16_io_textfile.baitap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCvsFile {
    public void readFile(String filepath) {
        try{
            File file = new File(filepath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = null;
            final String COMMA = ",";
            while((line = br.readLine()) != null) {
                String[] str = line.split(COMMA);
                System.out.println(str[0] + COMMA + str[1] + COMMA + str[2] + "\n");;
            }

            br.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ReadCvsFile readCvsFile = new ReadCvsFile();
        readCvsFile.readFile("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\ss16_io_textfile\\baitap\\CsvFile.csv");
    }
}
