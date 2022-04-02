package ss16_io_textfile.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFileTest2 {
    public static void writeNumber(String path) {
        Scanner input = new Scanner(System.in);
        FileWriter writer;
        try {
            writer = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            System.out.println("Input n number");
            int n = input.nextInt();
            int number;
            for (int i = 1; i <= n; i++) {
                System.out.println("input number at " + i);
                number = input.nextInt();
                String a = number + ""; //Đang xài character stream nên phải chuyển nó sang String :v
                bufferedWriter.write(a + " ");
//                bufferedWriter.write(" ");
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findTheBiggest(String path) {
        FileReader reader = null;
        try {
            reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<Integer> list = new ArrayList<>();
            int number = -1;

            while ((number = bufferedReader.read()) != -1) {
                list.add(number);
            }
            bufferedReader.close();

            int max = list.get(0);
            for(int i = 1; i < list.size();i++) {
                if(list.get(i) > max) {
                    max = list.get(i);
                }
            }
            System.out.println("Biggest value is " + max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadAndWriteFileTest1 file = new ReadAndWriteFileTest1();
        file.writeNumber("numbers.txt");
        file.findTheBiggest("numbers.txt");

    }
}
