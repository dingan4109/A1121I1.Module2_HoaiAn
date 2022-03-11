package ss8_CleanCode_Refactoring.BaiTap;

public class TennisGameTest {
    public static void main(String[] args) {
        TennisGame check = new TennisGame();
        String display = check.getScore("An","Ding",2,3);
        System.out.println(display);
    }
}
