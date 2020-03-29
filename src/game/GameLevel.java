package game;

import city.cs.engine.World;
import org.jbox2d.common.Vec2;

// superclass of each gamelevel to
// prevent code duplication
public abstract class GameLevel extends World {
    private PlayableCharacter playableCharacter;




    /**
     * these commands are called every time you start a new game
     *
     * @param game the game you have started
     * */
    public void populate(Game game) {
        playableCharacter = new PlayableCharacter(this, 0, false, game);
        playableCharacter.setPosition(startPosition());
        Portal portal = new Portal(this);
        portal.setPosition(doorPosition());
        portal.addCollisionListener(new DoorListener(game));
    }

    /**
     * this method will allow you to set a current player to a gameworld
     *
     * @param playableCharacter the playable character that is controlled. A new playable charectar is created
     * every level so use this to update your controller or mouse handler etc
     *
     * */
    public void setPlayer(PlayableCharacter playableCharacter){
        this.playableCharacter = playableCharacter;
    }

    public PlayableCharacter getPlayableCharacter(){
        return playableCharacter;
    }

    public PlayableCharacter getPlayer(){
        return playableCharacter;
    }

    public abstract Vec2 startPosition();
    public abstract Vec2 doorPosition();
    public abstract boolean isCompleted();
    public abstract int getLevel();
}

