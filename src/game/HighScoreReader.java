package game;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how high-score data can be read from a text
 * file and printed to the terminal.
 *
 * @author javonne
 */
public class HighScoreReader {

    private String fileName;

    /**
     * Initialise a new HighScoreReader
     *
     * @param fileName the name of the high-score file
     */
    public HighScoreReader(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Read the high-score data from the high-score file and print it to
     * the terminal window.
     *
     * @throws IOException
     *
     * @return List<string>
     */
    public List<String> readScores() throws IOException {
        List<String> scores = new ArrayList<>();
        FileReader fr = null;
        BufferedReader reader = null;
        try {
            System.out.println("Reading " + fileName + " data/score.txt");
            fr = new FileReader(fileName);
            reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                // file is assumed to contain one name, score pair per line
                String[] tokens = line.split(",");
                String name = tokens[0];
                int score = Integer.parseInt(tokens[1]);
                scores.add("Name: " + name + ", Score: " + score);
                line = reader.readLine();
            }
            System.out.println("...done.");
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
        return scores;
    }

    /**
     * returns a sorted array of the five most recent scores
     *
     *
     *
     * */
    public ArrayList<String> recentFiveScores() throws IOException {
        FileReader fr = null;
        BufferedReader reader = null;
        String line = "";
        String[] recentFive = {};
        ArrayList recents = new ArrayList(){};
        try {
            System.out.println("Reading " + fileName + " data/score.txt");
            fr = new FileReader(fileName);
            reader = new BufferedReader(fr);
            line = reader.readLine();
            int i = 0;
            while (line != null && i < 5) {
                // file is assumed to contain one name, score pair per line
                String[] tokens = line.split(",");
                String name = tokens[0];
                int score = Integer.parseInt(tokens[1]);
                System.out.println("Name: " + name + ", Score: " + score);
                line = reader.readLine();
                recents.add(line);
                i++;
            }
            System.out.println("...done.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
        return recents;
    }
}
