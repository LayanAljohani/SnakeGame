import java.io.*;
import java.nio.file.*;


public class HighScoreManager {

    private static HighScoreManager instance;

    private static final String HIGH_SCORE_FILE = "highscore.dat";
    private int highScore;

    private HighScoreManager() {
        loadHighScore();
    }

    public static HighScoreManager getInstance() {
        if (instance == null) {
            instance = new HighScoreManager();
        }
        return instance;
    }

   
    private void loadHighScore() {
        try {
            Path path = Paths.get(HIGH_SCORE_FILE);
            if (Files.exists(path)) {
                String content = Files.readString(path);
                highScore = Integer.parseInt(content.trim());
            } else {
                highScore = 0;
            }
        } catch (IOException | NumberFormatException e) {
            highScore = 0;
        }
    }

  
    private void saveHighScore() {
        try {
            Files.writeString(
                Paths.get(HIGH_SCORE_FILE),
                String.valueOf(highScore)
            );
        } catch (IOException e) {
            System.err.println(
                "Failed to save high score: " + e.getMessage()
            );
        }
    }

   
    public int getHighScore() {
        return highScore;
    }

  
    public boolean updateHighScore(int newScore) {
        if (newScore > highScore) {
            highScore = newScore;
            saveHighScore();
            return true;
        }
        return false;
    }

  
    public void resetHighScore() {
        highScore = 0;
        saveHighScore();
    }
}