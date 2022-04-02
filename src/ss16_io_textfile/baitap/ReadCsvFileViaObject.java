package ss16_io_textfile.baitap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFileViaObject {
    public static List<Countries> readCsvFile(String filepath) {
        List<Countries> list = new ArrayList<>();

        try{
            File file = new File(filepath);

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = br.readLine()) != null) {
                final String COMMA = ",";
                String[] str = line.split(COMMA);
                int id = Integer.parseInt(str[0]);
                String code = str[1];
                String name = str[2];
                Countries country = new Countries(id,code,name);
                list.add(country);
            }
            br.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public static void main(String[] args) {
        ReadCsvFileViaObject readCsvFileViaObject = new ReadCsvFileViaObject();
        List<Countries> countriesList = readCsvFileViaObject.readCsvFile("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\ss16_io_textfile\\baitap" +
                "\\CsvFile.csv");

        for(Countries country : countriesList) {
            System.out.println(country.toString());
        }
    }

}
