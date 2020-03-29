package game;

/**
 * class that handles all things related to the score
 *
 * @author javonne
 *
 * */
public class Scoreboard {
    private static double score;
    private Game game;

    /**
     * constructor for score class
     *
     * @param playableCharacter the controllable character used to play the game
     * @param game the game that we are tracking the score of
     *
     * */
    public Scoreboard(PlayableCharacter playableCharacter, Game game) {
        this.game = game;
        this.score = game.getScore();

            score = (playableCharacter.getItemsCollected() * 50) / Game.getDeathcount() ;

    }

    /**
     * returns the players score
     *
     * @return double
     * */
    public static double getScore() {
        return score;
    }

    /**
     * returns a version of the score that is converted to be a string
     *
     * @return String
     *
     * */
    public static String getScoreString(){
        return String.valueOf(score);
    }

}
