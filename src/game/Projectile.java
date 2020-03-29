package game;

import city.cs.engine.*;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;


// class for projectile fired by playable character
public class Projectile extends DynamicBody {
    private static final Shape spitShape = new PolygonShape(
            -0.088f,-0.194f, 0.048f,-0.194f, 0.16f,0.116f, 0.102f,0.168f, 0.036f,0.174f, -0.128f,0.042f, -0.154f,-0.1f);
    private static final BodyImage spitImage = new BodyImage("data/saliva.png");

    public Projectile(World world) {
        super(world, spitShape);
        addImage(spitImage);

    }


    @Override
    public void destroy()
    {
        super.destroy();
        Sounds.getSpitSound().play();
        Game.controlPanel1.levelUpdated();
    }
}
