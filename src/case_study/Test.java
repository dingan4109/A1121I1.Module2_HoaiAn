package case_study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static final String SEPERATOR = ",";

    public static List<String[]> read(String filepath){
        List<String[]> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            String line = null;
            String values[];
            while((line = bufferedReader.readLine()) != null && !line.equals("")) {
                values = line.split(SEPERATOR);
                list.add(values);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void write(String filepath, List<String[]> data) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath))) {
            for(String[] line : data) {
                for(int i = 0; i<line.length;i++) {
                    if(i!=0) {
                        bufferedWriter.write(SEPERATOR);
                    }
                        bufferedWriter.write(line[i]);
                }
                bufferedWriter.newLine();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
