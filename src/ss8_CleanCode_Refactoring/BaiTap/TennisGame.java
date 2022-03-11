package ss8_CleanCode_Refactoring.BaiTap;

public class TennisGame {

    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String HYPHEN_MARK = "-";

    public static String getScore(String player1, String player2, int player1Score, int player2Score) {
        String scoreDisplay = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            scoreDisplay = displayScoreAll(player1Score);
        } else if (player1Score >= 4 || player2Score >= 4) {
            scoreDisplay = displayScoreToWin(player1Score, player2Score);
        } else {
            scoreDisplay = displayScorePerPlayer(player1Score, player2Score, scoreDisplay);
        }
        return scoreDisplay;
    }

    public static String displayScorePerPlayer(int player1Score, int player2Score, String scoreDisplay) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1Score;
            else {
                scoreDisplay += HYPHEN_MARK;
                tempScore = player2Score;
            }
            scoreDisplay = compareScore(scoreDisplay, tempScore);
        }
        return scoreDisplay;
    }

    public static String compareScore(String scoreDisplay, int tempScore) {
        switch (tempScore) {
            case 0:
                scoreDisplay += LOVE;
                break;
            case 1:
                scoreDisplay += FIFTEEN;
                break;
            case 2:
                scoreDisplay += THIRTY;
                break;
            case 3:
                scoreDisplay += FORTY;
                break;
        }
        return scoreDisplay;
    }

    public static String displayScoreToWin(int player1Score, int player2Score) {
        String scoreDisplay;
        int minusResult = player1Score - player2Score;
        if (minusResult == 1) scoreDisplay = ADVANTAGE_PLAYER_1;
        else if (minusResult == -1) scoreDisplay = ADVANTAGE_PLAYER_2;
        else if (minusResult >= 2) scoreDisplay = WIN_FOR_PLAYER_1;
        else scoreDisplay = WIN_FOR_PLAYER_2;
        return scoreDisplay;
    }

    public static String displayScoreAll(int player1Score) {
        String scoreDisplay;
        switch (player1Score) {
            case 0:
                scoreDisplay = LOVE_ALL;
                break;
            case 1:
                scoreDisplay = FIFTEEN_ALL;
                break;
            case 2:
                scoreDisplay = THIRTY_ALL;
                break;
            case 3:
                scoreDisplay = FORTY_ALL;
                break;
            default:
                scoreDisplay = DEUCE;
                break;

        }
        return scoreDisplay;
    }
}
