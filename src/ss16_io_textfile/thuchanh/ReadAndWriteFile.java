package ss16_io_textfile.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line = null;
            while((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for(int i = 0; i < numbers.size();i++) {
            if(numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public void writeFile(String filePath, int max) {
        try {
            File file = new File(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String str = max + "";
            bufferedWriter.write(str);

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndWriteFile file = new ReadAndWriteFile();
        List<Integer> list = file.readFile("E:\\A1121I1\\Module2\\A1121I1" +
                ".Module2_HoaiAn\\src\\ss16_io_textfile\\baitap\\test.txt");
        int max = file.findMax(list);
        file.writeFile("fileMax",max);
    }
}
