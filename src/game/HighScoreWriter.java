package game;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Demonstrates how high-score data can be written to a text file.
 */
public class HighScoreWriter {
    private String fileName;

    /**
     *  constructor for HighScoreWriter object
     *
     * @param fileName the path to get to the location of the .txt file that score saves go to
     *
     * */
    public HighScoreWriter(String fileName) {
        this.fileName = fileName;
    }

    /**
     * call this method to save a players score
     *
     * @param name name of player who acieved a score
     * @param score score of player
     * */
    public void writeHighScore(String name, int score) throws IOException {
        boolean append = true;
        FileWriter writer = null;
        try {
            writer = new FileWriter(fileName, append);
            writer.write(name + "," + score + "\n");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

}
