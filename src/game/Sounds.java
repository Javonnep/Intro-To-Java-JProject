package game;

import city.cs.engine.SoundClip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Sounds {
    private static SoundClip bgm1;
    private static SoundClip bgm2;
    private static SoundClip bgm3;
    private static  SoundClip deathSound;
    private static SoundClip coinSound ;
    private static SoundClip branchSound ;
    private static SoundClip spitSound  ;
    private static ArrayList<SoundClip> sounds;

    static {
        try {
            bgm1 = new SoundClip("data/l1bgm.wav");
            bgm2 = new SoundClip("data/l2bgm.wav");
            bgm3 = new SoundClip("data/l3bgm.wav");
            deathSound = new SoundClip("data/oof.wav");
            coinSound = new SoundClip("data/bite.wav");
            branchSound = new SoundClip("data/branch.wav");
            spitSound = new SoundClip("data/Spit.wav");

        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    static {
        sounds = new ArrayList<>();
        sounds.add(bgm1);
        sounds.add(bgm2);
        sounds.add(bgm3);
        sounds.add(deathSound);
        sounds.add(coinSound);
        sounds.add(branchSound);
        sounds.add(spitSound);

    }

    public static SoundClip getBgm1(){
        return bgm1;
    }

    public static SoundClip getBgm2(){
        return bgm2;
    }

    public static SoundClip getBgm3(){
        return bgm3;
    }

    public static SoundClip getDeathSound() {
        return deathSound;
    }

    public static SoundClip getCoinSound() {
        return coinSound;
    }

    public static SoundClip getBranchSound() {
        return branchSound;
    }

    public static ArrayList<SoundClip> getSounds() {
        return sounds;
    }

    public static SoundClip getSpitSound() {
        return spitSound;
    }
}
