package game;

import city.cs.engine.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;


// class for green hay stack
public class ReducedGravityCoin extends StaticBody {
    private static final BodyImage coinImage = new BodyImage("data/heyGreen.png");
    private static final Shape coinShape = new PolygonShape(
            -0.56f, 0.5f, -0.564f, -0.498f, 0.564f, -0.5f, 0.56f, 0.493f);


    public ReducedGravityCoin(World world) {
        super(world, coinShape);
        addImage(coinImage);
    }

    @Override
    public void destroy()
    {
        Game.getControlPanel1().levelUpdated();
        Game.controlPanel1.levelUpdated();
        Sounds.getCoinSound().play();
        super.destroy();
    }
}
