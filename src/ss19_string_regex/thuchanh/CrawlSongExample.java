package ss19_string_regex.thuchanh;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class CrawlSongExample {
    public static void main(String[] args) {
        try{
            URL url = new URL("");
            BufferedInputStream br = new BufferedInputStream(new FileInputStream(url.openStream()))
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
