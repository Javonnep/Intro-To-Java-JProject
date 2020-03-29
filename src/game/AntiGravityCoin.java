package game;

import city.cs.engine.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

/**
 * The type Anti gravity coin.
 */
// body to lower gravity
public class AntiGravityCoin extends StaticBody {
    private static final Shape coinShape = new PolygonShape(
            -0.56f,0.5f, -0.564f,-0.498f, 0.564f,-0.5f, 0.56f,0.493f);
    private static final BodyImage coinImage = new BodyImage("data/heyBlue.png");

    /**
     * Instantiates a new Anti gravity coin.
     *
     * @param world the world
     */
    public AntiGravityCoin(World world) {
        super(world, coinShape);
        addImage(coinImage);
//      code to change gravity for playableCharacter object on line
//       of Game class
    }
    
    @Override
    public void destroy() {
        Sounds.getCoinSound().play();
        super.destroy();
    }
    
}

