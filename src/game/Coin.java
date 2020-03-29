package game;

import city.cs.engine.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

// Coin body implemented in levels 1-3, as
// well as the sound it creates when interacted with
public class Coin extends StaticBody {
    private static final Shape coinShape = new PolygonShape(
            -0.56f,0.5f, -0.564f,-0.498f, 0.564f,-0.5f, 0.56f,0.493f);
    private static final BodyImage coinImage = new BodyImage("data/heyRed.png");


    public Coin(World world) {
        super(world, coinShape);
        addImage(coinImage);
    }
    

    @Override
    public void destroy()
    {
        super.destroy();
        Sounds.getCoinSound().play();
    }


}

