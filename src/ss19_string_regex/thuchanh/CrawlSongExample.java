package ss19_string_regex.thuchanh;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlSongExample {
    public static void main(String[] args) {
        URL url;
//        Reader file;
        try{
            url = new URL("");
//            file = new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
